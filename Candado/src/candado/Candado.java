/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candado;

/**
 *
 * @author Joan Manuel
 */
public class Candado {
   private String key;
   private boolean estado;
   public Candado(String key){
      this.key=key;
      estado=false;
   }
   public boolean estado(){
   return estado;
   }
   public void cerrar(){
   estado= false;
   }
   public boolean abrir(String key){
       if(this.key.equals(key)){
       estado=true;
       return true;
       }
   return false;
   }
   public boolean cambiarContrasenna(String nueva, String vieja){
       if(vieja.equals(key)){
       key=nueva;
       return true;
       }
       return false;
   
   }
}
