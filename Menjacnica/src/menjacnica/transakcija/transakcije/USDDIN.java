package menjacnica.transakcija.transakcije;

/**
 * Transakcija USD->DIN
 */
import java.util.Scanner;
import menjacnica.izuzeci.PogresanUnos;
import menjacnica.podaci.citanje.KursnaListaVrednost;
import menjacnica.podaci.pisanje.CuvanjeTransakcije;
import menjacnica.repozitorijum.Repozitorijum;
import menjacnica.transakcija.Transakcija;
import menjacnica.transakcija.ValutaDevize;
import menjacnica.transakcija.Valute;

public class USDDIN extends ValutaDevize implements Transakcija {

    public USDDIN() {
    }

    public USDDIN(String ulaz, double izlaz, double vrednostValute) throws PogresanUnos {
        super(ulaz, izlaz, vrednostValute);
    }

    /**
     * Procesuiranje transakcije
     *
     * @return
     */
    @Override
    public double izvrsenjeTransakcije() {
        Scanner sk = new Scanner(System.in);
        System.out.println(Repozitorijum.TRANSAKCIJE_TEKST01);
        while (true) {
            try {
                setVrednostValute(KursnaListaVrednost.vrednostValute(2, 1));
                setUlaz(sk.nextLine());
                setIzlaz(Double.parseDouble(getUlaz()) * getVrednostValute());
                break;

            } catch (PogresanUnos ex) {
                System.out.println(ex.getMessage());
            }
        }
        return getIzlaz();
    }

    /**
     * Stampanje izvrsene transakcije
     *
     * @return
     */
    @Override
    public String prikazIzvrseneTransakcije() {
        return (Repozitorijum.TRANSAKCIJE_TEKST02 + getIzlaz() + " " + Valute.DIN + " " + Repozitorijum.TRANSAKCIJE_TEKST03 + getUlaz() + " " + Valute.USD);
    }

    /**
     * Cuvanje izvrsene transakcije
     *
     * @return
     */
    @Override
    public String cuvanjeIzvrseneTransakcije() {
        CuvanjeTransakcije ct = new CuvanjeTransakcije();
        ct.setTekstTransakcije(prikazIzvrseneTransakcije());
        ct.upisiTransakcijuUDatoteku();
        return (Repozitorijum.TRANSAKCIJE_TEKST04);
    }

}
