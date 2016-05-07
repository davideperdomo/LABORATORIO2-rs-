/**
 * Main ejecita la aplicación 
 */
package Main;

import Excepcion.ExcepcionSistema;
import java.io.IOException;
import ui.UI;

/**
 *
 * @author David Esteban Perdomo
 * @author Hugo Francisco Rincon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ExcepcionSistema {
        UI ui = new UI();
        ui.menu();
    }
    
}
