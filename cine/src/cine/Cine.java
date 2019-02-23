package cine;

import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

/**
 *
 * @author Ismael Fuentes Sintes
 */
public class Cine {

    static Scanner datos = new Scanner(System.in);
    static ArrayList<espectador> misEspectadores = new ArrayList<espectador>();
    static ArrayList<espectador> espectadoresConEdad = new ArrayList<espectador>();
    static ArrayList<String> asientos = new ArrayList<String>();
    static pelicula miPelicula = new pelicula("El señor de los anillos",120,16,"Jeorge Lucas");
    static int entrada;
    static String etiquetas[] = {"A","B","C","D","E","F","G","H","I"};
    //static boolean puedeSentarse;
    
    public static void main(String[] args) {
        
        simulacion();
    }
    
    public static void simulacion(){
        System.out.print("Introduce filas del cine: ");
        int filas = datos.nextInt();
        System.out.print("Introduce columnas del cine: ");
        int columnas = datos.nextInt();
        
        //creamos la sala (los asientos se calculan automaticamente)
        sala miSala = new sala(filas,columnas);
        
        System.out.print("Introduce precio de la entrada: ");
        entrada = datos.nextInt();
        System.out.print("Introduce el numero de espectadores: ");
        int num = datos.nextInt();
        
        //generamos los espectadores
        generarEspectadores(num);
        //imprime los espectadores
        imprimirEspectadores();
        //imprime la pelicula
        imprimirPelicula();
        //sala
        generarAsientos(miSala);
        //generarEntrada
        generarEntrada(miPelicula, entrada);
    }
    
    //genera los espectadores
    public static void generarEspectadores(int num){
        int edad = 0;
        int dinero = 0;
        String nombre = "espectador";
        //genera los espectadores con edad y dinero aleatorio
        for(int i = 0; i < num; i++){
            edad = (int) (Math.random() * 99);
            dinero = (int) (Math.random() * 20);
            misEspectadores.add(new espectador(nombre,edad,dinero));
        }
    }
    
    public static void imprimirEspectadores(){
        System.out.println("\r\nEspectadores que pueden ver la pelicula");
        for(espectador esp:misEspectadores){
            if(esp.getEdad() >= miPelicula.edad_min && esp.getPresupuesto() >= entrada){
            espectadoresConEdad.add(esp);
            System.out.println(
                    "|Nombre: "+esp.getNombre()+
                    "|Edad: "+esp.getEdad()+
                    "|Presupuesto: "+esp.getPresupuesto());
            }
        }
    }
    
    public static void imprimirPelicula(){
        System.out.println("\r\nPelicula");
        System.out.print("|Nombre: "+miPelicula.getTitulo());
        System.out.print("|Director: "+miPelicula.getDirector());
        System.out.print("|Duracion: "+miPelicula.getDuarcion());
        System.out.print("|Edad min: "+miPelicula.getEdad_min()+"\n");
    }
    
    public static void generarAsientos(sala sala){
        System.out.println("\r\nAsientos");
        for(int i = 1; i <= sala.getFilas(); i++){
            for(int j = 0; j <= sala.getColumnas(); j++){
                if(espectadoresConEdad.size() >= i){
                    System.out.println(
                        "["+i+etiquetas[i]+"]" + "Reservado");
                    asientos.add("["+i+etiquetas[i]+"]");
                }else{
                    System.out.println("["+i+etiquetas[i]+"]"+ "Vacio");
                }
            }
        }
    }
    
    public static void generarEntrada(pelicula peli, int precio){
       FileOutputStream fos = null;
        File file;
        
        String contenido = "-------------------\r\n"
                         + "      Entradas     \r\n"
                         + "-------------------\r\n";
        
        for(int i = 0; i < espectadoresConEdad.size(); i++){
            
            contenido += "-----Entrada nº"+i+"----\r\n"+
                         "Nombre: "+peli.getTitulo()+"\r\n"+
                         "Duración: "+peli.getDuarcion()+"\r\n"+
                         "Precio: "+precio+"\r\n"+
                         "Asiento: "+asientos.get(i)+"\r\n";

        }
        
        try {
            file = new File("C:/Users/usuario/Desktop/documento.txt");
            fos = new FileOutputStream(file);
            
            if(!file.exists()){
                file.createNewFile();//si el fichero no existe creará uno
            }
            
            byte[] arrayDeBytes = contenido.getBytes();
            fos.write(arrayDeBytes);
            fos.flush();
            System.out.println("Datos escritos!!");
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                if(fos != null){
                    fos.close();
                }
            }catch(Exception e){
                System.out.println("Error al cerrar el stream");
            }
        }
    }
    
}
