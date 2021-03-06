
package juego;

public class Alienigena {
    protected String color;
    protected int extremidades;
    protected int nivelInteligencia;
    protected String planeta;

    public Alienigena(String color, int extremidades, int nivelInteligencia, String planeta) {
        this.color = color;
        this.extremidades = extremidades;
        this.nivelInteligencia = nivelInteligencia;
        this.planeta = planeta;
    }
          
    @Override
    public String toString(){
        String m = "Planeta: "+planeta+"\nColor: "+color+"\nNumero de extremidades: " +extremidades+ "\nNivel de inteligencia(1-10): "+nivelInteligencia;
        return m;
    }
}
