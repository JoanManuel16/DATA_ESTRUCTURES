
package candado;

import java.util.Scanner;

/**
 *
 * @author Joan Manuel
 */
public class main {
    public static void main(String args []) {
        Candado c= new Candado("1234");
        Scanner k = new Scanner (System.in);
        System.out.println(c.estado());
        System.out.println(c.abrir("1234"));
        System.out.println(c.estado());
        c.cerrar();
        System.out.println(c.cambiarContrasenna("12", "1234"));
    }
}
