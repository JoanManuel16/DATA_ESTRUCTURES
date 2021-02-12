/**
 * version JDK 11.0.10
 * @author gendry gonzalez collazo
 */

public class Sololearn_Projects {
    
    /*
    * Metodo calcular la suma de dinero restante despues de 6 meses
    * devolviendo un 10% mensualmente 
    */
    public static int Calcular_Prestamo(int prestamo){
        int counter =0;          //variable contadora del ciclo while
        int aux=prestamo;        //variable auxiliar para almacenar la cantidad y el resultado finalmente
        while(counter < 6){      //6 ciclos
            aux-=(aux*0.1);      //multiplicacion  de la variable (10% = 1/10 = 0.1)
            counter++;           //incremento
    }
        return aux;
        
    }
    /*
     *Metodo para invertir una cadena de texto con el uso de ciclo for
     *y variable auxiliar
     */
    public static String Invertir_Cadena(String cadena){
        char [] chain =cadena.toCharArray();           //convierte en char array el string
        char [] r_chain=new char[chain.length];        //crea un char array de longitud de la cadena dada
        int aux = 0;                                   //variable auxiliar
        String finalSt="";
        
        for (int i = cadena.length(); i > 0 ; i--) {   //ciclo for donde i = longitud de la cadena dada
            r_chain[aux]=chain[(i-1)];                 //cambio de la ultima posicion de la cadena a el primero del array resultante
            finalSt+=r_chain[aux];                     //String final
            aux++;                                     //aumento del auxiliar
            
        }
        return finalSt;                            //conversion a string
            }
    /*
     *Metodo de conversion a binario de un entero y lo devuelve
     *como cadena de texto
     */
    public static String Convertir_Binario(int noBinary){
        String binary=Integer.toBinaryString(noBinary);
        return binary;
    }
    
    /*
     *
     */
}
