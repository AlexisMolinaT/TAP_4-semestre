package ventanas;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alext
 */
public class Gui_AgregarElementos_02 extends JFrame {
    JButton miBoton;
    public Gui_AgregarElementos_02(){
        super("Con Herencia SIN Container");
        miBoton = new JButton("ACCION");
        
        this.add(miBoton);
        
        //this.pack();
        this.setBounds(30, 30, 200, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Gui_AgregarElementos_02();
    }
    
}
