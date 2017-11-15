/*
 * ******************************************************************
 *                  RBS 2017 - Java base: classe pila.
 * ******************************************************************
 * 
 * L'esempio che segue implementa una classe base che rappresenta u
 */

package stack;

public class PilaBase {

    private static final String INSERIMENTO_OK = "OK";
    private static final String PILA_PIENA = "Impossibile inserire nuovi elementi, pila piena";
    private static final String PILA_VUOTA = "Impossibile estrarre un elemento, pila vuota";

    private int dimensione = 10;
    private int[] contenitore;
    private int index = 0;
    private String messaggio = null;

    public PilaBase() {
        contenitore = new int[10];
    }

    public void aggiungiElemento(int valore) {
        if (index < contenitore.length) {
            contenitore[index] = valore;
            index++;
        }
    }

    public int richiamaElemento() {
        int resp = 0;
        if (index > 0) {
            resp = contenitore[index];
            index--;
            return resp;
        } else {
            throw new IndexOutOfBoundsException("Stack empty");
        }
    }
}
