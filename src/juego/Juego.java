
package juego;

public class Juego {

    public static void main(String[] args) {
        Alienigena marciano = new Marte();
        Alienigena jupiteriano = new Jupiter();
        System.out.println("DATOS MARCIANO\n"+marciano.toString());
        System.out.println("");
        System.out.println("DATOS JUPITERIANO\n"+jupiteriano.toString());
       
    }
}
