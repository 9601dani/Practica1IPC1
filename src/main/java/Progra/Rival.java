/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progra;

import static Progra.Usuario.carros_com;
import static Progra.Usuario.color_amarillo;
import static Progra.Usuario.color_azul;
import static Progra.Usuario.color_blanco;
import static Progra.Usuario.color_rojo;
import static Progra.Usuario.resetear_color;

/**
 *
 * @author daniel0906
 */
public class Rival {
    //COLORES
     public static final String resetear_color = "\u001B[0m";
    public static final String color_azul = "\u001B[34m";
    // DECLARACION DE LA VARIBALE PARA EL NOMBRE DE COMPETIDORES Y EL ARREGLO DE LOS CARROS ALEATORIOS QUE GENERARA
    private String nombre;
     static CarroCompetidores carros_com[];
    final int CARROS_DE_COMPETIDORES=6;// NUMERO MAXIMO DE RIVALES POR ENDE UN CARRO POR CADA RIVAL
    
    

    public Rival(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }
    public void PresentarParaCompetir(int pos){ // METODO PARA MOSTRAR A LOS RIVALES ESCOGIDOS POR LA MAQUINA (RANDOM)
        System.out.print((pos+1)+"."+" HOLA ME LLAMO "+color_azul+this.nombre.toUpperCase()+resetear_color+" Y COMPETIRE CONTRA TI");
    }
   
     
                     
    
    
}
