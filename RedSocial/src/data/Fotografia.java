
package data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase Fotografía que implementa la interfaz serializable
 * @author David
 */
public class Fotografia implements Serializable{
    private String nombre;
    private String descripcion;
    private ArrayList<Etiqueta> etiquetas = new ArrayList<>();;
    
    /**
     * 
     * @return Devuelve el titulo de la fotografía
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return Devuelve la descripcion de la fotografía 
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * 
     * @return Devuelve un array que contiene las etiquetas de la fotografía
     */
    public ArrayList<Etiqueta> getEtiquetas() {
        return etiquetas;
    }
    /**
     * Define el titulo de la foto
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Define la descripcion
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Agrega una etiqueta al array de etiquetas de la foto
     * @param etiqueta 
     */
    public void addEtiquetas(Etiqueta etiqueta) {
        this.etiquetas.add(etiqueta);
    }
    /**
     * Se sobre escribe el metodo de la clase predeterminada Object
     * @return Devuelve un String con el nombre y la descripcion 
     */
    @Override
    public String toString() {
        return "Fotografia{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", etiquetas=" + etiquetas +'}';
    }

    
    
    
}
