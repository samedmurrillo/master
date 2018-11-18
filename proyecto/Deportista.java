/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Deportista extends Persona
    {
    public String deporte;
    public String pocision;
    public Deportista()
    {
        establecerCodigo("B2018");
        establecerNombre("Tahmar Rosibel Ramos ");
        establecerEdad(20);
        establecerDeporte("FootBall");
        establecerPocision("Defensa");
    }
    
    //imprime la informacion
    public void imprimirInfo()
    {
     JOptionPane.showMessageDialog(null,"Codigo: "+codigo+"\n"+
                                        "Nombre: "+nombre+"\n"+
                                        "Edad: "+edad+"\n"+
                                        "Deporte : "+deporte+"\n"+
                                        "Posicion "+pocision);
    }
    //métodos de la clase
    public void establecerDeporte(String deporte) {
        this.deporte = deporte;
    }
    public String obtenerDeporte()
    {
        return this.deporte;
    }
    
    public void establecerPocision(String pocision) {
        this.pocision = pocision;
    }
    public String obtenerPocision()
    {
        return this.pocision;
    }

    }
