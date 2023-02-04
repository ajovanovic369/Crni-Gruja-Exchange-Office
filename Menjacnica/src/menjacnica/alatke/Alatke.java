package menjacnica.alatke;

import java.io.IOException;
import menjacnica.repozitorijum.Repozitorijum;

public class Alatke {
    
    /**
     * Ceka korisnikov input za nastavak
     */
    public static void pritisniEnterDaNastavis() {

        System.out.println(Repozitorijum.ALATKE_PRITISNIENTERDANASTAVIS);
        try {
            System.in.read();
        } catch (IOException e) {
        }
    }
    
    /**
     * Proverava da li sadrzi brojeve
     * @param str
     * @return 
     */
    public static boolean sadrziBrojeve(String str) {

        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
