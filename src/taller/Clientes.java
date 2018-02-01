/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1a07
 */
public class Clientes {
    
   private ArrayList<String> Nombre = new ArrayList<>();
    
   private ArrayList<String> Telefono = new ArrayList<>();
    
   private ArrayList<String> DNI = new ArrayList<>();
    
   private ArrayList<String> Fecha = new ArrayList<>();
    
   private ArrayList<Integer> NumeroTaller = new ArrayList<>();
   
   private String ClienteBuscado;
   
   private String TelefonoCliente;
   
   private int NumeroCliente;
   
   private boolean confirmar = false;
   
   private String NuevoNombre, NuevoTelefono,NuevoDNI, NuevaFecha;
   
   private int NuevoNuemroTaller;
   
   
  
    
    public Clientes(){
        
        Nombre.add(0,"Ach");
        Nombre.add(1,"Isma");
        Nombre.add(2,"David");
        Nombre.add(3,"Alex");
        Nombre.add(4,"Luis");
        
        NumeroTaller.add(1);
        NumeroTaller.add(2);
        NumeroTaller.add(1);
        NumeroTaller.add(1);
        NumeroTaller.add(2);
        
        Telefono.add(0,"669-987-321");
        Telefono.add(1,"669-987-321");
        Telefono.add(2,"452-987-987");
        Telefono.add(3,"987-984-321");
        Telefono.add(4,"698-987-321");
        
        DNI.add(0,"43192044-E");
        DNI.add(1,"45639559-R");
        DNI.add(2,"48877563-E");
        DNI.add(3,"47885693-R");
        DNI.add(4,"41236589-P");
        
        Fecha.add(0,"02/05/2014");
        Fecha.add(1,"03/06/2012");
        Fecha.add(2,"06/07/2014");
        Fecha.add(3,"09/01/2009");
        Fecha.add(4,"09/08/2003");
        
    }
    public void Cambiar(String NombreClientes){ //SETTER
        for ( int i = 0; i < Nombre.size();i++){
            if (Nombre.get(i).equalsIgnoreCase(NombreClientes)){
                ClienteBuscado = Nombre.get(i);
                TelefonoCliente = Telefono.get(i);
                NumeroCliente= i;
                confirmar= true;
            }
        }
    }
    public String InformacionClientes(){ //GETTER
        if ( confirmar == true){
        return "Nº" + NumeroCliente+ " \n"+
                "El propietario del coche es " + ClienteBuscado + "\n"
                + "nuemro de telefono " + TelefonoCliente;
        }else{
        return "\n El cliente no existe \n\n * Quieres crear un nuevo cliente?"
                    + "\n 1.-Si \n 2.-No";
        }
    }
    
    public void NuevoCliente(int RespuestaNuevoCliente){ //SETTER
        if (RespuestaNuevoCliente == 1){
           NuevoNombre = JOptionPane.showInputDialog("Introduce el nombre del cliente nuevo:");
           NuevoDNI = JOptionPane.showInputDialog("Introduce un DNI:");
           NuevoTelefono = JOptionPane.showInputDialog("Introduce un telefono de comtacto:");
           NuevaFecha = JOptionPane.showInputDialog("Introduce una fecha de entrada");
           NuevoNuemroTaller = Integer.parseInt(JOptionPane.showInputDialog("Iny¡troduce un numero de taller 1 o 2:"));
        }
    }
    
    public String NuevoCliente(){ //GETTER
        return "El nombre del cliente es : " +NuevoNombre+
                "\n con un DNI :" + NuevoDNI+
                "\n con un telefono :" + NuevoTelefono +
                "\n fecha de inscripcion :" + NuevaFecha +
                "\n numero de taller en el que se encuantar :" + NuevoNuemroTaller;
    }
            
    public int ClientesId(){ // GETTER

        return NumeroCliente;
    }
    
}
