
package data;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author David
 */
public class Etiqueta implements Serializable{
    public int[] coordenadas;
    /*String nick;*/
    /**
     * Constructor de la Etiqueta 
     * Ingresa las coordenadas del marco de la etiqueta del usuario
     * @param coordenadax
     * @param coordenaday 
     */    
    public Etiqueta(int coordenadax, int coordenaday) {
        int[] xy = {coordenadax, coordenaday};
        this.coordenadas = xy;
    }
    
    public int[] getCoordenadas() {
        return coordenadas;
    }
    
    public void setCoordenadas(int coordenadax, int coordenaday) {
        int[] xy = {coordenadax, coordenaday};
        this.coordenadas = xy;
    }
    /**
     * Se sobre escribe el metodo de la clase predeterminada Object
     * @return Devuelve un String con las coordenadas de la etiqueta
     */
    @Override
    public String toString() {
        return /*"Nick="+nick+*/" ,coordenadas=" + Arrays.toString(coordenadas) + '}';
    }
    
    
}
