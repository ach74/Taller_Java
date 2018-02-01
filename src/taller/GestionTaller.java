/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.ArrayList;

/**
 *
 * @author dam1a07
 */
public class GestionTaller {

    ArrayList<Integer> Codigo = new ArrayList<>();
            
    ArrayList<String> Name = new ArrayList<>();
    
    ArrayList<String> Dirrecion = new ArrayList<>();
    
    ArrayList<String> Telefono = new ArrayList<>();
    

    public GestionTaller() {
       
        
            
        Codigo.add(1);
        Codigo.add(2);
        
        Name.add("Taller A");
        Name.add("Taller B");
        
        Dirrecion.add("C/ MisCojones");
        Dirrecion.add("C/ ElDeAbajo");
        
        Telefono.add("987456321");
        Telefono.add("963852741");

    }

       
}
