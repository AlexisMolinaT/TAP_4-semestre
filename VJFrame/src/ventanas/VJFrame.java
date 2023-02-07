
package ventanas;
import javax.swing.*;

/**
 *
 * @author Alexis M.
 */
public class VJFrame extends JFrame{
    public VJFrame(){
        super("VENTANA HEREDANDO DE JFrame");
        
        //Definir ancho y altura de la ventana
        //this.pack();
        this.setBounds(100, 100, 500, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public static void main(String[] args) {
        //VJFrame uno = new VJFrame;
        new VJFrame();
        
        
        
    }
    
}
