package menjacnica.podaci.pisanje;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import menjacnica.repozitorijum.Repozitorijum;

public class CuvanjeTransakcije {
    
    private String tekstTransakcije;

    public CuvanjeTransakcije() {
    }

    public void setTekstTransakcije(String tekstTransakcije) {
        this.tekstTransakcije = tekstTransakcije;
    }

    /**
     * Upisivanje izvrsene transakcije u datoteku, "datoteke/transakcije/"
     */
    public void upisiTransakcijuUDatoteku(){
    
        try {
            PrintWriter upisi = new PrintWriter(Repozitorijum.PODACI_PISANJE_PUTANJADATOTEKE + Repozitorijum.PODACI_PISANJE_NASLOVDATOTEKE + Repozitorijum.ALATKE_DATUM + Repozitorijum.PODACI_PISANJE_EKSTENZIJADATOTEKE, Repozitorijum.PODACI_PISANJE_KODIRANJEDATOTEKE);
            upisi.print(tekstTransakcije);
            upisi.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }

}
