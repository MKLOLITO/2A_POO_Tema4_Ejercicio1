
package interfazgraficaagregartitulos;
import java.awt.Dimension;
        
/**
 * @version 1.0
 */
public class holaMundo {
    /**
     * Este es el metodo principal
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Ventana v = new Ventana("Si me buscas este es mi id" + getPID());
        v.setVisible(true);
    }

    public static String getPID(){
        return java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
    }
}
