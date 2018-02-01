/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.ArrayList;

public class Vehiculos {

    private ArrayList<String> Marca = new ArrayList<>();

    private ArrayList<String> Matricula = new ArrayList<>();

    private ArrayList<String> Modelo = new ArrayList<>();

    private ArrayList<String> Color = new ArrayList<>();

    private ArrayList<Integer> Kilometro = new ArrayList<>(); 
    
    private ArrayList<String> OrdenararCoches = new ArrayList<>();
    
    private String CocheBuscado = " ";
    
    private int NumeroCoche;
    
    private boolean confirmar=false;
    Clientes C = new Clientes();
    
    
    
    public Vehiculos() {

        
        
        Marca.add("Opel");
        Marca.add("Citron");
        Marca.add("Ford");
        Marca.add("Seat");
        Marca.add("Mercedes");

        Modelo.add("Astra");
        Modelo.add("C4");
        Modelo.add("Fiesta");
        Modelo.add("Ibiza");
        Modelo.add("CLK");

        Matricula.add("F5f444E");
        Matricula.add("FT445EE");
        Matricula.add("FGT778S");
        Matricula.add("RR4545R");
        Matricula.add("DWE25E6");

        Color.add("Azul");
        Color.add("Blanco");
        Color.add("Plateado");
        Color.add("Blanco");
        Color.add("Rojo");

        Kilometro.add(200000);
        Kilometro.add(400000);
        Kilometro.add(800000);
        Kilometro.add(100000);
        Kilometro.add(300000);
    }

   /* public void OrdenarPropietario (){
        
    }*/
    public void Cambiar (String MatriculaCoche){
        
        for( int i = 0; i < Matricula.size(); i++){
            if ( Matricula.get(i).equalsIgnoreCase(MatriculaCoche)){
                CocheBuscado += Marca.get(i)+" ";
                CocheBuscado += Modelo.get(i)+" ";
                CocheBuscado += Color.get(i)+" ";
                NumeroCoche = i ;
                confirmar = true;  
            }
        }
    }
            
    public String ModeloCoche() {
        
        if( confirmar == true ){
            return "El coche es un " + CocheBuscado;
        }else{
            return "El coche selecionado no existe en la base de datos";
        }
    }

}
