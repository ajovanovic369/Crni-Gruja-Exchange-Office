package menjacnica.transakcija;

/**
 * Apstraktna klasa za prodaju deviza
 */

import menjacnica.alatke.Alatke;
import menjacnica.izuzeci.PogresanUnos;
import menjacnica.repozitorijum.Repozitorijum;

public abstract class ValutaDevize {

    private String ulaz;
    private double izlaz;
    private double vrednostValute;

    public ValutaDevize() {
    }

    public ValutaDevize(String ulaz, double izlaz, double vrednostValute) throws PogresanUnos {
        setUlaz(ulaz);
        this.izlaz = izlaz;
        this.vrednostValute = vrednostValute;
    }

    public String getUlaz() {
        return ulaz;
    }
    
    /**
     * Izbacuje izuzetak ukoliko korisnik pokusa da promeni vise ili jednako od 70000 deviza
     * @param ulaz
     * @throws PogresanUnos 
     */
    public void setUlaz(String ulaz) throws PogresanUnos {
        if (Alatke.sadrziBrojeve(ulaz) && Integer.valueOf(ulaz) > 0 && Integer.valueOf(ulaz) < 70000) {
            this.ulaz = ulaz;
        } else {
            throw new PogresanUnos(Repozitorijum.IZUZECI_POGRESANUNOS);
        }
    }

    public double getIzlaz() {
        return izlaz;
    }

    public void setIzlaz(double izlaz) {
        this.izlaz = izlaz;
    }

    public double getVrednostValute() {
        return vrednostValute;
    }

    public void setVrednostValute(double vrednostValute) {
        this.vrednostValute = vrednostValute;
    }

    @Override
    public String toString() {
        return "ValutaDevize{" + "ulaz=" + ulaz + ", izlaz=" + izlaz + ", vrednostValute=" + vrednostValute + '}';
    }
    
}
