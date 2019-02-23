package cine;

/**
 *
 * @author Ismael
 */
public class pelicula_3d extends pelicula{
    
    private String proyeccion;//doble o IMAX
    private String formato; //analogico o digital
    
    public pelicula_3d(String titulo, int duarcion, int edad_min, String director, String proyeccion, String formato){
        super(titulo, duarcion, edad_min, director);
        this.proyeccion = proyeccion;
        this.formato = formato;
    }

    public String getProyeccion() {
        return proyeccion;
    }

    public String getFormato() {
        return formato;
    }

    public void setProyeccion(String proyeccion) {
        this.proyeccion = proyeccion;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
}
