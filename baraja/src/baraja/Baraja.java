package baraja;

import java.util.*;

/**
 *
 * @author Ismael Fuentes Sintes
 */
public class Baraja {
    //arraylist de cartas inicial
    static ArrayList<carta> baraja = new ArrayList<carta>();
    //arraylist de cartas jugadas
    static ArrayList<carta> cartasJugadas = new ArrayList<carta>();
    static String tipo[] = {"espadas","bastones","oros","copas"};//4
    static int numeros[] = {1,2,3,4,5,6,7,10,11,12};//10
    static Scanner datos = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //llenamos la baraja con 40 cartas
        rellenarBaraja();
        menu();
    }
    
    public static void rellenarBaraja(){
        int num;
        int tipos;
        
        for(int i = 0; i < 40; i++){
            //numero aleatorio del indice de los arrays para asignar los parámetros 
            num = (int)(Math.random() * 10);
            tipos = (int)(Math.random() * 4);
            baraja.add(new carta(numeros[num],tipo[tipos]));
        }
    }
    
    public static void menu(){
        System.out.println("");
        System.out.println("1) cartas disponibles");
        System.out.println("2) dar cartas al jugador");
        System.out.println("3) cartas jugadas");
        System.out.println("4) Mostrar baraja");
        System.out.println("5) dar siguiente carta");
        System.out.print("introduce una opcion: ");
        int opcion = datos.nextInt();
      
        switch(opcion){
            case 1:
                cartasDisponibles();
                menu();
                break; 
            case 2:
                darCarta();
                menu();
                break;
            case 3:
                cartasJugadas();
                menu();
                break;
            case 4:
                mostrarBaraja();
                menu();
            case 5:
                siguienteCarta();
                menu();
            default:
                break;
        }
    }
    
    //cartas disponibles baraja inicial
    public static void cartasDisponibles(){
        System.out.println("Cartas disponibles: "+ baraja.size());
    }
    
    //darcarta
    public static void darCarta(){
        System.out.println("¿Cuantas cartas quieres?");
        int cartas = datos.nextInt();
        
        if(cartas <= baraja.size()){
            for(int i = 0; i < cartas; i++){
                System.out.println(baraja.get(i).getNumero()+" "+baraja.get(i).getTipo());
                //asigna la carta a la baraja del jugador
                cartasJugadas.add(baraja.get(i));
                //elimina las carta que ha dado al jugador de la baraja inicial
                baraja.remove(i);
            }
        }else{
            System.out.println("No hay suficientes cartas en la baraja");
        }
    }
    
    //cartas jugadas
    public static void cartasJugadas(){
        if(cartasJugadas.size() > 0){
            System.out.println("Cartas jugadas: "+cartasJugadas.size());
        }else{
            System.out.println("No se han jugado cartas aún");
        }
    }
    
    //muestra la baraja entera
    public static void mostrarBaraja(){
        for(int i = 0; i < baraja.size(); i++){
            System.out.println(baraja.get(i).getNumero()+" "+baraja.get(i).getTipo());
        }
    }
    
    //devuelve la siguiente carta
    public static void siguienteCarta(){
        try{
            //si la baraja de cartas sigue llena deuvelve la primera carta disponible
            System.out.println(baraja.get(0).getNumero()+" "+baraja.get(0).getTipo());
            baraja.remove(0);
        }catch(Exception e){
            //si la baraja de cartas está vacia devuelve este mensaje de error
            System.out.println("No quedan cartas");
        }
        
    }
    
}
