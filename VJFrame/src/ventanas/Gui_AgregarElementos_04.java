package ventanas;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author alext
 */
public class Gui_AgregarElementos_04 {
    JButton btn_uno;
    
    public Gui_AgregarElementos_04(){
        JFrame jf = new JFrame("SIN HERENCIA SIN CONTAINER");
        
        btn_uno = new JButton("ACCION");
        jf.add(btn_uno);
        
        jf.setBounds(100, 100, 500, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Gui_AgregarElementos_04();
    }
    
}
