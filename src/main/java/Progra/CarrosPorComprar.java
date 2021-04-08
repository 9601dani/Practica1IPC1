/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progra;

import static Progra.Usuario.color_amarillo;
import static Progra.Usuario.color_azul;
import static Progra.Usuario.color_rojo;
import static Progra.Usuario.color_verde;
import static Progra.Usuario.resetear_color;
/**
 *
 * @author daniel0906
 */


public class CarrosPorComprar {
    
    //VARIABLES DE LA CLASE
    private String nombrev;
    private String motor;
    private int potencia;
    private String llantas;
    private int coeficiente;
    private String color;
    private String imagen;
    private int gasolina;
    private String color_carro;
  //CONTRUCTOR DE LA CLASE
    public CarrosPorComprar(String nombrev, String motor, int potencia, String llantas, int coeficiente, String color, String imagen, int gasolina) {
        this.nombrev = nombrev;
        this.motor = motor;
        this.potencia = potencia;
        this.llantas = llantas;
        this.coeficiente = coeficiente;
        this.color = color;
        this.imagen = imagen;
        this.gasolina = gasolina;
    }

    public String getNombrev() {
        return nombrev;
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
        return imagen;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setNombrev(String nombrev) {
        this.nombrev = nombrev;
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
    
    public void presentarse1(int pos){
        //CONDICION PARA PINTAR LOS CARROS QUE SE PUEDE COMPRAR
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
        System.out.println(" "+ (pos+1) +")"+ " Nombre: "
                +this.nombrev+". Motor: "+this.motor+". Potencia: "
                +this.potencia+". Llantas: "+this.llantas+". Coeficiente: "
                        +this.coeficiente+". Color: "+this.color+". Imagen: "+color_carro+this.imagen
                               +resetear_color +". Gasolina: "+this.gasolina);                
    }
    
    
   
    
}
