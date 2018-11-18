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
public class Principal
{
    public static void main(String args[])
    {
        Deportista d = new Deportista();
        Estudiante e = new Estudiante();
        
        d.imprimirInfo();
        e.imprimirInfo();
    }
    
}
