package cine;

/**
 *
 * @author Ismael
 */
public class pelicula_animacion extends pelicula{
    
    private int fotogramas; //fotogramas por segundo
    private int tipo; //tipo fotogramas
    
    public pelicula_animacion(String titulo, int duarcion, int edad_min, String director, int fotogramas, int tipo) {
        super(titulo, duarcion, edad_min, director);
        this.fotogramas = fotogramas;
        this.tipo = tipo;
    }

    public int getFotogramas() {
        return fotogramas;
    }

    public int getTipo() {
        return tipo;
    }

    public void setFotogramas(int fotogramas) {
        this.fotogramas = fotogramas;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
