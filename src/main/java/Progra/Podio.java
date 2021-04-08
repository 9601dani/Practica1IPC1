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
public class Podio { // DELCARACION DE LA VARIABLE QUE TENDRA EL GANADOR
    private String nombre;

    public Podio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void Presentar_Podio(int pos){// METODO PARA LA OPCION DE EL REPORTE DEL PODIO, SOLO MOSTRANDO EL NOMBRE

        
        System.out.println((pos+1)+". "+ this.getNombre());
        
    }
    
}
