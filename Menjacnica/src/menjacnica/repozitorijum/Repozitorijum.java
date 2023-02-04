package menjacnica.repozitorijum;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Repozitorijum {

    /**
     * Alatke
     */
    public static final String ALATKE_PRITISNIENTERDANASTAVIS = "Pritisnite ENTER da nastavite...";
    public static final String ALATKE_DATUM = new SimpleDateFormat("dd.MM.yyyy HH-mm-ss").format(Calendar.getInstance().getTime());
    /**
     * PozdravniMeni
     */
    public static final String POZDRAVNIEKRAN_DOBRODOSLICA = "Dobrodosli u Menjacnicu - Crni Gruja.\nMolim Vas izaberite jednu od opcija.\n➥ 1. Logovanje u aplikaciju\n➥ 2. O aplikaciji\n➥ 3. Izadji iz aplikacije";
    public static final String POZDRAVNIEKRAN_DOVIDJENJA = "Menjacnica Crni Gruja zeli Vam prijatan dan.";
    /**
     * OAplikaciji
     */
    public static final String OAPLIKACIJI_TEKST = "\nCS101 Projekat\nMenjacnica - Crni Gruja\nAleksandar Jovanovic 5291\nNapravljeno - Januar 2022\n";
    /**
     * Prijavljivanje
     */
    public static final String PRIJAVLJIVANJE_IZBOR = "\n👉 hint sifra: user 👈\nMolim Vas unesite sifru za pristup sistemu menjacnice:";
    public static final String PRIJAVLJIVANJE_SIFRA = "user";
    /**
     * Izuzeci
     */
    public static final String IZUZECI_POGRESANIZBOR = "Molim Vas izaberite validnu opciju!";
    public static final String IZUZECI_POGRESANUNOS = "Unesena vrednost nije validna, pokusajte ponovo!";
    /**
     * GlavniMeni
     */
    public static final String GLAVNIMENI_POCETNITEKST
            = "\nPrijavljivanje uspesno!"
            + "\nMolim Vas izaberite jednu od opcija:"
            + "\n➥ 1. Prikazivanje kursne liste"
            + "\n➥ 2. Transakcija EUR ➟ DIN"
            + "\n➥ 3. Transakcija DIN ➟ EUR"
            + "\n➥ 4. Transakcija USD ➟ DIN"
            + "\n➥ 5. Transakcija DIN ➟ USD"
            + "\n➥ 6. Transakcija GBP ➟ DIN"
            + "\n➥ 7. Transakcija DIN ➟ GBP"
            + "\n➥ 8. Transakcija CHF ➟ DIN"
            + "\n➥ 9. Transakcija DIN ➟ CHF"
            + "\n➥10. Izadji iz aplikacije";
    public static final String GLAVNIMENI_DOVIDJENJA = "Menjacnica Crni Gruja zeli Vam prijatan dan.";
    public static final String GLAVNIMENI_KURSNALISTATEKST = "Kursna lista na dan: ";
    /**
     * Podaci - Citanje
     */
    public static final String PODACI_CITANJE_PUTANJADATOTEKE = "src/datoteke/kursnalista.dat";
    public static final String PODACI_CITANJE_NOVIRED = "\r\n";
    public static final String PODACI_CITANJE_IVICA = "▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬";
    /**
     * Podaci - Pisanje
     */
    public static final String PODACI_PISANJE_PUTANJADATOTEKE = "src/datoteke/transakcije/";
    public static final String PODACI_PISANJE_EKSTENZIJADATOTEKE = ".txt";
    public static final String PODACI_PISANJE_KODIRANJEDATOTEKE = "UTF-8";
    public static final String PODACI_PISANJE_NASLOVDATOTEKE = "Transakcija ";
    /**
     * Transakcija -> Transakcije
     */
    public static final String TRANSAKCIJE_TEKST01 = "Unesite sumu koju hocete da prometine:";
    public static final String TRANSAKCIJE_TEKST02 = "Transakcija uspesna!\nIsplatiti sledeci iznos: ";
    public static final String TRANSAKCIJE_TEKST03 = "za sledecu sumu: ";
    public static final String TRANSAKCIJE_TEKST04 = "Transakcija uspesno sacuvana!";
    /**
     * Logo
     */
    public static final String POZDRAVNIEKRAN_LOGO
            = "\n  .oooooo.                         o8o         .oooooo.                             o8o           \n"
            + " d8P'  `Y8b                        `\"'        d8P'  `Y8b                            `\"'           \n"
            + "888          oooo d8b ooo. .oo.   oooo       888           oooo d8b oooo  oooo     oooo  .oooo.   \n"
            + "888          `888\"\"8P `888P\"Y88b  `888       888           `888\"\"8P `888  `888     `888 `P  )88b  \n"
            + "888           888      888   888   888       888     ooooo  888      888   888      888  .oP\"888  \n"
            + "`88b    ooo   888      888   888   888       `88.    .88'   888      888   888      888 d8(  888  \n"
            + " `Y8bood8P'  d888b    o888o o888o o888o       `Y8bood8P'   d888b     `V88V\"V8P'     888 `Y888\"\"8o \n"
            + "                                                                                    888           \n"
            + "                                                                                .o. 88P           \n"
            + "                                                                                `Y888P            ";
    public static final String OAPLIKACIJI_LOGO
            = "::::###:::::::::::##:\n"
            + "::'## ##::::::::: ##:\n"
            + ":'##:. ##:::::::: ##:\n"
            + ":##:::. ##::::::: ##:\n"
            + ":#########::##::: ##:\n"
            + ":##.....##::##::: ##:\n"
            + ":##:::::##:::#######:\n"
            + ":::::::::::::::::::::";
}
