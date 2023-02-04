package menjacnica.glavnimeni;

import java.util.Scanner;
import menjacnica.alatke.Alatke;
import menjacnica.podaci.citanje.KursnaListaStampanje;
import menjacnica.izuzeci.PogresanIzbor;
import menjacnica.repozitorijum.Repozitorijum;
import menjacnica.transakcija.transakcije.CHFDIN;
import menjacnica.transakcija.transakcije.DINCHF;
import menjacnica.transakcija.transakcije.DINEUR;
import menjacnica.transakcija.transakcije.DINGBP;
import menjacnica.transakcija.transakcije.DINUSD;
import menjacnica.transakcija.transakcije.EURDIN;
import menjacnica.transakcija.transakcije.GBPDIN;
import menjacnica.transakcija.transakcije.USDDIN;

public class GlavniMeni {

    public void glavniMenuUcitaj() {
        Scanner sk = new Scanner(System.in);
        System.out.println(Repozitorijum.GLAVNIMENI_POCETNITEKST);
        while (true) {
            try {
                String ulaz = sk.nextLine();
                izaberiOpciju(ulaz);
                switch (izaberiOpciju(ulaz)) {
                    /**
                     * Stampanje kursne liste
                     */
                    case "1":
                        System.out.println(Repozitorijum.GLAVNIMENI_KURSNALISTATEKST + Repozitorijum.ALATKE_DATUM);
                        System.out.println(KursnaListaStampanje.stampajKursnuListu());
                        Alatke.pritisniEnterDaNastavis();
                        glavniMenuUcitaj();
                        break;
                    /**
                     * Transakcija EUR->DIN
                     */
                    case "2":
                        EURDIN ed = new EURDIN();
                        ed.izvrsenjeTransakcije();
                        System.out.println(ed.prikazIzvrseneTransakcije());
                        System.out.println(ed.cuvanjeIzvrseneTransakcije());
                        break;
                    /**
                     * Transakcija DIN->EUR
                     */
                    case "3":
                        DINEUR de = new DINEUR();
                        de.izvrsenjeTransakcije();
                        System.out.println(de.prikazIzvrseneTransakcije());
                        System.out.println(de.cuvanjeIzvrseneTransakcije());
                        break;
                    /**
                     * Transakcija USD->DIN
                     */
                    case "4":
                        USDDIN ud = new USDDIN();
                        ud.izvrsenjeTransakcije();
                        System.out.println(ud.prikazIzvrseneTransakcije());
                        System.out.println(ud.cuvanjeIzvrseneTransakcije());
                        break;
                    /**
                     * Transakcija DIN->USD
                     */
                    case "5":
                        DINUSD du = new DINUSD();
                        du.izvrsenjeTransakcije();
                        System.out.println(du.prikazIzvrseneTransakcije());
                        System.out.println(du.cuvanjeIzvrseneTransakcije());
                        break;
                    /**
                     * Transakcija CHF->DIN
                     */
                    case "6":
                        CHFDIN cd = new CHFDIN();
                        cd.izvrsenjeTransakcije();
                        System.out.println(cd.prikazIzvrseneTransakcije());
                        System.out.println(cd.cuvanjeIzvrseneTransakcije());
                        break;
                    /**
                     * Transakcija DIN->CHF
                     */
                    case "7":
                        DINCHF dc = new DINCHF();
                        dc.izvrsenjeTransakcije();
                        System.out.println(dc.prikazIzvrseneTransakcije());
                        System.out.println(dc.cuvanjeIzvrseneTransakcije());
                        break;
                    /**
                     * Transakcija GBP->DIN
                     */
                    case "8":
                        GBPDIN gd = new GBPDIN();
                        gd.izvrsenjeTransakcije();
                        System.out.println(gd.prikazIzvrseneTransakcije());
                        System.out.println(gd.cuvanjeIzvrseneTransakcije());
                        break;
                    /**
                     * Transakcija DIN->GBP
                     */
                    case "9":
                        DINGBP dg = new DINGBP();
                        dg.izvrsenjeTransakcije();
                        System.out.println(dg.prikazIzvrseneTransakcije());
                        System.out.println(dg.cuvanjeIzvrseneTransakcije());
                        break;
                    /**
                     * Izlaz iz aplikacije
                     */
                    case "10":
                        System.out.println(Repozitorijum.GLAVNIMENI_DOVIDJENJA);
                        break;
                }
                break;

            } catch (PogresanIzbor ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    /**
     * Provera validnosti unesene vrednosti
     * @param opcija
     * @return
     * @throws PogresanIzbor 
     */
    public static String izaberiOpciju(String opcija) throws PogresanIzbor {

        if (opcija.equals("1") || opcija.equals("2") || opcija.equals("3") || opcija.equals("4") || opcija.equals("5") || opcija.equals("6") || opcija.equals("7") || opcija.equals("8") || opcija.equals("9") || opcija.equals("10")) {
            return opcija;
        } else {
            throw new PogresanIzbor(Repozitorijum.IZUZECI_POGRESANIZBOR);
        }
    }
}
