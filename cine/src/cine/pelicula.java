package cine;

/**
 *
 * @author Ismael
 */
public class pelicula {
    
    public String titulo;
    public int duarcion;
    public int edad_min;
    public String director;

    public pelicula(String titulo, int duarcion, int edad_min, String director) {
        this.titulo = titulo;
        this.duarcion = duarcion;
        this.edad_min = edad_min;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuarcion() {
        return duarcion;
    }

    public int getEdad_min() {
        return edad_min;
    }

    public String getDirector() {
        return director;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuarcion(int duarcion) {
        this.duarcion = duarcion;
    }

    public void setEdad_min(int edad_min) {
        this.edad_min = edad_min;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
}
