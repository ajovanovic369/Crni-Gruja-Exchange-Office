package menjacnica.podaci.citanje;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import menjacnica.repozitorijum.Repozitorijum;

public class KursnaListaVrednost {
    
    /**
     * Ucitavanje izabrane vrednosti kursa valute iz datoteke, "datoteke/kursnalista.dat"
     * @param valuta
     * @param vrednost
     * @return 
     */
    public static double vrednostValute(int valuta, int vrednost) {

        BufferedReader br = null;
        List<String> listaKursna = new ArrayList<>();
        String[] temp_array = null;
        try {
            br = new BufferedReader(new FileReader(Repozitorijum.PODACI_CITANJE_PUTANJADATOTEKE));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                listaKursna.add(sCurrentLine);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                br.close();
                String temp_eu = listaKursna.get(valuta);
                temp_array = temp_eu.split("⭒");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return Double.valueOf(temp_array[vrednost].trim());
    }
}
