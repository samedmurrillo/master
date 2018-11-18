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
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Estudiante extends Persona
    {
    public String grado;
    public String clase;
    public Estudiante()
    {
        establecerCodigo("A2018");
        establecerNombre("Alexande Scott Aleman ");
        establecerEdad(18);
        establecerGrado("Noveno");
        establecerClase("Matematicas");
    }
    
    //imprime la informacion
    public void imprimirInfo()
    {
     JOptionPane.showMessageDialog(null,"Codigo: "+codigo+"\n"+
                                        "Nombre: "+nombre+"\n"+
                                        "Edad: "+edad+"\n"+
                                        "Grado : "+grado+"\n"+
                                        "Clase "+clase);
    }
    //métodos de la clase
    public void establecerGrado(String grado) {
        this.grado = grado;
    }
    public String obtenerGrado()
    {
        return this.grado;
    }
    
    public void establecerClase(String clase) {
        this.clase = clase;
    }
    public String obtenerClase()
    {
        return this.clase;
    }

    }


