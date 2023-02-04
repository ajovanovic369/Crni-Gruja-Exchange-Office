package menjacnica.podaci.citanje;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import menjacnica.repozitorijum.Repozitorijum;

public class KursnaListaStampanje {
    
    /**
     * Ucitavanje iz datoteke, stampanje i formatiranje kursne liste, "datoteke/kursnalista.dat"
     * @return 
     */
    public static String stampajKursnuListu(){
        BufferedReader br = null;
        List<String> listaKursna = new ArrayList<>();
        String kursnaLista = null;
        try {
            br = new BufferedReader(new FileReader(Repozitorijum.PODACI_CITANJE_PUTANJADATOTEKE));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                listaKursna.add(sCurrentLine + Repozitorijum.PODACI_CITANJE_NOVIRED + Repozitorijum.PODACI_CITANJE_IVICA + Repozitorijum.PODACI_CITANJE_NOVIRED);
                kursnaLista = listaKursna.toString()
                        .replace(",", "")
                        .replace("[", "")
                        .replace("]", "")
                        .replace(" ", "  ")
                        .replace("⭒", "   ")
                        .trim();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return kursnaLista;
    }
}
