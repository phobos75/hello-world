/*
 * ******************************************************************
 *                  RBS 2017 - Java base: classe pila.
 * ******************************************************************
 * 
 * L'esempio che segue implementa una classe base che rappresenta u
 */

package stack;

public class PilaBase2 {

    private int[] contenitore;
    private int index = 0;


    public PilaBase2() {
        contenitore = new int[5];
    }

    public void aggiungiElemento(int valore) {
		if (! valore instanceof Integer) return;
        if (index < contenitore.length) {
            contenitore[index] = valore;
            index++;
        }
    }

    public int rimuoviElemento() {
        int resp = 0;
        if (index > 0) {
            resp = contenitore[index];
            index--;
            return resp;
        } else {
            throw new IndexOutOfBoundsException("Stack empty");
        }
    }

    public static void main(String[] args) {
        PilaBase pila = new PilaBase();
        pila.aggiungiElemento(5);
        pila.aggiungiElemento(6);
        pila.aggiungiElemento(99);
        pila.aggiungiElemento(2);
        pila.aggiungiElemento(77);
        pila.aggiungiElemento(0);
        pila.aggiungiElemento(888);
        pila.aggiungiElemento(999);
        pila.aggiungiElemento(777);

        pila.rimuoviElemento();

		System.out.println("elaborazione Terminata correttamente!");
        System.exit(0);
    }

}
