package menjacnica.pozdravnimeni;

import java.util.Scanner;
import menjacnica.alatke.Alatke;
import menjacnica.izuzeci.PogresanIzbor;
import menjacnica.pozdravnimeni.oaplikaciji.OAplikaciji;
import menjacnica.pozdravnimeni.prijavljivanje.Prijavljivanje;
import menjacnica.repozitorijum.Repozitorijum;

public class PozdravniMeni {

    public void pozdravniLogo() {
        System.out.println(Repozitorijum.POZDRAVNIEKRAN_LOGO);
    }

    public void pozdravniEkran() {

        Scanner sk = new Scanner(System.in);
        System.out.println(Repozitorijum.POZDRAVNIEKRAN_DOBRODOSLICA);

        while (true) {
            try {
                String ulaz = sk.nextLine();
                izaberiOpciju(ulaz);
                switch (izaberiOpciju(ulaz)) {
                    /**
                     * upucuje na login screen
                     */
                    case "1":
                        Prijavljivanje p = new Prijavljivanje();
                        break;
                    /**
                     * upucuje na info o aplikaciji
                     */
                    case "2":
                        OAplikaciji.ucitajViseOAplikaciji();
                        Alatke.pritisniEnterDaNastavis();
                        pozdravniEkran();
                        break;
                    /**
                     * izlaz iz aplikacije
                     */
                    case "3":
                        System.out.println(Repozitorijum.POZDRAVNIEKRAN_DOVIDJENJA);
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

        if (opcija.equals("1") || opcija.equals("2") || opcija.equals("3")) {
            return opcija;
        } else {
            throw new PogresanIzbor(Repozitorijum.IZUZECI_POGRESANIZBOR);
        }
    }
}
