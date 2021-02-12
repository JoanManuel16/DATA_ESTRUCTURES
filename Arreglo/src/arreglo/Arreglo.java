/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

/**
 *
 * @author Joan Manuel
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Arreglo_n A = new Arreglo_n();
      A.insertar_inicio("A");
      A.insertar_inicio("B");
      A.insertar_final("Z");
      A.insertar_final("Y");
      A.insertar_inicio("C");
      A.imprimir();
      
      A.insertar_posicion("culo", 4);
      A.imprimir();
    }
    
}
