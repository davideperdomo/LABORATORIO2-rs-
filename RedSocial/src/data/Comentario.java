
package data;

import java.io.Serializable;

/**
 * Clase Comentario que implementa la interfaz serializable
 * @author David
 */
public class Comentario implements Serializable{
    private String texto;
    private String fecha;
    /**
     * 
     * @return Devuelve el texto del comentario 
     */
    public String getTexto() {
        return texto;
    }
    /**
     * 
     * @return Devuelve la fecha en la que se publicó el comentario, como tipo String
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * Define el texto del comentario
     * @param texto 
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    /**
     * Define la fecha de publicacion del comentario
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * Se sobre escribe el metodo de la clase predeterminada Object
     * @return Devuelve un String con el texto y la fecha 
     */
    @Override
    public String toString() {
        return "Comentario{" + "texto=" + texto + ", fecha=" + fecha + '}';
    }   
}
