package menjacnica.izuzeci;

public class PogresanIzbor extends Exception{
    /**
     * Izuzetak za nevalidnu opciju
     * @param message 
     */
    public PogresanIzbor(String message) {
        super(message);
    }
}
