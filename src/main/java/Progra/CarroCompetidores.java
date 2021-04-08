/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progra;

import static Progra.Usuario.color_azul;
import static Progra.Usuario.color_rojo;
import static Progra.Usuario.color_verde;
import static Progra.VehiculoPropio.color_amarillo;

/**
 *
 * @author daniel0906
 */
public class CarroCompetidores {
    //VARIABLES COLORES
    public static final String color_rojo = "\u001B[31m";
    public static final String color_verde = "\u001B[32m";
    public static final String color_azul = "\u001B[34m";
    public static final String color_blanco = "\u001B[37m";
    public static final String resetear_color = "\u001B[0m";
    public static final String color_morado = "\u001B[35m";
    public static final String color_amarillo = "\u001B[33m";
    public static final String color_naranja = "\u001B[38;5;208m";
    public static final String color_rojo2 = "\u001B[38;5;198m";
    
    //PARA DEFINIR EL COLOR QUE PINTARA EL CARRO
    private String color_carro;
    
    
    //VARIABLES DE CLASE
    private String nombreV;
    private String motor;
    private int potencia;
    private String llantas;
    private int coeficiente;
    private String color;
    private String imagen;
    private int gasolina;
    private int posicion;
    
    public CarroCompetidores(int posicion) {
        this.posicion = posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }
      // CONTRUCTOR PARA LOS CARROS DE RIVALES O DE LOS COMPETIDORES
    public CarroCompetidores(String nombreV, String motor, int potencia, String llantas, int coeficiente, String color, String imagen, int gasolina) {
        this.nombreV = nombreV;
        this.motor = motor;
        this.potencia = potencia;
        this.llantas = llantas;
        this.coeficiente = coeficiente;
        this.color = color;
        this.imagen = imagen;
        this.gasolina = gasolina;
        //CONDICION PARA DETERMINAR EL VALOR DE LA VARIABLE COLOR
    if(this.color=="Azul"){
     color_carro=color_azul;
    }
    else if(this.color=="Rojo"){
        color_carro=color_rojo;
    }
    else if(this.getColor()=="Verde") {
        color_carro=color_verde;
    }
    else {
         color_carro= color_amarillo;
    }
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public String getNombreV() {
        
        return nombreV;
    }

    public String getMotor() {
        return motor;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getLlantas() {
        return llantas;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public String getColor() {
        
        return color;
    }

    public String getImagen() {
        //CONDICIONES PARA PINTAR EL CARRO, DEL VALOR DE LA VARIABLE DEFINIDA ARRIBA
        if(this.getColor()=="Azul"){
     color_carro=color_azul;
    }
    else if(this.getColor()=="Rojo"){
        color_carro=color_rojo;
    }
    else if(this.getColor()=="Verde") {
        color_carro=color_verde;
    }
    else {
         color_carro= color_amarillo;
    }
        return color_carro+imagen+resetear_color;
    }

    public int getGasolina() {
        return gasolina;
    }
  
    public void Ver_Carros_Rivales(int pos){
        // METODO PARA MOSTRAR LOS CARROS GENERADOS PARA LA COMPETENCIA
       
        System.out.println(resetear_color+(pos+1)+". Nombre: "+this.nombreV+". Motor: "+this.motor+". Potencia: "+this.potencia+". Llantas: "
                +this.llantas+". Coeficiente: "+this.coeficiente+". Color: "+this.color+". Imagen: "
                +color_carro+this.imagen+resetear_color+". Gasolina: "+this.gasolina);
    }
    
    
    
    
    
}
