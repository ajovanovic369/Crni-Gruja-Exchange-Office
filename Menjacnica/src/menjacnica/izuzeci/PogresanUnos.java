package menjacnica.izuzeci;

public class PogresanUnos extends Exception{
    
    /**
     * Izuzetak za nevalidan unos
     * @param message 
     */
    public PogresanUnos(String message) {
        super(message);
    }
    
}
