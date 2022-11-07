/*
 * ******************************************************************
 *                  RBS 2017 - Java base: classe pila.
 * ******************************************************************
 * 
 * L'esempio che segue implementa una classe base che rappresenta u
 */

package stack;

public class PilaBase {

    private int[] contenitore;
    private int index = 0;


    public PilaBase() {
        contenitore = new int[5];
    }
    
    public void metodoStupido(){}

    public void aggiungiElemento(int valore) {
        if (index < contenitore.length) {
            contenitore[index] = valore;
            index++;
        }
        else {
            System.out.println("impossibile, contenitore pieno");
        }
    }

    public int rimuoviElemento() {
        int resp = 0;
        if (index > 0) {
            resp = contenitore[index-1];
            index--;
            return resp;
        } else {
            throw new IndexOutOfBoundsException("Stack empty");
        }
    }

    public static void main(String[] args) {
        System.out.println("hallo world");
        PilaBase pila = new PilaBase();
        pila.aggiungiElemento(5);
        pila.aggiungiElemento(6);
        pila.aggiungiElemento(99);
        pila.aggiungiElemento(2);
        pila.aggiungiElemento(77);
        pila.aggiungiElemento(0);
        pila.aggiungiElemento(88);
        pila.aggiungiElemento(44);

        System.out.println(pila.rimuoviElemento());

        System.exit(0);
    }
}
