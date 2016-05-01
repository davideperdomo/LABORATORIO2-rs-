/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
