package menjacnica.transakcija;

/**
 * Apstraktna klasa za kupovinu deviza
 */

import menjacnica.alatke.Alatke;
import menjacnica.izuzeci.PogresanUnos;
import menjacnica.repozitorijum.Repozitorijum;

public abstract class ValutaDinari {
    
    private String ulaz;
    private double izlaz;
    private double vrednostValute;
    
    public ValutaDinari() {
    }
    
    public ValutaDinari(String ulaz, double izlaz, double vrednostValute) throws PogresanUnos {
        setUlaz(ulaz);
        this.izlaz = izlaz;
        this.vrednostValute = vrednostValute;
    }
    
    public String getUlaz() {
        return ulaz;
    }
    
    /**
     * Izbacuje izuzetak ukoliko korisnik pokusa da promeni vise ili jednako od 9000000 dinara
     * @param ulaz
     * @throws PogresanUnos 
     */
    public void setUlaz(String ulaz) throws PogresanUnos {
        if (Alatke.sadrziBrojeve(ulaz) && Integer.valueOf(ulaz) > 0 && Integer.valueOf(ulaz) < 9000000) {
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
        return "ValutaDinari{" + "ulaz=" + ulaz + ", izlaz=" + izlaz + ", vrednostValute=" + vrednostValute + '}';
    }

}
