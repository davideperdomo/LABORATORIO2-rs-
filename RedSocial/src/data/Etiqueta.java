
package data;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Etiqueta implements Serializable{
    public int[] coordenadas;
    
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
}
