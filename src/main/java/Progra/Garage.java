/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progra;


import static Progra.Usuario.color_amarillo;
import static Progra.Usuario.color_azul;
import static Progra.Usuario.color_blanco;
import static Progra.Usuario.color_rojo;
import static Progra.Usuario.color_verde;
import static Progra.Usuario.resetear_color;
import static Progra.Usuario.vehiculos;


/**
 *
 * @author daniel0906
 */

public class Garage {
          
    private static Usuario jugador;
    //METODO PARA HECHAR GASOLINA
     public static void  Llenar_Gas(int pos,int gas){
        int gaso=gas;// IGUALO LA VARIABLE A LA GASOLINA
        if (gaso>=0 && gaso<=99){ //VEO SI LA GASOLINA ESTA ENTRE 0 Y 99, PARA PODER HECHARLE
            double y= ((100-gaso)*2.5); // VARIABLE PARA SABER CUANTO ES DE ORO
            int x= 100-gaso;   // VER LOS GALONES QUE SE LE HECHO
           gas=100;          // LA VARIABLE PARA ENVIAR DE VUELTA EN EL SET
            vehiculos[pos].setGasolina(gas); // LE ENVIO AL SET EN LA POSICION DEL CARRO ENVIADO, LO IGUALO A LA NUEVA GASOLINA
            //MENSAJES PARA DECIR QUE YA FUE HECHO EL RPOCESO
            System.out.println(color_rojo+"**HEMOS LLENADO TU TANQUE DE GASOLINA**"+resetear_color);
            System.out.println(color_azul+"FUERON "+x+" GALONES DE GASOLINA");
            System.out.println("Y FUERON "+y+" DE ORO "+resetear_color);
            
        }
        else // AQUI ES PORQUE LA GASOLINA FUE IGUAL A 100
             System.out.println(color_rojo+"*TIENES EL TANQUE LLENO*"+resetear_color);// MENSAJE QUE SU TANQUE ESTA LLENO
    }
    
     
    
     
     
     
    
    
    
}
