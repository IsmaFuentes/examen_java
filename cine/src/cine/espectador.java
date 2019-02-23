package cine;

/**
 *
 * @author Ismael Fuentes Sintes
 */
public class espectador {
    
    private String nombre;
    private int edad;
    private int presupuesto; //dinero que posee el espectador

    public espectador(String nombre, int edad, int presupuesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
}
