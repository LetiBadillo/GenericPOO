/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;


import java.awt.List;
import java.util.ArrayList;
import static javafx.scene.input.KeyCode.T;


/**
 *
 * @author ASUS
 * @param <T>
 */
    public class gen <T> {
    private T t;
    private int temp;
    private ArrayList<T> lista = new ArrayList<T>(100);
  
   
   
   
    public void almacenarUltimoDisponible(T s){
        
        lista.add(s);
          
        }
    
    

    public void almacenarEnPosicion(int i, T e){
        lista.add(i, e);
    }

    public void devuelveAlmacenados(){
        
       try{
           System.out.println("Lista:");
        for (int i = 0; i <lista.size(); i++){
           t = lista.get(i);
           if(lista.get(i)!= null){
        System.out.println(" "+t);
           }
       }}
       catch (IndexOutOfBoundsException e){
           System.out.println("Error: "+e);
           
       }
    }
    public void devuelvePrimero(){
        t=lista.get(0);
        System.out.println("Primer registro "+t);
    }
    
    public void devuelveUltimo (){
        t=lista.get(lista.size()-1);
        System.out.println("Último registro: "+t);
    }
    public void pos(int i){
        System.out.println(" En la posición 1 está "+lista.get(1));
    }
}
