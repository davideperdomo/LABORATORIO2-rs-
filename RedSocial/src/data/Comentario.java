
package data;

/**
 *
 * @author David
 */
public class Comentario {
    private String texto;
    private String fecha;

    public String getTexto() {
        return texto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Comentario{" + "texto=" + texto + ", fecha=" + fecha + '}';
    }
    
    
    
}
