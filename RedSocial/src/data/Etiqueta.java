
package data;

/**
 *
 * @author David
 */
public class Etiqueta {
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
