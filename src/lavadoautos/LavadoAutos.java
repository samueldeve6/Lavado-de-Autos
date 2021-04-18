package lavadoautos;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Samuel Remolina Alvarez
 */
public class LavadoAutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Modelo mod = new Modelo();
       Vista vie = new Vista();
       
       Controlador ctrl = new Controlador(vie, mod);
       ctrl.iniciarVista();
       vie.setVisible(true);
    }
    
}
