package ventanas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis M.
 */
public class EjemploEventoAction extends JFrame{
    JButton btn_uno;
    public EjemploEventoAction(){
        super("EVENTOS");
        this.setLayout(null);
        
        btn_uno = new JButton("ACCION");
        btn_uno.setBounds(100, 100, 100, 50);
        this.add(btn_uno);
        
        btn_uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se escribe todo lo que queremos que realize el boton :)
                JOptionPane.showMessageDialog((JButton)e.getSource(), "DETECTE EL EVENTO ACTION"); 
               //getSource regresa un objeto pero el polimorfismo regresa un JButton
                
            }
        });
        
        this.setBounds(100, 100, 500, 300);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new EjemploEventoAction();
    }
    
}
