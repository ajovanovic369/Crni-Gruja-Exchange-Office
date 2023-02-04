package menjacnica.pozdravnimeni.prijavljivanje;

import java.util.Scanner;
import menjacnica.glavnimeni.GlavniMeni;
import menjacnica.izuzeci.PogresanUnos;
import menjacnica.repozitorijum.Repozitorijum;

public class Prijavljivanje {

    public Prijavljivanje() {

        Scanner sk = new Scanner(System.in);
        System.out.println(Repozitorijum.PRIJAVLJIVANJE_IZBOR);
        while (true) {
            try {
                /**
                 * basic simulacija unosenja passworda, uporedjivanje stringa sa
                 * stringom
                 */
                String ulaz = sk.nextLine();
                izaberiOpciju(ulaz);
                if (izaberiOpciju(ulaz).equals(Repozitorijum.PRIJAVLJIVANJE_SIFRA)) {
                    GlavniMeni gm = new GlavniMeni();
                    gm.glavniMenuUcitaj();
                    break;
                }

            } catch (PogresanUnos ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    /**
     * Provera validnosti unesene vrednosti
     * @param opcija
     * @return
     * @throws PogresanUnos 
     */
    public static String izaberiOpciju(String opcija) throws PogresanUnos {

        if (opcija.equals("user")) {
            return opcija;
        } else {
            throw new PogresanUnos(Repozitorijum.IZUZECI_POGRESANUNOS);
        }
    }
}
