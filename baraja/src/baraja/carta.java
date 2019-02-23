package baraja;

/**
 *
 * @author Ismael Fuentes Sintes
 */
public class carta {
    
    private int numero;
    private String tipo;
    
    public carta(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
