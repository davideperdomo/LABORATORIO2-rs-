
package data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Fotografia implements Serializable{
    private String nombre;
    private String descripcion;
    private ArrayList<Etiqueta> etiquetas = new ArrayList<>();;
    
    //private Usuario publicador;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Etiqueta> getEtiquetas() {
        return etiquetas;
    }
/*
    public Usuario getPublicador() {
        return publicador;
    }
*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void addEtiquetas(Etiqueta etiqueta) {
        this.etiquetas.add(etiqueta);
    }
    
    
    
/*
    public void setPublicador(Usuario publicador) {
        this.publicador = publicador;
    }
*/
    @Override
    public String toString() {
        return "Fotografia{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", etiquetas=" + etiquetas + /*", publicador=" + publicador +*/ '}';
    }

    
    
    
}
