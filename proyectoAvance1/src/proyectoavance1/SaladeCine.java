/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoavance1;

/**
 *
 * @author Jimena
 */
public class SaladeCine {
    //Creamos la informacion de las salas de cine
    
   //Atributos de la sala de cine
    private String nombrepeli;
    private Asiento[][] asientos;
    
    
    //Metodos
    public SaladeCine(String nombrepeli, int filas, int columnas){
        this.nombrepeli = nombrepeli;
        asientos = new Asiento[filas][columnas];
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                asientos[i][j] = new Asiento();
              
            }
            
        }
        
    }
    public String getNombrePeli(){return nombrepeli;}
    public void setNombrePeli (String nombre) {this.nombrepeli = nombre;}
    public Asiento[][] getAsientos() {return asientos;}
    
    
    
    //Codigo para mostrar la interfaz grafica de los asientos
    public void mostrarAsientos(){
        System.out.println("Pelicula:" +nombrepeli);
        System.out.println("L: libre, O: ocupado");
        System.out.println("  _________ Pantalla");
        System.out.println();
        String[] clasificarFilas = {"A","B","C","D","E","F", "G", "H"};        
        for(int i =0; i < 6; i++){
           System.out.print(clasificarFilas[i] + " ");
           for(int j = 0; j<6;j++){
               System.out.print(asientos[i][j].getEstaOcupado()+" ");
           }
           System.out.println();
          
        }
        for (int j = 0; j < asientos[0].length; j++){
            System.out.print(" "+(j+1));
        }
        System.out.println();
    }
    
 }
  
    

    

