/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progra;

/**
 *
 * @author daniel0906
 */
public class Pista {
    // DECLARACION DE VARIABLLES PARA LOS REPORTES Y ATRIBUTOS 
    private int gas_requerido;
    private String tipo_Carretera; 
    private int coeficiente;
    private int tamaño_carretera;
    // LOS COLORES
    public static final String color_rojo = "\u001B[31m";
    public static final String color_verde = "\u001B[32m";
    public static final String color_azul = "\u001B[34m";
    public static final String color_cafe = "\u001B[38;5;94m";
     public static final String resetear_color = "\u001B[0m";
    public static final String color_amarillo_pista = "\u001B[38;5;186m";
    public static final String color_gris = "\u001B[38;5;253m";
    public static final String color_gris_pista="\u001b[47;1m";
    public static final String color_cafe_pista="\u001b[48;5;94m";
    public static final String color_ama_pista="\u001b[48;5;11m";
    
    
      //CONTRUCTOR PARA CREAR LOS TRES TIPOS DE CARRETERA
    public Pista(int gas_requerido, String tipo_Carretera, int coeficiente, int tamaño_carretera) {
        this.gas_requerido = gas_requerido;
        this.tipo_Carretera = tipo_Carretera;
        this.coeficiente = coeficiente;
        this.tamaño_carretera = tamaño_carretera;
    }

    public void setTamaño_carretera(int tamaño_carretera) {
        this.tamaño_carretera = tamaño_carretera;
    }

    public int getTamaño_carretera() {
        return tamaño_carretera;
    }

    
    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setGas_requerido(int gas_requerido) {
        this.gas_requerido = gas_requerido;
    }

    public void setTipo_Carretera(String tipo_Carretera) {
        this.tipo_Carretera = tipo_Carretera;
    }

    public int getGas_requerido() {
        return gas_requerido;
    }

    public String getTipo_Carretera() {
        return tipo_Carretera;
    }
    public void Presentar_Pistas(){ // METODO PARA LA OPCION DE MOSTRAR PISTAS DEL MENU PRINCIPAL
        //CONDICION PARA VER QUE TIPO DE CARRETERA ES
        if (this.getTipo_Carretera()== "Tierra"){// SI ES DE TIERRA MOSTRARA SUS CARACTERISTICAS Y PINTARA LA CARRETERA DE CAFE
            System.out.println(color_cafe+"LA PISTA DE "+this.tipo_Carretera.toUpperCase());
            System.out.println("NECESITAS: "+this.gas_requerido+" DE GASOLINA".toUpperCase());
            System.out.println("EL TAMAÑO ES: "+this.tamaño_carretera+" CASILLAS".toUpperCase()+resetear_color);
            for (int i=0;i<this.tamaño_carretera;i++){
                System.out.print(color_cafe_pista+"-"+resetear_color);
            }  
            
            System.out.println("\nY SU COEFICIENTE ES: "+this.coeficiente+"".toUpperCase()+resetear_color);
        }
        else if(this.getTipo_Carretera()=="Arena"){// SI ES DE ARENA MOSTRARA SUS CARACTERISTICAS Y PINTARA LA CARRETERA DE AMARILLO
            System.out.println(color_amarillo_pista+"LA PISTA DE "+this.tipo_Carretera.toUpperCase());
            System.out.println("NECESITAS: "+this.gas_requerido+" DE GASOLINA".toUpperCase());
            System.out.println("EL TAMAÑO ES: "+this.tamaño_carretera+" CASILLAS".toUpperCase());
             for (int i=0;i<this.tamaño_carretera;i++){
                System.out.print(color_ama_pista+"-"+resetear_color);
            }
            System.out.println("\nY SU COEFICIENTE ES: "+this.coeficiente+"".toUpperCase()+resetear_color);
        }
        else{ // SI NO ES NINGUN DE LAS ANTERIORES, LA CARRETERA ES DE PIEDRA Y PINTARA LA CARRETERA DE GRIS
            System.out.println(color_gris+"LA PISTA DE "+this.tipo_Carretera.toUpperCase());
            System.out.println("NECESITAS: "+this.gas_requerido+" DE GASOLINA".toUpperCase());
            System.out.println("EL TAMAÑO ES: "+this.tamaño_carretera+" CASILLAS".toUpperCase());
             for (int i=0;i<this.tamaño_carretera;i++){
                System.out.print(color_gris_pista+"-"+resetear_color);
            }
            System.out.println("\nY SU COEFICIENTE ES: "+this.coeficiente+"".toUpperCase()+resetear_color);
        }
        
      
        
    }
    
}
