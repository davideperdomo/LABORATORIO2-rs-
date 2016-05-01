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
