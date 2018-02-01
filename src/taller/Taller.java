/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1a07
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int a,b;
        
        Clientes C = new Clientes();
        
        GestionTaller G = new GestionTaller();
        
        Vehiculos V = new Vehiculos();
        
        
        System.out.println("Que desea: \n 1.- Saber info. de un cliente. \n 2.- Saber info. de un vehiculo.");
        
        
        
        a = teclado.nextInt();
        
        if (a==1){
            System.out.println("Ha elegido saber info. de un cliente");
            
            C.Cambiar(JOptionPane.showInputDialog("Introduce un nombre"));
            
            System.out.println(C.InformacionClientes());
            
            b=teclado.nextInt();
            
            C.NuevoCliente(b);
            
            System.out.println("El nuevo cliente es " + C.NuevoCliente());
        }
        else if (a==2){  
            System.out.println("Ha elegido saber info. de un vehiculo");
            
            V.Cambiar(JOptionPane.showInputDialog("Introduce un matricula"));
            
            System.out.println(V.ModeloCoche());
            
        }
        else{
            System.out.print("No ha elegido una opcion disponible.");
        }
    }
}
