/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progra;

import static Progra.CarroCompetidores.color_azul;
import static Progra.CarroCompetidores.color_rojo;
import static Progra.CarroCompetidores.color_verde;
import java.util.Scanner;
//IMPORTAMOS LOS METODOS REQUERIDOS, Y LOS COLORES DE LAS PISTAS
import static Progra.Garage.Llenar_Gas;
import static Progra.Juego.verPremios;
import static Progra.Pista.color_ama_pista;
import static Progra.Pista.color_cafe_pista;
import static Progra.Pista.color_gris_pista;
import static Progra.Pista.resetear_color;



/**
 *
 * @author daniel0906
 */
public class Usuario {// declaramos variable para el valor de un nuevo color
    private int valor_nuevo_color=20;
    //SCANNER PARA EL INGRESO DE DATOS DESDE CONSOLA
    Scanner entrada = new Scanner (System.in);
    //COLORES
    public static final String color_rojo = "\u001B[31m";
    public static final String color_verde = "\u001B[32m";
    public static final String color_azul = "\u001B[34m";
    public static final String color_blanco = "\u001B[37m";
    public static final String resetear_color = "\u001B[0m";
    public static final String color_morado = "\u001B[35m";
    public static final String color_amarillo = "\u001B[33m";
    public static final String color_naranja = "\u001B[38;5;208m";
    public static final String color_rojo2 = "\u001B[38;5;198m";
   private int color_carro;
   // ORGANIZACION DEL PODIO;
    static Podio podio[];
    final int NUM_PODIO=10;
    //CARROS_DE_RIVALES
    static CarroCompetidores carros_com[];
    final int CARROS_DE_COMPETIDORES=6;
    // VER PISTAS
    static Pista pistas[];
     //ASIGNAR RIVALES
    static Rival riv;
    static Rival rival[];
    final int NUM_RIVALES=5;
    //VER CARROS DISPONIBLES
    static CarrosPorComprar carros[];
    final int NUM_VEHICULOS=6;
    //ASIGNAR PRIMER VEHICULO
    static VehiculoPropio vehiculos[];
    final int CANTIDAD_VEHICULOS=5;
    // VARIBALES DEL USUARIO Y/O JUGADOR 
    private String nombre;
    private String nickname;
    private String edad;
    private int gemas;
    private double oro;
    
  // CONTRUCTOR PARA EL NUEVO USUARIO
    public Usuario(String nombre, String nickname, String edad, int gemas, double oro) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.edad = edad;
        this.gemas = gemas;
        this.oro = oro;
     
        
    }
  //GETTERS Y SETTERS DEL JUGADOR
    public String getNombre() {
        return nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEdad() {
        return edad;
    }

    public int getGemas() {
        return gemas;
    }

    public double getOro() {
        return oro;
    }


    public void setGemas(int gemas) {
        this.gemas = gemas;
    }

    public void setOro(double oro) {
        this.oro = oro;
    }
    // METODO PARA ESCOGER EL PRIMER VEHICULO
    public void Escoger_Primer_Vehiculo_Propio(){     
        //SE INICIALIZAN TODOS LO ARREGLOS QUE SE USARAN DESPUES EN DISTINTOS METODO
        carros_com= new CarroCompetidores[CARROS_DE_COMPETIDORES];
        vehiculos= new VehiculoPropio[CANTIDAD_VEHICULOS];
        carros= new CarrosPorComprar[NUM_VEHICULOS];
        pistas= new Pista[3];
        rival= new Rival[NUM_RIVALES];
        podio= new Podio[NUM_PODIO];
        //VALORES PREDETERMINADOR PARA LOS CARROS QUE SE PODRAN COMPRAR;
        carros[0] = new CarrosPorComprar ("Audi","Generico",2,"Genericas",1,"Amarillo","[.__.]>",100);
        carros[1] = new CarrosPorComprar ("Tercel","Generico",2,"Genericas",1,"Amarillo","[~½~]>",100);
        carros[2] = new CarrosPorComprar ("Honda","Generico",2,"Genericas",1,"Amarillo","[@¬]>",100);
        carros[3] = new CarrosPorComprar ("Mini_Cooper","Generico",2,"Genericas",1,"Amarillo","[(..)]>",100);
        carros[4] = new CarrosPorComprar ("Masserati","Generico",2,"Genericas",1,"Amarillo","[─;─]>",100);
        carros[5] = new CarrosPorComprar ("GIT","Generico",2,"Genericas",1,"Amarillo","[─8]>",100);
        //ASIGNACION DEL VALOR DE PISTAS
        pistas[0]= new Pista(80,"Tierra",4,80);
        pistas[1]= new Pista(90,"Arena",2,90);
        pistas[2]= new Pista(100,"Concreto",6,100);
        //ASIGNACION DEL NOMBRE DE RIVALES
        rival[0]= new Rival("Juan");
        rival[1]= new Rival ("Pedro");
        rival[2]= new Rival ("Luis");
        rival[3]= new Rival("Pablo");
        rival[4]= new Rival ("Carlos");
                //Escoger CARRO;
                //VARIABLES PARA ASIGNAR PRIMER CARRO
                 String nombreV;
                 String motor;
                 String llantas;
                 String color;
                 String imagen;
                 int gasolina;
                 int potencia;
                 int coeficiente; // MOSTRAMOS UNA SELECCIONDE 3 CARROS PARA ESCOGER
                System.out.println("\n **ES HORA DE ELEGIR TU CARRO PARA INICIAR** ESCOGE UNO: "+ this.getNickname().toUpperCase()+"**");
                System.out.println(color_morado+"\n1.\nNombre: Dodge\nMotor: Basico\nLlantas: Baja\nColor: Azul\nGasolina: 99\nImagen: ¬[n]> ");
                System.out.println("\n2.\nNombre: Kia\nMotor: Basico\nLlantas: Baja\nColor:Rojo\nGasolina:100\nImagen: [n]>");
                System.out.println("\n3.\nNombre: Toyota\nMotor: Basico\nLlantas: Baja\nColor: Verde\nGasolina: 100\nImagen: ~<[n]>");
                System.out.println(resetear_color+"seleccione la opción: "+resetear_color);
                int opcion = entrada.nextInt(); // GUARDAMOS LA OPCION DIGITADA EN CONSOLA
                     switch(opcion){// DE ACUERDO A LA OPCION
                            case 1: System.out.println(color_azul+"HAZ ELEGIDO EL CARRO DODGE"+resetear_color);// SI ES EL CASO 1, LE ASIGNAMOS LOS VALORES ESTABLECIDOS ARRIBA
                            nombreV= "Dodge";
                            motor= "Basico";
                            potencia=4;
                            llantas= "Baja";
                            coeficiente=2;
                            color= "Azul";   
                            imagen="¬[n]>";
                            gasolina=99; // LUEGO LOS VALORES LOS MANDAMOS A LA POSICION 0 (POSICION INIAL POR SER EL PRIMER CARRO)
                            vehiculos[0] = new VehiculoPropio(nombreV,motor,potencia,llantas,coeficiente,color,imagen,gasolina,0,0,0,0);
                            break;
                            case 2: System.out.println(color_azul+"HAZ ELEGIDO EL CARRO KIA"+resetear_color);//SI ES EL CASO 2, LE ASIGNAMOS LOS VALORES ESTABLECIDOS ARRIBA
                            nombreV= "Kia";
                            motor= "Basico";
                            potencia=4;
                            llantas= "Baja";
                            coeficiente=2;
                            color= "Rojo";
                            imagen="[n]>";
                            gasolina=100; // LUEGO LOS VALORES LOS MANDAMOS A LA POSICION 0 (POSICION INIAL POR SER EL PRIMER CARRO)
                           vehiculos[0] = new VehiculoPropio(nombreV,motor,potencia,llantas,coeficiente,color,imagen,gasolina,0,0,0,0);
                            break;
                            case 3: System.out.println(color_azul+"HAZ ELEGIDO EL CARRO TOYOTA"+resetear_color);//SI ES EL CASO 3, LE ASIGNAMOS LOS VALORES ESTABLECIDOS ARRIBA
                            nombreV= "Toyota";
                            motor= "Basico";
                            potencia=4;
                            llantas= "Baja";
                            coeficiente=2;
                            color= "Verde";
                            imagen="~<[n]>";
                            gasolina=100; // LUEGO LOS VALORES LOS MANDAMOS A LA POSICION 0 (POSICION INIAL POR SER EL PRIMER CARRO)
                            vehiculos[0] = new VehiculoPropio(nombreV,motor,potencia,llantas,coeficiente,color,imagen,gasolina,0,0,0,0);
                         break;
                            default: // CUALQUIER OTRA OPCION REPITE EL METODO HASTA QUE TENGA UNA OPCION DENTRO DE LAS ESTABLECIDAS
                                this.Escoger_Primer_Vehiculo_Propio();
                    } // SI ESCOGE UN VEHICULO LE MOSTRAMOS LAS CARACTERISTICAS DEL VEHICULO ESCOGIDO 
                    System.out.println(color_naranja+"***INFORMACION DE VEHICULO ESCOGIDO: "+this.getNickname().toUpperCase()+"***"+resetear_color);
                    vehiculos[0].Info_Vehiculo_Propio1(); //MOSTRAMOS LOS VALORES EN LA POSICION 0 Y LLAMAMOS AL METODO PARA VER LAS CARACTERISTICAS
                    this.Menu_Principal(); // LLAMAMOS AL METODO DEL MENU PRINCIPAL
    }
    public void MostrarGemasYOro(){ // METODO ENCARGADO DE MOSTRARLE AL JUGADOR LAS GEMAS Y EL ORO CON LO QUE CUENTA
        System.out.println(color_azul+"JUGADOR: "+this.nickname.toUpperCase());
        System.out.println(color_verde+"Tus gemas actuales son: *"+this.getGemas()+"*");
        System.out.println(color_amarillo+"Tu oro actual es: *"+this.getOro()+"*"+resetear_color);
    }
    public  void  Menu_Principal(){
        int elegir=0;// DECLARAMOS LA VARIBALE EN 0 PARA PODER ACCEDER AL MENU
        while(elegir!=6){ // SE REPETIRA EL MENU MIENTRAS LA OPCION QUE DIGITE EL USUARIO SEA DIFERENTE A SEIR QUE ES LA OPCION DE SALIR
                  this.MostrarGemasYOro(); // LE MOSTRAMOS SUS GEMAS Y ORO
                    System.out.println(resetear_color);// DESPLEGAMOS EL MENU
                    System.out.println(color_azul +"              _____________           ");
                    System.out.println("   |**********             ***********|        ~~~~~~~");
                    System.out.println("~~~|        BIENVENIDO AL MENU        |~~~~~~~~");
                    System.out.println("   |**********_____________***********|        ~~~~~~~");
                    System.out.println("");
                    System.out.println(resetear_color+"_______________________________ ");
                    System.out.println("|1. COMPETIR                 /|");
                    System.out.println("|2. RULETA                   /|");
                    System.out.println("|3. GARAGE                   /|");
                    System.out.println("|4. PISTAS                   /|");
                    System.out.println("|5. ESTADISTICAS Y REPORTES  /|");
                    System.out.println("|6. SALIR                    /|");
                    System.out.println("-------------------------------");
                    System.out.println("");
                    System.out.println(color_naranja+"*Digite opcion del Menu*"+resetear_color);
                    elegir= entrada.nextInt(); // GUARDAMOS LA OPCION DIGITADA POR EL USUARIO
                    switch(elegir){// UTILIZAMOS UN CONDICIONAL DE ACUERDO A LA OPCION DIGITADA POR EL USUARIO
                        case 1:// AQUI ESCOGIO LA COMPETENCIA Y DEPLEGAMOS MENSAJES
                            System.out.println("----¿LISTO PARA COMPETIR?----");
                            System.out.println("CUANTOS RIVALES DESEAS: "); // RECORDAMOS EL NUMERO MAXIMO DE RIVALES
                            System.out.println(color_azul+"--recuerda que puedes elegir hasta 5 rivales"+ resetear_color);
                                        int lu=0; // CICLO PARA PODER VER LOS RIVALES 
                                        int num_riv = entrada.nextInt(); //EL USUARI DIGITA EL NUMERO DE RIVALES QUE QUIERE
                                        while ((lu < num_riv) ) { // CICLO QUE FUNCIONADA MIENTRAS EL CONTADOR SEA MENOR AL NUMERO DE RIVALES QUE QUIERE EL USUARIO
                                            if (rival[lu] != null){ // SI LA POSICION DEL RIVAL ES DIFERENTE DE UN VALOR NULO/VACIO ENTONCES LLAMARA AL METODO PARA MOSTRAR AL RIVAL
                                            rival[lu].PresentarParaCompetir(lu);
                                            lu++;            // SE SUMARA EL CONTADOR PARA IR AVANZANDO EN LAS POSICIONES DE LOS RIVALES
                                            System.out.println("");
                                        }
                                        else{
                                                System.out.println("no puedes con tantos rivales"); // SI DIGITA MAS RIVALES DESPLIEGA MENSAJE QUE NO ES POSIBLE
                                         }
                                        } 
                            System.out.println(color_rojo+"LOS CARROS DE LOS RIVALES PUEDEN SER: "+resetear_color);//mostrar mensaje de los carros de los rivales 
                            this.ASIGNAR_VEHICULOS_RIVAL(num_riv); //llamar al metodo de asignar los vehiculos de los rivales generados aleatoriamente Y ENVIAMOS EL NUMERO DE RIVALES INGRESADOR POR EL USUARIO
                        break;
                        case 2:
                        int escoger=0; // VARIABLE PARA LAS OPCIONES DEL SUB MENU DE LA RULETA
                            while(escoger!=3){// CICLO QUE SE REPETIRA HASTA SER DIFERENTE DE TRES QUE ES LA OPCION PARA REGRESAR AL MENU PRINCIPAL
                                System.out.println(resetear_color+"\n1. Girar Ruleta"); //DESPLIEGO SUB MENU DE LA RULETA
                                System.out.println("2. Ver Premios");
                                System.out.println("3. Regresar a Menu Principal");
                                System.out.println(color_naranja+"\n\tDigite que opcion desea");
                                escoger= entrada.nextInt();// GUARDO LA OPCION DIGITADA POR EL USUARIO 
                                switch(escoger){ //CICLO PARA EVALUAR LA OPCION DIGITADA
                                    case 1:System.out.println(color_rojo2+"Hola, Giraremos la Ruleta"+resetear_color);
                                           this.girarRuleta(); //LLAMAMOS AL METODO PARA GIRAR LA RULETA
                                    break;
                                    case 2:System.out.println("Premios Disponibles son: ");
                                        verPremios();// LLAMAMOS AL METODO MOSTRAR LOS PREMIOS;
                                    break;
                                }
                            } 
                        break;
                        case 3:
                        System.out.println("Elige vehiculo a Escoger");
                        this.Menu_Cambios();// LLAMAMOS AL METODO PARA REALIZAR LOS CAMBIOS AL VEHICULO
                        break;
                        case 4:
                            int op=0;//MUESTRA CARROS DISPONIBLE
                               System.out.println("----BIENVENIDO A LAS PISTAS----");
                                        int lugar = 0;
                                        while ((lugar < 3) ) { // CICLO QUE SE REPETIRA MEOR A 3, POR SER NADA MAS 3 PISTAS
                                        if (pistas[lugar] != null){ //EVALUAMOS QUE LA POSICION SEA DIFERENTE DE NULO/VACIO PARA PODER MOSTRAR ALGUN VALOR
                                            pistas[lugar].Presentar_Pistas();// SI CUMPLE PRESENTAMOS LOS VEHICULOS EN LA POSICON DEL CONTADOR
                                            lugar++;  // SUMAMOS UNA UNIDAD AL CONTADOR
                                            System.out.println(""); // ESPACIO EN BLANCO
                                        }
                            }
                        break;
                        case 5: // OPCION DE ESTADISICAS Y REPORTES
                            int ele=0; //INICIALIZAMOS LA VARIABLE PARA EL DESPLIEGUE DE SUB MENU DE REPORTES
                            while(ele!=3){ // CICLO QUE SE REPETIRA MIENTRAS LA OPCION DIGITADA POR EL USUARIO NO SEA 3, LA CUAL REGRESA AL MENU PRINCIPAL
                            System.out.println(color_rojo+"QUE DESEAR HACER: "+resetear_color); // DESPLEGAMOS EL SUBMENU
                            System.out.println("1. ver estadisticas de partida");
                            System.out.println("2. Ver reporte de gasolina");
                            System.out.println("3. Regresar al Menu");
                             ele= entrada.nextInt();// GUARDAMOS LA OPCION INGRESA POR EL USUARIO
                                switch(ele){ //EVALUAMOS LA OPCION GUARDADA
                                    case 1:
                                        int cos=0; //INICIAMOS CONTADOR
                                        podio[cos].Presentar_Podio(cos);
                                       while(cos<CANTIDAD_VEHICULOS){ // CICLO QUE SE REPETIRA MIENTRAS EL CONTADOR SEA MENOR A LA CANTIDAD DE LOS VEHICULOS POSIBLES POR EL USUARIO
                                           if (vehiculos[cos]!=null){ // Y EVALUAMOS QUE EL VALOR EN LA POSICION DEL CONTADOR SEA DIFERENTE DE VACIO/NULO
                                               vehiculos[cos].getNombreV(); // MOSTRAMOS EL NOMBRE DEL VEHICULO
                                               vehiculos[cos].Info_Distancia();// MOSTRAMOS LA DISTANCIA QUE AH RECORRIDO
                                              // MOSTRAMOS EL PODIO
                                               cos++;  // AUMENTAMOS CONTADOR EN UNA UNIDAD
                                           } 
                                           else{
                                               cos++; // SI LA POSICION ES NULA/VACIA SOLO AUMENTAMOS CONTADOR
                                           }         
                                       }
                            break;
                            case 2: int cont=0; //  INICIALIZAMOS CONTADOR PARA EL SEGUNDO REPORTE
                               while(cont<CANTIDAD_VEHICULOS){ //INCIAMOS CICLO QUE SE EJECUTE MIENTRAS EL CONTADOR SEA MENOR A LA CANTIDAD DE VEHICULOS DEL USUARIO
                                    if (vehiculos[cont]!=null){ // VERIFICAMOS QUE LA POSICION SEA DIFERENTE DE UN VALOR NULO/VACIO
                                        vehiculos[cont].Reporte_Gasolina(); // SI ES DIFERENTE QUIERE DECIR QUE SI TIENE DATOS, LLAMAMOS AL METODO ESTABLECIDO
                                        cont++;  // AUMENTAMOS EL CONTADOR EN UNA UNIDAD
                                    }  
                                    else{ // SI ES IGUAL A NULO/VACIO SOLOAUMENTAMOS CONTADOR
                                        cont++;
                                       
                                    }
                                }
                            break;
                                    default: // OTRA OPCION HARA QUE SALGA DEL SUBMENU Y VUELVA AL MENU PRINCIPAL
                                        break;
                                }
                            }
                        break;
                        default:// CUALQUIER OPCION DISTINTA O LA OPCION 6, CIERRA EL JUEGO POR COMPLETO 
                            // Y DESPLEJAMOS MENSAJE DE DESPIDO
                            System.out.println(resetear_color+"          ____________");
                            System.out.println("         |            |_");
                            System.out.println("---------  _ BYE _      |");
                            System.out.println("|     _   |       |     |ªªªªªªª{{  ");
                            System.out.println("|BYE|_|BYE|  BYE  | BYE |ªªªªªªª{{  ");
                            System.out.println("|         |_ _ _ _|     |ªªªªªªª{{ ");
                            System.out.println("---------    BYE       _|");
                            System.out.println("         |_____________|   ");
                            System.out.println("\tHasta Luego");
                            break;        
                    }
            }
    }
    
    public  void girarRuleta(){ //METODO PARA PROBAR SUERTE EN LA RULETA
          System.out.println(color_rojo+"*TUS GEMAS ACTUALES SON* "+gemas+""+resetear_color);// MOSTRAMOS GEMAS ACUTALES
          System.out.println(color_blanco+"");
                    int num= (int) (Math.random()*100); //INICIALIZAMOS VARIABLE RANDOM
       
                if (gemas<5){ //CORROBORAMOS QUE TENGA AL MENOS 5 GEMAS
                    System.out.println("NO CUENTAS CON SUFICIENTES GEMAS PARA ENTRAR A LA RULETA");// SI SE CUMPLE LE DECIMOS QUE NO CUENTA CON GEMAS PARA JUGAR
                }
                else{// SI TIENE MAS GEMAS ENTONCES
                    System.out.println(resetear_color+"Bienvenido a la Ruleta (-5 Gemas)");
                    gemas-=5;// LE DESCONTAMOS 5 GEMAS PARA GIRAR LA RULETA
                    System.out.println(color_azul+"");
                        if (num>=0 && num<10){ // EVALUAMOS SI SALE UN NUMERO ENTRE 0 Y 10
                            int numero= (int) (Math.random()*2); // SI SE CUMPLE INICIALIZAMOS OTRO RANDOM
                            System.out.println(numero);
                            if(numero==2){ // SI ES DOS ENTONCES GANA EL PREMIO DE GEMAS
                                System.out.println("**HAS GANADO 1000 GEMAS**");
                                gemas+=1000; // AUMENTAMOS LAS GEMAS DEL USUARIO
                            }
                            else { // SINO GANA EL PREMIO DE ORO
                                System.out.println("**HAZ GANADO 2000 DE ORO**");
                                oro+=2000; // SUMAMOS EL ORO OBTENIDO AL ORO DEL USUARIO
                            }
                        }
                        else if (num>=10 && num<20){ // SI EL NUMERO ESTA ENTRE 10 Y 19 GANA PREMIO DE GEMAS
                                System.out.println("**HAS GANADO 40 GEMAS**");
                                gemas+=40;// LE SUMAMOS EL PREMIO A LAS GEMAS DEL USUARIO
                            }
                        else if(num>=20 && num<35){// SI EL NUMERO ESTA ENTRE 20 Y 34 GANA PREMIO DE ORO
                                System.out.println("**HAS GANADO 15 DE ORO**");
                                oro+=15; // LE SUMAMOS EL PREMIO AL ORO DEL JUGADOR
                        }
                        else if(num>=35 && num<65){ // SI EL NUMERO ESTA ENTRE 35 Y 64 ENTONCES GANA PREMIO DE GEMAS
                                 System.out.println("**HAS GANADO 5 GEMAS**");
                                 gemas+=5; // SUMAMOS EL PREMIO A LAS GEMAS DE JUGADOR
                        }
                        else { // AL SE UN NUMERO ENTRE 65 Y 100 GANA EL PREMIO DE ORO
                                 System.out.println("**HAS GANADO 10 DE ORO**");
                                    oro+=10; // SUMAMOS EL PREMIO AL ORO DEL JUGADOR
                        }
                } // MOSTRAMOS LAS GEMAS Y EL ORO ACTUAL
            System.out.println(color_verde+"TUS GEMAS RESTANTES: "+gemas+""+resetear_color);  
            System.out.println(color_amarillo+"TU ORO ACTUAL : "+oro+""+resetear_color);
        }
    
    public void Mostrar_Carros_Propios(){// METODO PARA MOSTRAR CARROS DEL USUARIO
        System.out.println("**TUS CARROS PROPIOS SON**");
        int posicion = 0;// INICIALIZAMOS EL CONTADOR PARA MOVERNOS POR EL ARREGLO
        while ((posicion < this.CANTIDAD_VEHICULOS) ) { // INICIAMOS CICLO QUE SE EJECUTARA MIENTRAS NUESTRO CONTADOR SEA MENOR A LA CANTIDAD DE VEHICULOS QUE PUEDE TENER EL USUARIO
            if (vehiculos[posicion] != null)// VERIFICAMOS QUE LA POSICION NO SEA NULA/VACIA
                vehiculos[posicion].presentarse(posicion); // AL CUMPLIRSE LLAMAMOS EL METODO DE PRESENTAR VEHICULOS, DE ACUERDO A LA POSICION DADA POR EL CONTADOR
            posicion++; // AUMENTAMOS EL CONTADOR EN UNA UNIDAD
        }
    }
    
    public void Menu_Garage(int pos,int gas){
        int op=0; // INICIALIZAMOS LA VARIABLE PARA EL SUB MENU DEL GARAGE
            while(op!=8 && op!=7){ //INICIAMOS CICLO QUE SE REPETIRA MIENTRAS LA OPCION QUE DIGITE NO SEA 8 O 7 QUE SON LA OPCION DE SALIR O DE CAMBIAR VEHICULO A EDITAR
                System.out.println("----BIENVENIDO AL GARAGE----");// DESPLEGAMOS EL MENU DEL GARAGE
                System.out.println(resetear_color+"\n1. Mejorar Potencia");
                System.out.println("2. Llenar Tanque");
                System.out.println("3. Mejorar Llantas");
                System.out.println("4. Cambiar Color");
                System.out.println("5. Ver Propiedades de Carro Actual");
                System.out.println("6. Comprar Nuevo Carro");
                System.out.println("7. Cambiar Vehiculo");
                System.out.println("8. Volver a Menu Principal");
                System.out.println("\n\tDigite que opcion desea");
                op= entrada.nextInt(); // GUARDAMOS LA OPCION DIGITADA POR EL USUARIO
                switch(op){ // EVALUAMOS LA OPCION
                    case 1: this.cambiarMotor(pos); //LLAMAMOS EL METODO DE CAMBIAR EL MOTOR, Y LE ENVIAMOS LA POSICION DEL VEHICULO PARA EDITAR
                    break;
                    case 2:
                        if ((100-gas)*2.5<=oro){ // VERIFICAMOS QUE TENGA MAS ORO DEL QUE SE VA A GASTAR PARA LLENAR EL TANQUE DE GASOLINA DEL VEHICULO
                            int gas_gastado= vehiculos[pos].getGalones_comprados()+(100-gas);// SI CUMPLE INIAÇCIALIZAMOS LA VARIABLE QUE LLEVARA LAS CUETNAS DE LOS GALONES DE CADA VEHICULO
                            vehiculos[pos].setGalones_comprados(gas_gastado);// ASIGNAMOS EL VALOR OBTENIDO DE LA VARIABLE ANTERIOR, UTILIZANDO UN SETTER
                             Llenar_Gas(pos,gas); // LLAMAMOS AL METODO PARA LLENAR LA GASOLINA, Y LE ENVIAMOS LA POSICION Y EL GAS ACTUAL DEL VEHICULO
                            oro-=((100-gas)*2.5); // DEFINIMOS EL NUEVO VALOR DEL ORO
                            double oro_gastado= vehiculos[pos].getOro_gastado()+((100-gas)*2.5); // INICIALIZAMOS VARIABLE QUE LLEVARA LAS CUENTAS DEL ORO GASTADO POR CADA VEHICULO
                            vehiculos[pos].setOro_gastado(oro_gastado); // ASIGNAMOS EL VALOR DE LA VARIABLE ANTERIOR A EL SETTER DE LA VARIABLE QUE LLEVARA EL CONTROL
                        }
                        else {// AL NO TENER SUFICIETNES GEMAS ENTONCES ENVIA UN MENSAJE DE ORO INSUFICIENTE
                            System.out.println(color_rojo+"*No tienes oro suficiente para llenar de gasolina*"+resetear_color);
                        }                                                                                     
                    break;
                    case 3:
                        this.cambioLlantas(pos); //LLAMAMOS AL METODO DE CAMBIO DE LLANTAS Y LE ENVIAMOS LA POSICION DEL VEHICULO 
                    break;
                    case 4:
                        if (oro<valor_nuevo_color){//SI TIENE MENOR ORO AL QUE SE NECETIRA DEPLEGAMOS EMNSAJE
                            System.out.println(color_rojo+"NO TIENES SUFICIENTE ORO PARA CAMBIAR DE COLOR"+resetear_color);
                        }
                        else{ // SI TIENE MAS ORO, LLAMAMOS AL METODO DE CAMBIAR EL COLOR Y LE ENVIAMOS LA POSICION
                            this.cambiarColor(pos);
                        }
                    break;
                    case 5:// LLAMAMOS AL METODO DE VER CARRO, UTILIZANDO LA POSICION DEL VEHICULO SELECCIONADO AL INICIO
                        vehiculos[pos].Presentar_Un_Carro(); 
                    break;
                    case 6:// LLAMAMOS AL METODO PARA COMPRAR UN NUEVO CARRO
                     this.Nuevo_Carro();
                    break;
                    case 7:// LLAMAMOS AL METODO DE MENU DE CAMBIOS PARA VOLVER A ESCOGER UN VEHICULO A EDITAR
                        this.Menu_Cambios();
                        
                    break;
                }// REGRESA AL MENU PRINCIPAL
            }
    }
   
    
    public void cambiarMotor(int pos){// METODO PARA EL CAMBIO DE MOTOR UTILIZANDO LA POSCCION RECIBIDA DE LLAMDAA
     int p1=4; /// DECLARAMOS VARIABLES PARA LA COMPARACION DE DATOS ACTUALES CON LO QUERIDOS POR EL USUARIO
     int p2=5;
     int p3=7;
     String m1="Basico";
     String m2= "Medio";
     String m3= "Alto";
            int op=0; // INICIALIZAMOS LA VARIABLES DEL SUB MENU DE CAMBIO DE MOTOR
            System.out.println("QUE MOTOR DESEAR ESCOGER:");// DESPLEGAMOS SUB MENU
            System.out.println("1.Basico");
            System.out.println("2.Medio");
            System.out.println("3.Alto");
            System.out.println("4.REGRESAR");
             op=entrada.nextInt();  // GUARDAMOS LA OPCION INGRESADA POR EL USUARIO  
            switch(op){ // EVALUAMOS OPCION INGRESADA
                    case 1:
                    if (vehiculos[pos].getMotor() == m1 ){// VEMOS SI EL MOTOR ACTUAL ES IGUAL AL MOTOR SELECCIONADO
                        System.out.println(color_rojo+"Usted ya cuenta con este motor"+resetear_color);
                    }
                    else{// EVALUAMOS QUE TENGA DINERO DISPONIBLE PARA LA COMPRA
                        if (this.gemas<5){ // SI NO TIENE LE INFORMAMOS QUE NO CUENTA CON OTRO SUFICIENTE
                            System.out.println(color_rojo+"*NO TIENES SUFICIENTES GEMAS PARA REALIZAR EL CAMBIO*"+resetear_color);
                        }
                        else{// CASO CONTRARIO, HACEMOS EL CAMBIO
                             System.out.println("CAMBIO REALIZADO");
                            vehiculos[pos].setMotor(m1); // CAMBIAMOS EL MOTOR DEL VEHICULO INGRESO
                            vehiculos[pos].setPotencia(p1);// CAMBIOS LA POTENCIA DEL VEHICULO INGRESADO
                            this.gemas-=5; // RESTAMOS GEMAS POR LA COMPRA REALIZADA
                        }
                           this.MostrarGemasYOro();// LE MOSTRAMOS LAS GE4MAS Y ORO QUE POSEE AUN EL JUGADOR
                    }
                    break;
                    case 2:
                    if(vehiculos[pos].getMotor()==m2){// VEMOS SI EL MOTOR ACTUAL ES IGUAL AL MOTOR SELECCIONADO
                      System.out.println(color_rojo+"Usted ya cuenta con este motor"+resetear_color);
                    }
                    else{//EVALUAMOS QUE TENGA DINERO DISPONIBLE PARA LA COMPRA
                        if( gemas<20){
                            System.out.println(color_rojo+"*NO TIENES SUFICIENTES GEMAS PARA REALIZAR EL CAMBIO*"+resetear_color);
                        }
                        else{// CASO CONTRARIO, HACEMOS EL CAMBIO
                            System.out.println("CAMBIO REALIZADO");
                            vehiculos[pos].setMotor(m2);// CAMBIAMOS EL MOTOR DEL VEHICULO INGRESO
                            vehiculos[pos].setPotencia(p2);// CAMBIOS LA POTENCIA DEL VEHICULO INGRESADO
                            this.gemas-=20; // RESTAMOS GEMAS POR LA COMPRA REALIZADA
                        }
                        this.MostrarGemasYOro();// LE MOSTRAMOS LAS GE4MAS Y ORO QUE POSEE AUN EL JUGADOR
                                  
                    } 
                    break;
                    case 3:
                        if (vehiculos[pos].getMotor()==m3){// VEMOS SI EL MOTOR ACTUAL ES IGUAL AL MOTOR SELECCIONADO
                               System.out.println(color_rojo+"Usted ya cuenta con este motor"+resetear_color);
                            }
                        else{//EVALUAMOS QUE TENGA DINERO DISPONIBLE PARA LA COMPRA
                            if (this.gemas<35){
                                System.out.println(color_rojo+"*NO TIENES SUFICIENTES GEMAS PARA REALIZAR EL CAMBIO*"+resetear_color);
                            }
                            else{// CASO CONTRARIO, HACEMOS EL CAMBIO
                                System.out.println("ingresaremos su solicitud");
                                vehiculos[pos].setMotor(m3);// CASO CONTRARIO, HACEMOS EL CAMBIO
                                vehiculos[pos].setPotencia(p3); // CAMBIOS LA POTENCIA DEL VEHICULO INGRESADO
                                this.gemas-=35; // RESTAMOS GEMAS POR LA COMPRA REALIZADA
                            }       
                            this.MostrarGemasYOro();  // LE MOSTRAMOS LAS GE4MAS Y ORO QUE POSEE AUN EL JUGADOR
                        }   
                    break;
                    case 4:System.out.println("Regreso a Menu");// SE REGRESA AL MENU PRINCIPAL
                    break;
                    
                }
              
        }
    public void cambiarColor(int pos){ //METODO PARA HACER EL CAMBIO DE COLOR
        String c1="Azul";// VARIABLES PARA LA COMPARACION
        String c2="Rojo";
        String c3= "Verde";
             
             int op=0;// INICIALIZAMOS LA VARIABLE PARA EL SUB MENU
             while(op!=4){ // CICLO PARA EL SUBMENU, QUE SE EJECUTARA MIENTRAS NO SE PRESIONE LA OPCION DE SALIR  
                    System.out.println("A QUE COLOR QUIERE CAMBIAR:");// DEPLEGAMOS EL MENU
                    System.out.println("1.Azul");
                    System.out.println("2.Rojo");
                    System.out.println("3.Verde");
                    System.out.println("4.REGRESAR");
                    op=entrada.nextInt(); // GUARDAMOS EL DATO INGRESADO POR EL USUARIO
                    switch(op){ // EVALUAMOS OPCIO INGRESADA POR USUARIO
                        case 1:
                            if(vehiculos[pos].getColor()== c1){// VEMOS SI EL COLOR ACTUAL ES IGUAL AL COLOR SELECCIONADO
                                System.out.println(color_rojo+"**YA POSEES ESTE COLOR**"+resetear_color);
                            }
                            else{// CASO CONTRARIO HACEMOS EL CAMBIO DE COLOR
                                System.out.println("Cambio de Color Hecho");
                                vehiculos[pos].setColor(c1);// CAMBIAMOS EL COLOR CON UN SET, UTILIZANDO LA POSICION DEL VEHICULO
                                oro-=20; //RESTAMOS EL COSTO DEL COLOR AL ORO DEL USUARIO
                            }
                            this.MostrarGemasYOro();//MOSTRAMOS LAS GEMAS Y ORO DEL JUGADOR
                            break;
                        case 2:
                            if (vehiculos[pos].getColor()==c2){// VEMOS SI EL COLOR ACTUAL ES IGUAL AL COLOR SELECCIONADO
                               System.out.println(color_rojo+"**YA POSEES ESTE COLOR**"+resetear_color);
                            }
                            else{// CASO CONTRARIO HACEMOS EL CAMBIO DE COLOR
                                System.out.println("Cambio de Color Hecho");
                                vehiculos[pos].setColor(c2);// CAMBIAMOS EL COLOR CON UN SET, UTILIZANDO LA POSICION DEL VEHICULO
                                oro-=20;//RESTAMOS EL COSTO DEL COLOR AL ORO DEL USUARIO
                            }
                            this.MostrarGemasYOro();//MOSTRAMOS LAS GEMAS Y ORO DEL JUGADOR
                            break;
                        case 3:
                            if (vehiculos[pos].getColor()==c3){// VEMOS SI EL COLOR ACTUAL ES IGUAL AL COLOR SELECCIONADO
                                System.out.println(color_rojo+"**YA POSEES ESTE COLOR**"+resetear_color);
                            }
                            else{// CASO CONTRARIO HACEMOS EL CAMBIO DE COLOR
                                System.out.println("Cambio de Color Hecho");
                                vehiculos[pos].setColor(c3);// CAMBIAMOS EL COLOR CON UN SET, UTILIZANDO LA POSICION DEL VEHICULO
                                oro-=20; //RESTAMOS EL COSTO DEL COLOR AL ORO DEL USUARIO
                            }
                            this.MostrarGemasYOro(); //MOSTRAMOS LAS GEMAS Y ORO DEL JUGADOR
                            break;     
                    }
             }   
         }  
     public void cambioLlantas(int pos){ // METODO PARA HACER AL CAMBIO DE LLANTAS
            int op=0; //INICIALIZAMOS LA VARIABLE QUE NOS AYUDARA A MOVERNOS POR EL MENU
            while(op!=4){ // INICIALIZAMOS CICLO QUE SE EJECUTARA MIENTRAS NO SEA LA OPCION 4 DE SALIR
            System.out.println("QUE LLANTAS DESEA");// PRESENTAMOS EL MENU
            System.out.println("1.Baja");
            System.out.println("2.Media");
            System.out.println("3.Alta");
            System.out.println("4.REGRESAR");
             op=entrada.nextInt();
            switch(op){ //EVALUAMOS LA OCION INGRESADA POR EL USUARIO
                    case 1:
                    if (vehiculos[pos].getLlantas()=="Baja"){// VEMOS SI LAS LLANTAS ACTUALES SON IGUAL A LA LLANTAS SELECCIONADAS
                        System.out.println(color_rojo+"Usted ya cuenta con este motor"+resetear_color);
                    }
                    else{
                        if(oro<25){ // EVALUAMOS QUE TENGA MAS ORO DEL QUE CUESTA
                            System.out.println(color_rojo+"*NO CUENTAS CON SUFICIENTE ORO*"+resetear_color);
                        }
                        else{ // SI TIENE ORO SUFICIENTE, HACEMOS EL CAMBIO POR MEDIO DE SETTERS
                             System.out.println("CAMBIO DE LLANTAS HECHO");
                        vehiculos[pos].setLlantas("Baja");
                        vehiculos[pos].setCoeficiente(2);
                        oro-=25; // DESCONTAMOS PRECIO DE LLANTAS A EL ORO DEL USUARIO
                        }
                    }this.MostrarGemasYOro();// MOSTRAMOS LAS GEMAS Y ORO DEL JUGADOR;
                    break;
                    case 2:
                    if(vehiculos[pos].getLlantas()=="Media"){// VEMOS SI LAS LLANTAS ACTUALES SON IGUAL A LA LLANTAS SELECCIONADAS
                       System.out.println(color_rojo+"Usted ya cuenta con este motor"+resetear_color);
                    }
                    else{
                        if (oro<50){//EVALUAMOS QUE TENGA MAS ORO DEL QUE CUESTA
                            System.out.println(color_rojo+"*NO CUENTAS CON SUFICIENTE ORO*"+resetear_color);
                        }
                        else{// SI TIENE ORO SUFICIENTE, HACEMOS EL CAMBIO POR MEDIO DE SETTERS   
                            System.out.println("CAMBIO HECHO");
                         vehiculos[pos].setLlantas("Media");
                         vehiculos[pos].setCoeficiente(3);
                         oro-=50;//DESCONTAMOS PRECIO DE LLANTAS A EL ORO DEL USUARIO
                        }
                        
                    }  this.MostrarGemasYOro();// MOSTRAMOS LAS GEMAS Y ORO DEL JUGADOR;
                    break;
                    case 3:
                    if (vehiculos[pos].getLlantas()=="Alta"){// VEMOS SI LAS LLANTAS ACTUALES SON IGUAL A LA LLANTAS SELECCIONADAS
                        System.out.println(color_rojo+"Usted ya cuenta con este motor"+resetear_color);
                    }
                    else{
                        if (oro<75){//EVALUAMOS QUE TENGA MAS ORO DEL QUE CUESTA
                            System.out.println(color_rojo+"*NO CUENTAS CON SUFICIENTE ORO*"+resetear_color);
                        }
                        else{// SI TIENE ORO SUFICIENTE, HACEMOS EL CAMBIO POR MEDIO DE SETTERS   
                            System.out.println("CAMBIO HECHO");
                        vehiculos[pos].setLlantas("Alta");
                        vehiculos[pos].setCoeficiente(5);
                        oro-=75;//DESCONTAMOS PRECIO DE LLANTAS A EL ORO DEL USUARIO
                        }                        
                    }this.MostrarGemasYOro();// MOSTRAMOS LAS GEMAS Y ORO DEL JUGADOR;
                    break; 
                   
                }
            }
        
    }
    
    public void Menu_Cambios(){
        
        int op=0;//MUESTRA CARROS DISPONIBLE
         this.Mostrar_Carros_Propios();
                        int carroMejorar=0;
                            System.out.println("Selecciona tu vehiculo:");
                            carroMejorar= entrada.nextInt();
                            if((carroMejorar-1>=0) && (carroMejorar-1<this.CANTIDAD_VEHICULOS)){
                                    if (this.vehiculos[carroMejorar-1]!=null){
                                            //si existe
                                        System.out.println("TU CARRO A EDITAR ES EL: "+this.vehiculos[carroMejorar-1].getNombreV().toUpperCase());
                                        this.Menu_Garage(carroMejorar-1,this.vehiculos[carroMejorar-1].getGasolina());
                                        
                                    }
                                    else{
                                        //vacio 
                                        System.out.println(color_rojo+"TU CARRO NO SE ENCUENTRA.\n"+resetear_color);
                                    }
                            }
    }
    
    public void Nuevo_Carro(){
        //VALOR DEL CARRO NUEVO
        int x=10; 
         System.out.println("**CARROS DISPONIBLES SON**");
                            int lugar = 0; // INICIAMOS CONTADOR
                            while ((lugar < this.NUM_VEHICULOS) ) {// INICIAMOS CICLO QUE SE EJECUTARA MIENTRAS SEA MENOR AL NUMERO DE CARROS QUE SE PUEDEN COMPRAR
                                if (carros[lugar] != null) // EVALUAMOS QUE LA POSICION DEL VEHICULO EN EL CONTADOR SEA DIFERENTE DE NULO/VACIO
                                    carros[lugar].presentarse1(lugar); // SI SE CUMPLE DESPLAJAMOS, Y LLAMAMOS AL METODO DE PRESENTARSE
                                    lugar++; // AUMENTAMOS EL CONTADOR EN UNA UNIDAD
                            }
                            System.out.println("");
                if (gemas>=x){ // evaluamos que las gemas de usuario sea mayor al precio por vehiculo
                    System.out.println("ESCOGE UN CARRO: "+this.getNickname().toUpperCase()); //IMPRIMIMOS EL NICKNAME DEL USUARIO
                    int posi=(entrada.nextInt()-1); // LA POSICION SELECCIONADA POR EL USUARIO LA GUARDAMOS Y LE DESCONTAMOS UNA UNIDAD
                   if (posi<= this.NUM_VEHICULOS){ // Y EVALUAMOS QUE LA POSICION DADA SEA MENO O IUGLA A LOS CARROS QUE PUEDE TENER EL USUARIO
                       String nom=carros[posi].getNombrev();// IGUALAMOS LOS DATOS DEL VEHICULO COMPRADO A LOS DATOS REQUERIDOS PARA FORMAR PARTE DE LOS CARROS DEL USUARIO
                    String mot= carros[posi].getMotor();
                    int pot= carros[posi].getPotencia();
                    String llan= carros[posi].getLlantas();
                    int coe= carros[posi].getCoeficiente();
                    String col= carros[posi].getColor();
                    String imag= carros[posi].getImagen();
                   int posici = 0; // INICIAMOS VARIABLE PARA VER LA POSICION
                        while ((posici < this.CANTIDAD_VEHICULOS ) && (vehiculos[posici] != null)) {
                            posici++;// EVALUAMOS QUE LA POSICION DADA SEA MENOR A LA CANTIDAD DE CARROS PARA EL USUARIO Y QUE LA POSICION SEA DIFERENTE DE 0
                        }           // PARA ASI PODER ENCONTRAR UN VALOR DEL CONTADOR IGUAL A NULO/VACIO Y GUARDAR POSICION
                        if (posici < this.CANTIDAD_VEHICULOS) { //EVALUAMOS NUEVAMENTE QUE LA POSICION SEA MENOR AL MAXIMO DE CARROS
                            vehiculos[posici] = new VehiculoPropio(nom,mot,pot,llan,coe,col,imag,100,0,0,0,0); // SI LO CUMPLE LE ENVIAMOS LOS DATOS AL CONTRUTOR PARA QUE CREE EL OBJETO
                            System.out.println(color_azul+"----SE HA REALIZADO TU COMPRA EXITOSAMENTE----"+resetear_color);
                            this.Mostrar_Carros_Propios(); // LLAMAMOS METODO PARA MOSTRAR LOS CARROS DEL USUARIO
                            gemas-=x; // RESTAMOS EL COSTO DEL VEHCIULO AL ORO DEL USUARIO
                            System.out.println(color_verde+"TUS GEMAS ACTUALES SON: "+this.getGemas()+resetear_color); // MOSTRAMOS EL ORO ACUTAL DE USUARIO
                            this.eliminarCarroNuevo(posi);// LLAMAMOS EL METODO PARA PODER ELIMINAR EL CARRO Y YA NO PUEDA ESTAR DISPONIBLE 
                        } 
                        else {// SI LA POSICION YA ES MAYOR, NO PUEDE COMPRAR MAS CARROS
                            System.out.println(color_rojo+"**NO PUEDES CREAR MAS CARROS**"+resetear_color);
                        }
                    }
                    else{// SI NO AH LLEGADO AL MAXIMO, PERO NO EXISTE LA POSICION EN EL ARREGLO DESPLIEGA MENSAJE
                    System.out.println(color_rojo+"**CARRO SELECCIONADO NO EXISTE**"+resetear_color);
                    }
                }
                else{// SI NO CUENTA CON EL ORO SUFICIETNE, DEPLIEGA MENAJE DE FALA DE ORO
                    System.out.println(color_rojo+"***NO CUENTAS CON ORO SUFICIENTE PARA REALIZAR LA COMPRA**"+resetear_color);
                }
                
                
                       
               
        
    }
    public  void eliminarVaciosCarrosNuevos(){
        int posicion = 0;// INICIAMOS CONTADOR
        while(posicion < this.NUM_VEHICULOS){ //INICIAMOS CICLO QUE SE EJECUTARA MIENRAS EL CONTADOR SEA MENOR A LA CANTIDAD DE CARROS DISPONIBLES PARA COMPRAR
            if (carros[posicion]== null){ // VEMOS SI LA POSSICION ES NULA
                int posicionAdelantada = posicion +1; // SI ES NULA ENTONCES INICIAMOS VARIABLE TEMPORAL PARA GUARDAR VALOR
                if (posicionAdelantada < this.NUM_VEHICULOS){ // VEMO QUE LA POSICION +1 ESTE DENTRO DEL ARREGLO AUN
                    if (carros[posicionAdelantada]!= null){ // LUEGO VEMOS QUE EL CARRO EN ESA POSICION SEA DIFERENTE DE NULA/VACIA
                        carros[posicion] = carros[posicionAdelantada]; // SI SE CUMPLE ENTONCES PEGAMOS EL NUEVO VALOR
                        carros[posicionAdelantada] = null; // Y LA POSICION QUE ESTABA DELANTE LA DECLARAMOS COMO NULA/VACIA
                    }
                }
            }
            posicion++; // AUMENTAMOS CONTADOR PARA SEGUIR HACIENDO LA COMPARACION
        }
    }
        
    public void eliminarCarroNuevo(int j) {
        if((j>=0) && (j<=this.NUM_VEHICULOS )){ // VEMOS QUE LA POSICION RECIBIDA SEA MAYOR A 0 Y QUE ESTE DENTRO DEL MAXIMO DE VEHICULOS DISPONIBLES PARA COMPRAR
            if (this.carros[j]!=null){ // SI EL VALOR EN LA POSICION RECIBIDA ES DISTINTA DE NULA/VACIA
                this.carros[j] = null; // LA POSICION DEL CARRO LA IGUALAMOS A UN VALOR NULO/VACIO
                this.eliminarVaciosCarrosNuevos(); // LLAMAMOS EL METODO PARA BORRAR ESPACIO O PARA ARREGLAR EL ARREGLO
            }
            else{ // AL ESTAR FUERA DE LOS PARAMETROS DESPLIEGA QUE NO ENCUENTRA EL CARRO
                System.out.println("Posicion no encontrada");
            }
        }
        else{// SI ENCUENTRA PERO ESTA FUERA DE PARAMETROS DESPLIEGA MENSAJE
                System.out.println("no exiten carros disponibles");
        }


    }
    
    public  void ASIGNAR_VEHICULOS_RIVAL(int nu){
         System.out.println(color_blanco+"");
         int pos=0; // INICIALIZAMOS EL CONTADOR PARA LA CREACION ALEATORIA DE VEHIUCLOS
       
            for(int i=0;i<CARROS_DE_COMPETIDORES;i++){ // CICLO QUE CREARA LOS RIVALES, UTILIZANDO LA POSICION RECIBIDA
                int num= (int) (Math.random()*15);// PEDIMOS NUMERO RANDOM
                if (num>0 && num<=5){// COMPARAMOS EL RANDOM
                    String llantas="Baja";
                    int coeficiente=2;
                    String imagen="[~½~]>";
                    int gasolina=100;
                    int num1= (int)(Math.random()*15);
                     if (num1>0 && num1<=5){
                         String color="Azul";
                         String motor="Basico";
                         int potencia=4;   // ASIGNAMOS VALORES Y CREAMOS EL CARRO EN LA POSICION DEL CICLO FOR
                         carros_com[i] = new CarroCompetidores ("BMW",motor,potencia,llantas,coeficiente,color,imagen,100);
                     }
                     else if(num1>5 && num1<=10){// COMPARAMOS EL RANDOM
                         String color="Rojo";
                         String motor="Medio";
                          int potencia=5;  // ASIGNAMOS VALORES Y CREAMOS EL CARRO EN LA POSICION DEL CICLO FOR
                         carros_com[i] = new CarroCompetidores ("Cabalier",motor,potencia,llantas,coeficiente,color,imagen,100);
                     }
                     else{// SINO EL RANDOM ES 
                         String color="Verde";
                         String motor="Alto";
                          int potencia=7;  // ASIGNAMOS VALORES Y CREAMOS EL CARRO EN LA POSICION DEL CICLO FOR
                         carros_com[i] = new CarroCompetidores ("Mazda",motor,potencia,llantas,coeficiente,color,imagen,100);
                     }
                }
                else if(num>5 && num<=10){// COMPARAMOS EL RANDOM
                    String llantas="Medio";
                    int coeficiente=3;
                    String imagen="[½]>";
                    int gasolina=100;
                    int num1= (int)(Math.random()*15);
                     if (num1>0 && num1<=5){// COMPARAMOS EL RANDOM
                         String color="Azul";
                          String motor="Alto";
                          int potencia=7;   // ASIGNAMOS VALORES Y CREAMOS EL CARRO EN LA POSICION DEL CICLO FOR
                         carros_com[i] = new CarroCompetidores ("BMW",motor,potencia,llantas,coeficiente,color,imagen,100);
                     }
                     else if(num1>5 && num1<=10){// COMPARAMOS EL RANDOM
                         String color="Rojo";
                          String motor="Basico";
                          int potencia=4;   // ASIGNAMOS VALORES Y CREAMOS EL CARRO EN LA POSICION DEL CICLO FOR
                         carros_com[i] = new CarroCompetidores ("Cabalier",motor,potencia,llantas,coeficiente,color,imagen,100);
                     }
                     else{// COMPARAMOS EL RANDOM
                         String color="Verde";
                          String motor="Medio";
                           int potencia=5;   // ASIGNAMOS VALORES Y CREAMOS EL CARRO EN LA POSICION DEL CICLO FOR
                         carros_com[i] = new CarroCompetidores ("Mazda",motor,potencia,llantas,coeficiente,color,imagen,100);
                     }
                    
                }
                else{
                    String llantas="Alta";
                    int coeficiente=5;
                    String imagen="[*.*]>";
                    int gasolina=100;
                    int num1= (int)(Math.random()*15);
                     if (num1>0 && num1<=5){// COMPARAMOS EL RANDOM
                         String color="Azul";
                         String motor="Medio";
                         int potencia=5;   // ASIGNAMOS VALORES Y CREAMOS EL CARRO EN LA POSICION DEL CICLO FOR
                         carros_com[i] = new CarroCompetidores ("BMW",motor,potencia,llantas,coeficiente,color,imagen,100);
                     }
                     else if(num1>5 && num1<=10){// COMPARAMOS EL RANDOM
                         String color="Rojo";
                         String motor="Basico";
                         int potencia=4;  // ASIGNAMOS VALORES Y CREAMOS EL CARRO EN LA POSICION DEL CICLO FOR
                         carros_com[i] = new CarroCompetidores ("Cabalier",motor,potencia,llantas,coeficiente,color,imagen,100);
                     }
                     else{// COMPARAMOS EL RANDOM
                         String color="Verde";
                         String motor="Alto";
                          int potencia=5;  // ASIGNAMOS VALORES Y CREAMOS EL CARRO EN LA POSICION DEL CICLO FOR
                         carros_com[i] = new CarroCompetidores ("Mazda",motor,potencia,llantas,coeficiente,color,imagen,100);
                     }
                }
            } 
            int lu = 0; // INICIAMOS CONTADOR
            while ((lu < nu) ) { // EVALUAMOS QUE E CONTADOR SEA MENOR AL NUMERO DE RIVALES RECIBIDO
            if (carros_com[lu] != null) // VEMOS QUE LAS POSICIONES SEAN DIFERENTES DE UN VALOR NULO/VACIO
                carros_com[lu].Ver_Carros_Rivales(lu); // SI SE CUMPLE DEPLEJAMOS INFORMACION LLAMANDO AL METODO
                lu++; // AUMENTAMOS VARIABLE EN UNA UNIDAD
                
            }
            System.out.println("");
            System.out.println("");
           this.menu_competir(nu);// LLAMAMOS AL METODO Y LE ENVIAMOS EL NUMERO DE RIVALES
             
            
     }                      
    
    public  void menu_competir(int num_rival){
        Scanner scan= new Scanner(System.in); // INICAMOS SCANNER PARA LOS DATOS PEDIDOS POR CONSOLA
         int op=0; // INICIAMOS CONTADOR
        
        System.out.println(color_naranja+"** TUS CARROS SON: **"+resetear_color);// PREENTAMOS CARROS DISPONIBLES PARA LA CARRERA
        int posicion = 0;
        do{
         if (vehiculos[posicion] != null)// SI EL CVALOR EN LA POSICION QUE DIGA EL USUARIO SEA DIFERENTE DE UN VALOR NULO/ VACIO
                vehiculos[posicion].presentarse(posicion); // MOSTRARA LAS CARACTERISTICAS DEL CARRO ESCOGIDO
            posicion++; // AUMENTA EN UNA UNIDAD AL CONTADOR
         }while((posicion < 5) ); // SE EJECUTARA TODO LO ANTERIOS, MIENTRAS EL CONTADOR SEA MENOR A 5
        
        System.out.println("ESCOGE UN CARRO PARA COMPETIR");
        int num_carro=scan.nextInt();//GUARDO LA POSICION DEL CARRO
        
        System.out.println("** LAS PISTAS DISPONIBLES SON: **");
        int posi = 0;
        do{
         if (pistas != null)  // VE QUE LAS PISTAS SEAN MENOR A 0
            System.out.println(posi+1+"."); // DESPLIEGA LAS PISTAS
            pistas[posi].Presentar_Pistas();
            posi++; //AUMENTA CONTADOR EN UNA UNIDAD
         }while((posi < 3) );// LO HARA MIENTRAS EL CONTADOR SE MENOR A 3 QUE SON LAS PISTAS DISONIBLES
        int pista=0;
        System.out.println("ESCOGE UNA PISTA: ");
        int num_pista=scan.nextInt();//GUARDO LA POSICION DE LA PISTA
        
        // CORROBORA QUE TENGA SUFICIENTE GASOLINA PARA REALIZAR LA CARRERA
        if( vehiculos[num_carro-1].getGasolina()>= pistas[num_pista-1].getGas_requerido()){
            this.Competencia(num_carro, num_pista,num_rival); // LLAMA AL METODO COMPETENCIA Y LE MANDA LOS DATOS
        }
        else{// SINO TIENE GASOLINA SUFICIENTE LO REGRESA AL MENU
        System.out.println("NO CUENTAS CON LA GASOLINA REQUERIDA");
        }
            
        
       
       
    }
    public void Competencia(int carro,int pista,int num_rival){
       for(int a=0;a<NUM_RIVALES;a++){// INICIA EL CONTADOR PARA LIMPIAR
           podio[a]= null; // LIMPIA O IGUALA A NULO/VACIO EL PODIO
       }
        // VARIABLES PARA LA ABSTRACCION DE CASILLAS QUE SE MOVERAN
        int x;
        int y;
        int pot=(vehiculos[carro-1].getPotencia());
        int cof=pistas[pista-1].getCoeficiente();
        int cof_carro=vehiculos[carro-1].getCoeficiente();
        int cont=0;
        // declaro el kilometraje al carro
               int op1=0;  
                int op=0;
                int pos=0;
               //DEFINO QUE UNA VARIABLE SERA IGUAL A LA GASOLINA QUE TIENE EL VEHICULO MENOS EL GAS QUE REQUIERE LA PISTA
               int rest_gas= vehiculos[carro-1].getGasolina()- pistas[pista-1].getGas_requerido();
                            // AL CUMPLIRLE LE ASIGNO UN NUEVO VALOR DE GASOLINA AL VEHICULO POR EMDIO DEL SETTER 
                             vehiculos[carro-1].setGasolina(rest_gas);
                // DEFINO VARIABLE QUE LLEVARA CONTROL DE LA DISTANCIA QUE VA CORRIENDO 
               int distancia= vehiculos[carro-1].getDistancia()+pistas[pista-1].getGas_requerido();
                vehiculos[carro-1].setDistancia(distancia);//  SI SE CUMPLE LE ASIGNO EL NUEVO VALOR POR MEDIO DE UN SETTER
                // DEFINO UNA VARIABLE QUE LLAVARA EL CONTROL DE LA GASOLINA QUE GASTO
                int gas_gastado= vehiculos[carro-1].getGalones_gastados()+pistas[pista-1].getGas_requerido();
                vehiculos[carro-1].setGalones_gastados(gas_gastado);// SI SE CUMPLE LE ASIGNO EL NUEVO VALOR POR MEIO DE UN SETTER
                             System.out.println("LISTO PARA LA CARRERA?..."); // DESPLIEGO MENU DE COMPETENCIA
                     System.out.println("1. para continuar");
                int eleccion=0;// PIDO SELECCION DEL USUARIO PARA CONTINUAR 
                 while(eleccion!=2){// EVALUO LA OPCION DEL USUARIO
                     
                     System.out.println("2. Regresar");// DESPLIEGO OPCION PARA SALIR
                     eleccion= entrada.nextInt();// PIDO LA OPCION DIGITADA POR EL USUARIO
                     int u=0; // INICIO CONTADOR
                         switch(eleccion){// EVALUO LA OPCION DIGITADA POR EL USUARIIO
                         case 1: 
                             // CICLO QUE EJECUTARA MIENTRAS LA POSICION DEL CARRO DEL USUARIO SEA MENOR AL TAMAÑO DE LA PISTA
                                while(op <pistas[pista-1].getTamaño_carretera() ){   
                                u++; // SUMO UNA UNIDAD A CONTADOR
                                cont++; // SUMO UNA UNIDAD A CONTADOR
                                System.out.println("RONDA NO: "+cont); //DESPLIEGO EN NO DE RONDA
                                //MOVIMIENTO CARROS RIVALES
                               for(int j=0;j<num_rival;j++){ //CICLO QUE GENERARA UN NUMERO RANDOM PARA CADA CARRO DE RIVAL
                                int random= (int) (Math.random()*10);
                                int random1= (int)(Math.random()*5); // "y" SERA LA POSICION QUE SE MOVERA
                                  y = ((carros_com[j].getPotencia()*random)+pistas[pista-1].getCoeficiente()+(carros_com[j].getCoeficiente()*random1));
                                  pos= carros_com[j].getPosicion();// PIDO LA POSICION DEL VEHICULO
                                  pos+=y;    // LE SUMO EL VALOR DADO POR "y"
                                  
                                    carros_com[j].setPosicion(pos); // LE ASIGNO POR MEDIO DE UN SETTER AL VEHICULO EN CUESTION UNA NUEVA POSICION
                                    for(int ñ=0; ñ<1;ñ++){ // ESTE CICLO HACE QUE VAYA POR TURNOS Y NO DE GOLPE
                                        System.out.println("turno de: "+ rival[j].getNombre()); //MUESTRO EL TURNO DEL RIVAL QUE LE TOCA
                                        for(int i=0;i<=pos && i<pistas[pista-1].getTamaño_carretera();i++){// CICLO PARA PINTAR LA CARRETERA HASTA LA POSICION DEL VEHICULO
                                            if(pistas[pista-1].getTamaño_carretera()==80){ // CONDICION PARA VER EL COLOR QUE PINTARA LA CARRETERA
                                                System.out.print(color_cafe_pista+"-"+resetear_color);
                                            }
                                            else if(pistas[pista-1].getTamaño_carretera()==90){
                                                System.out.print(color_ama_pista+"-"+resetear_color);
                                            }
                                            else{
                                                System.out.print(color_gris_pista+"-"+resetear_color);
                                            }
                                    }
                                    
                                        pos=0; // LIMPIO LA VARIABLE QUE ASIGNA VALORES DE POSICION POR MEDIO DEL SET
                                    }// CONDICION PARA IR COLOCANDO EL PODIO
                                    if(carros_com[j].getPosicion()>= pistas[pista-1].getTamaño_carretera()){
                                       int n=0;
                                       while(podio[n]!= null){
                                           if(podio[n]!= null){
                                               n++;
                                            }
                                       }
                                           
                                           podio[n]= new Podio(rival[j].getNombre());
                                       }
                                    
                                    // INSERTO LA IMAGEN DEL VEHICULO DE ACUERDO A SU POSICION DEL CONTADOR
                                       System.out.print(carros_com[j].getImagen());
                                       System.out.println("");
                                      
                                       // PREGUNTO PARA QUE VAYA UNO POR UNO
                                       System.out.println("Ingresa 1 para continuar");
                                    int elec= entrada.nextInt(); // SOLO PARA HACER LA PAUSA
                                 }
                               //MOVIMIENTO CARRO DEL JUGADOR
                               int random= (int) (Math.random()*10);// GENERO LOS RANDOMS
                                int random1= (int)(Math.random()*5);
                               x= ((pot* random) + cof +(cof_carro*random1));// guardo posicion de casillas a mover
                               op+=x;           // OP LLEVARA LA SUMATORIA DE LAS POSICIONES QUE SE VA MOVIENTO EL USUARIO
                                System.out.println("turno de: "+ this.nickname.toUpperCase()); // DESPLIEGO NICKNAME DEL USUARIO
                               for (int i=0;i<op && i< pistas[pista-1].getTamaño_carretera();i++){ // CICLO QUE SE EJECUTARA MIENTRAS EL CONTADOR SEA MENOR AL TAMAÑO DE LA PISTA Y MENOR AL OP, QUE LLEVA EL REGISTRO DE LA POSICION TOTAL A MOVER
                                  if(pistas[pista-1].getTamaño_carretera()==80){// CONDICION ARA PINTAR LA CARRETRA DEPENDIENDO DE LA PISTA SELECCIONADA
                                                System.out.print(color_cafe_pista+"-"+resetear_color);
                                            }
                                            else if(pistas[pista-1].getTamaño_carretera()==90){
                                                System.out.print(color_ama_pista+"-"+resetear_color);
                                            }
                                            else{
                                                System.out.print(color_gris_pista+"-"+resetear_color);
                                            }
                                }
                               if(op>= pistas[pista-1].getTamaño_carretera()){// ASIGNACION DE LUGAR EN EL PODIO, SI LLEGA PRIMERO
                                       int no=0;
                                       while(podio[no]!=null){
                                           if(podio[no]!= null){
                                               no++;
                                            } 
                                       }
                                            
                                                podio[no]= new Podio(this.nickname);
                                       }// DESPLIEGO IMAGEN DEL VEHICULO_PROPIO DEL JUGADOR
                               System.out.print(vehiculos[carro-1].getImagen());
                                 System.out.println("");
                               
                             
                                 System.out.println(""); // CORTO EL NO DE RONDA
                             System.out.println(color_rojo+"-------------------------------------------------->"+resetear_color);
                                    x=0;// LIMPIO EL NUMERO DE CASILLAS A MOVER, PARA GENERAL UNO NUEVO
                             }
                                System.out.println("-----------EL GANADOR ES ---------- ");
                                System.out.println(podio[0].getNombre());// DESPLIEGO EL PRIMER NOMBRE EN PODIO
                                if(podio[0].getNombre()== this.nickname){// EVALUO SI ES IGUAL AL NICKNAME DEL USUARIO, SI SI QUIERE DECIR QUE EL GANO
                                    int total=0; //VARIABLEA PARA DETERMINAR RECOMPENSAS
                                    int prom_gemas;
                                    int total_gemas;
                                    System.out.println(color_azul+"**FELICIDADES HAZ GANADO LA CARRERA**"+ resetear_color);
                                    for(int p=0; p<num_rival;p++){ // CICLO PARA HHALAR UN PROMEDIO DE LA POTENCIA DE TODOS LOS JUGADORES CONTRA LOS QUE COMPITIO
                                       total+= carros_com[p].getPotencia();
                                    }
                                    int random3= (int) (Math.random()*10);
                                    prom_gemas= total/num_rival;// SACO LA RECOMPENSA
                                    total_gemas=(prom_gemas*random3)+pistas[pista-1].getCoeficiente();
                                    this.gemas+=total_gemas;// SUMO LAS RECOMPENSAS AL ORO DEL JUGADOR Y LAS GEMAS DE EL TAMBIEN
                                    this.oro+=total_gemas;
                                }
                                else{// EN CASO QUE PIERDA SOLO DEPSLIEGO MESANJE DE DERROTA
                                    System.out.println(color_rojo+"Lo sentimos, Has perdido"+resetear_color);
                                } 
                             break;
                         case 2:System.out.println("");// REGRESA A MENU
                             break;
                         default://REGRESA
                             break;
                     }  
                }
             System.out.println("");    
    }    
    
}
    
    
     
    


    
    
