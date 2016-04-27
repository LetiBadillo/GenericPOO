/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Generic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    persona p = new persona();
    gen g= new gen();
    p.setNombre("Leti");
    p.setEdad(21);
    p.setSexo("F");
    String s = "Cadena de tipo String";
    int i= 12;
    float f= 12345434;
    g.almacenarUltimoDisponible(f);//float
    g.almacenarUltimoDisponible(i); //Integer
    g.almacenarUltimoDisponible(p.getNombre()); //clase persona
    g.almacenarUltimoDisponible(s); //String
    g.almacenarEnPosicion(4, p.getSexo()); //variable de clase persona
    g.devuelveAlmacenados();
    System.out.println("----");
    g.devuelvePrimero();
    g.devuelveUltimo();
    System.out.println("----");
    
    }   
}
