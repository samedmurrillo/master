/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author User
 */
public class Persona
    {
    // Campos de la clase
    public String codigo;
    public String nombre;
    public int edad;
    
    //Constructor de la clase
    public Persona()
    {
    
    }
    
    //métodos de la clase
    public  void establecerCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String obtenerCodigo()
    {
        return this.codigo;
    }
    
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }
    public String obtenerNombre()
    {
        return this.nombre;
    }
        
    public void establecerEdad(int edad) { 
        this.edad = edad;
    }
    public int obtenerEdad()
    {
        return this.edad;
    }
    
  }
