/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progra;

import static Progra.Usuario.color_naranja;
import static Progra.Usuario.resetear_color;
import java.util.Scanner;

/**
 *
 * @author daniel0906
 */
public class Juego {
    // DECLARO EL SCANNER PARA LA ENTRADA DE DATOS DESDE CONSOLA
    Scanner entrada = new Scanner (System.in);
    // LOS COLORES
    public static final String color_rojo = "\u001B[31m";
    public static final String color_verde = "\u001B[32m";
    public static final String color_azul = "\u001B[34m";
    public static final String color_blanco = "\u001B[37m";
    public static final String resetear_color = "\u001B[0m";
    public static final String color_morado = "\u001B[35m";
    public static final String color_amarillo = "\u001B[33m";
    public static final String color_naranja = "\u001B[38;5;208m";
    public static final String color_rojo2 = "\u001B[38;5;198m";
    // LLAMO AL JUGADOR, PARA CREAR UN NUEVO JUGADOR
    private Usuario jugador1;
    //PARA PODER GUARDAR EL PRIMER CARRO
   
   
    
    
    public void Iniciar_Juego(){
        // VARIABLES PARA DATOS DEL USUARIO, Y ASIGNACION DE SUS PREMIOS DE INICIO(GEMAS Y ORO)
        String nombre;
        String nickname;
        String edad;
        int gemas=1000;
        double oro=1000;
        // VARIABLES PARA QUE ACEPTE LOS TERMINOS
        String terminos= new String ("Si");
        String terminos1;
        Boolean acceso= Boolean.FALSE;
        Boolean acceso1= Boolean.TRUE;
        Scanner ingresoDatos= new Scanner(System.in); 
        System.out.println(resetear_color+"¿Acepta los terminos y Condiciones? (Responda si o no): ");
        while(acceso==false){
        
        terminos1= ingresoDatos.next();
            if (terminos.equalsIgnoreCase(terminos1)){ // SI ACEPTA LOS TERMINOS (IGNORANDO SI ES MAYUSCULA O MINUSCULA
                //SALE DEL CICLO Y PIDE LOS VALORES REQUERIDOS POR EL SISTEMA
                acceso=Boolean.TRUE;
                System.out.println("Ingrese su Nombre:");
                nombre= ingresoDatos.next();
                System.out.println("Ingrese su NickName:");
                nickname=  ingresoDatos.next();
                System.out.println("Ingrese su Edad:");
                edad= ingresoDatos.next();
                Usuario Jugador= new Usuario(nombre,nickname,edad,gemas,oro);// CREA UN NUEVO JUGADOR   
                Jugador.Escoger_Primer_Vehiculo_Propio(); //LLAMA A LA CLASE DSEL JUGADOR Y ENVIA LOS DATOS
            }
            else{// SI NO ACEPTA LOS TERMINOS SOLO SIGUE REPITIENDO HASTA QUE LOS ACEPTE
                acceso=Boolean.FALSE;
                System.out.println(color_rojo+"**DEBE ACEPTAR LOS TERMINOS Y CONDICIONES PARA PODER CONTINUAR**"+resetear_color);
                System.out.println(resetear_color+"¿Acepta los terminos y Condiciones? (Responda si o no): "+resetear_color);
            }       
        }
    }
    public static void verPremios(){// METODO PARA VER QUE PREMIOS SON LOS QUE SE PUEDEN GANAR EN LA RULETA
           
            System.out.println(color_naranja +"--> 40 GEMAS, \n--> 75 ORO , \n--> 1000 GEMAS, \n--> 2000 DE ORO, \n--> 5 Gemas,\n--> 10 DE ORO"+resetear_color);
        }
    
    
    
    
    
    
}
