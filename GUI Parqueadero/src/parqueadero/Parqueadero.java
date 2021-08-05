
package parqueadero;

/**
 *
 * @author Erika
 */

import modelo.Empresa;
import modelo.Cliente;
import vista.ClienteVista;
import vista.VistaGeneral;

public class Parqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaGeneral vistaGeneral = new VistaGeneral();
        vistaGeneral.menu();
    }
    
}
