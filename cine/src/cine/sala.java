package cine;

import java.util.Scanner;

/**
 *
 * @author Ismael Fuentes Sintes
 */
public class sala {
    private static Scanner datos = new Scanner(System.in);
    private int asientos;
    private int filas;
    private int columnas;
    
    public sala(){
        
    }
    
    public sala(int filas, int columnas){
        this.asientos = filas * columnas; //numero de asientos disponibles
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getAsientos() {
        return asientos;
    }

    public int getFilas() {
        return filas;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getColumnas() {
        return columnas;
    }
    
}
