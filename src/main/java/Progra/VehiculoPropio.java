/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progra;

import static Progra.Usuario.color_azul;
import static Progra.Usuario.color_rojo;
import static Progra.Usuario.color_verde;
import static Progra.Usuario.resetear_color;

/**
 *
 * @author daniel0906
 */

public class VehiculoPropio {
    //Colores
     public static final String color_amarillo = "\u001B[33m";
  // VARIABLES DEL VEHICULO
    private String nombreV;
    private String motor;
    private int potencia;
    private String llantas;
    private int coeficiente;
    private String color;
    private String imagen;
    private int Gasolina;
    // PARA DEFINIR EL COLOR PARA PINTAR LOS CARROS DEL USUARIO
    private String color_carro;
    // VARIABLES PARA EL REPORTE POR CADA VEHICULO
    private int distancia;
    private int galones_gastados;
    private int galones_comprados;
    private double oro_gastado;
    // CONTRUCTOR PARA LOS VEHICULOS QUE VA ADQUIRIENDO EL USUARIO
    public VehiculoPropio(String nombreV, String motor, int potencia, String llantas, int coeficiente, String color, String imagen, int Gasolina, int distancia, int galones_gastados,int galones_comprados, double oro_gastado ) {
        this.nombreV = nombreV;
        this.motor = motor;
        this.potencia = potencia;
        this.llantas = llantas;
        this.coeficiente = coeficiente;
        this.color = color;
        this.imagen = imagen;
        this.Gasolina = Gasolina;
        this.distancia= distancia;
        this.galones_gastados= galones_gastados;
        this.galones_comprados= galones_comprados;
        this.oro_gastado= oro_gastado;
        //CONDICION PARA ESTABLECER DE QUE COLOR SE PINTARA LA IMAGEN
        if(this.getColor()=="Azul"){
     color_carro=color_azul;
    }
      
    else if(this.getColor()=="Rojo"){
        color_carro=color_rojo;
    }
    else if(this.getColor()=="Verde") {
        color_carro=color_verde;
    }
    else if(this.getColor()=="Verde") {
        color_carro=color_verde;
    }
    else {
         color_carro= color_amarillo;
    }
       
    }

    public void setOro_gastado(double oro_gastado) {
        this.oro_gastado = oro_gastado;
    }

    public double getOro_gastado() {
        return oro_gastado;
    }

    public void setGalones_comprados(int galones_comprados) {
        this.galones_comprados = galones_comprados;
    }

    public int getGalones_comprados() {
        return galones_comprados;
    }

    
    public int getGalones_gastados() {
        return galones_gastados;
    }

    public void setGalones_gastados(int galones_gastados) {
        this.galones_gastados = galones_gastados;
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

    public String getImagen() {// DEPENDIENDO DEL COLOR DEL CARRO, ASI SE PINTARA LA IMAGEN DEL CARRO 
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
        return Gasolina;
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

    public void setGasolina(int Gasolina) {
        this.Gasolina = Gasolina;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
    public void Info_Vehiculo_Propio1(){ // METODO PARA MOSTRAR LOS DATOS DEL PRIMER VEHICULO QUE ESCOGE
        System.out.println("Nombre: "+getNombreV());
        System.out.println("Motor: "+getMotor());
        System.out.println("LLantas: "+getLlantas());
        System.out.println("Color: "+ getColor());
        System.out.println("Imagen: "+getImagen());
        System.out.println("Gasolina: "+getGasolina());
        System.out.println("Potencia: "+getPotencia());
        System.out.println("Coficiente_Llantas: "+getCoeficiente());
        System.out.println("");
    }
     public void Info_Distancia(){ // METODO PARA MOSTRAR LA DISTANCIA QUE RECORRE
         if(getDistancia()==0){// SI LA DISTANCIA DEL CARRO ES 0
              System.out.println("El Carro: "+getNombreV().toUpperCase());// MENSAJES QUE INFORMAN QUE EL CARRO NO TIENE RECORRIDO
              System.out.println("NO HA RECORRIDO NINUNA DISTANCIA");
         }
         else{// MOSTRARA EL NOMBRE DEL CARRO, Y LA DISTANCIA QUE A RECORRIDO
             System.out.println("El Carro: "+getNombreV().toUpperCase());
        System.out.println("A Recorrido: "+getDistancia()+" de Distancia");
         }
         
       
    }
     public void Reporte_Gasolina(){ 
// METODO PARA MOSTRAR EL NOMBRE DEL CARRO, LA GASOLINA UTILIZQADA, LA GASOLINA COMPRADA Y EL ORO GASTADO/INVERTIDO EN EL CARRO
         System.out.println(color_azul+"El Carro: "+getNombreV().toUpperCase());
         System.out.println("Ha gastado: "+getGalones_gastados()+" Galones de Gasolina");
         System.out.println("Ha comprado: "+getGalones_comprados()+" Galones de Gasolina");
         System.out.println("Ha Gastado: "+getOro_gastado()+" De Oro en Gasolina"+resetear_color);
         System.out.println("");
         
     }
    
    public void presentarse(int pos){
        //CONDICION PARA PINTAR Y LUEGO MOSTRAR AL CARRO EN CUESTION
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
        System.out.println(" "+ (pos+1) +")"+ " Nombre: "// MOSTRARA CARACTERISTICAS DE LOS CARROS PROPIOS
                +this.nombreV+". Motor: "+this.motor+". Potencia: "
                +this.potencia+". Llantas: "+this.llantas+". Coeficiente: "
                        +this.coeficiente+". Color: "+this.color+". Imagen: "+color_carro+this.imagen+resetear_color
                                +". Gasolina: "+this.Gasolina);                
    }
    public void Presentar_Un_Carro(){
        // METODO PARA PRESENTAR EL CARRO ACTUAL
        if(this.getColor()=="Azul"){// CONDICION PARA VER EL COLOR DEL CARRO, Y PINTAR LA IMAGEN DE DICHO COLOR
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
        System.out.println("LAS CARACTERISTICAS DE TU CARRO ACTUAL ES:");
        System.out.println("Nombre: "
                +this.nombreV+". Motor: "+this.motor+". Potencia: "
                +this.potencia+". Llantas: "+this.llantas+". Coeficiente: "
                        +this.coeficiente+". Color: "+this.color+". Imagen: "+color_carro+this.imagen+resetear_color
                                +". Gasolina: "+this.Gasolina);      
    }
    
    
   
    
    
}
