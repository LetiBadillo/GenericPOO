/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author ASUS
 */
public class persona extends gen{
    /*Crea una clase Persona con atributos privados:
 Nombre, edad, sexo.
 y métodos get y set para cada uno.*/
    
    private String nombre;
    private int edad;
    private String sexo;
    

   public void setNombre(String nombre){
   this.nombre=nombre;
   }
   public String getNombre(){
   return this.nombre;
   }
    public void setEdad(int edad){
   this.edad=edad;
   }
   public int getEdad(){
   return this.edad;
   }
    public void setSexo(String sexo){
   this.sexo=sexo;
   }
   public String getSexo(){
   return this.sexo;
   }
}
