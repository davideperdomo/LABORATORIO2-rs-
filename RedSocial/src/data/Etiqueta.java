
package data;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Clase Etiqueta que implementa la interfaz serializable
 * Guarda las coordenadas del marco de la etiqueta en la fotografía
 * @author David
 */
public class Etiqueta implements Serializable{
    public int[] coordenadas;
    String nick;
    /**
     * Constructor de la Etiqueta 
     * Ingresa las coordenadas del marco de la etiqueta del usuario
     * @param coordenadax
     * @param coordenaday 
     */    
    public Etiqueta(int coordenadax, int coordenaday,String nick) {
        int[] xy = {coordenadax, coordenaday};
        this.coordenadas = xy;
        this.nick = nick;
    }
    
    public int[] getCoordenadas() {
        return coordenadas;
    }

    public String getNick() {
        return nick;
    }
        
    public void setCoordenadas(int coordenadax, int coordenaday) {
        int[] xy = {coordenadax, coordenaday};
        this.coordenadas = xy;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
    /**
     * Se sobre escribe el metodo de la clase predeterminada Object
     * @return Devuelve un String con las coordenadas de la etiqueta
     */
    @Override
    public String toString() {
        return "Nick="+nick+" ,coordenadas=" + Arrays.toString(coordenadas) + '}';
    }
    
    
}
