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
public class Arreglo_n {
    private String Arr[];
    private int act_pos;
    public Arreglo_n(){
        Arr = new String[1];
        act_pos=0;
    }
    
    private void aumentar_arreglo(){
        String Arr2[] = new String[Arr.length*2];
            for(int i = 0; i < Arr.length;i++){
                Arr2[i] = Arr[i];
            }
            Arr = Arr2;
    }
    
    public void insertar_final(String S){
        if(act_pos == Arr.length-1){
            aumentar_arreglo();
        }
        Arr[act_pos] = S;
        act_pos++;
    }
    
    public void insertar_inicio(String S){
        if(act_pos == Arr.length-1){
            aumentar_arreglo();
        }
        String A = S;
        for(int i = 0; i < act_pos;i++){
            String B = Arr[i];
            Arr[i] = A;
            A = B;
        }
        Arr[act_pos] = A;
        act_pos++;
    }
    
    public void imprimir(){
        System.out.println("Arreglo_inicio");
        for(int i = 0; i < act_pos; i++){
            System.out.println(Arr[i]);
        }
        System.out.println("Arreglo_final");
    }
    
    
    public void borrar(int pos){
        if((pos-1) >= act_pos && (pos-1) <= 0){
            return;
        }
        String Arr2[] = new String[Arr.length];
        int cont = 0;
        for(int i = 0; i < act_pos;i++){
            if(i != (pos-1)){
               Arr2[cont] = Arr[i];
               cont++;
            }
        }
        Arr = Arr2;
        act_pos--;
    }
    public void insertar_posicion(String elemnto,int pos){
    if((pos-1)==0){
        insertar_inicio(elemnto);
        return;
    }
    if((pos-1)==act_pos){
        insertar_final(elemnto);
        return;
    }
    if((pos-1) >= act_pos && (pos-1) <= 0){
            return;
        }
    
    else{
        String Arr2[] = new String[Arr.length];
        int cont = 0;
        for(int i = 0; i < act_pos;i++){
            if(i == (pos-1)){
               Arr2[cont] = elemnto;
               cont++;
               Arr2[cont]=Arr[i];
               cont++;
            }
            else{
            Arr2[cont]=Arr[i];
            cont++;
            }
            
        }
        Arr = Arr2;
        act_pos++;
        }
    }
    }

