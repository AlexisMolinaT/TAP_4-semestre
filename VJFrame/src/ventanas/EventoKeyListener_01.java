package ventanas;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*@author Alexis M.*/
public class EventoKeyListener_01 extends JFrame {
    JLabel lbl_img;
    ImageIcon icon;
    int desplazamiento=10;
    int posicion=400;
    
    public EventoKeyListener_01(){
        super("KEY LISTENER");
        this.setLayout(null);
        
        icon = new ImageIcon(this.getClass().getResource("carro.png"));
        //Image img = icon.getImage();
        lbl_img = new JLabel(icon);
        lbl_img.setBounds(posicion, 450, 150, 100);
        add(lbl_img);
        
        this.setBounds(100, 100, 900, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                int code = e.getKeyCode();
                int a = e.getExtendedKeyCode();
                //JOptionPane.showMessageDIalog((JFrame)e.getSource(),
                //"EVENTO: KeyPresed CARACTER : " + C + " NUMERO: " + code + " EXTENDIDO " + a);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                int code = e.getKeyCode();
                int a = e.getExtendedKeyCode();
                
                if(code == 39){
                    posicion += desplazamiento;
                    lbl_img.setBounds(posicion, 450, 150, 100);
                }
                
                if (code == 37){
                    posicion -= desplazamiento;
                    lbl_img.setBounds(posicion, 450, 150, 100);
                }
                //JOptionPane.showMessageDIalog((JFrame)e.getSource(),
                //"EVENTO: KeyPresed CARACTER : " + C + " NUMERO: " + code + " EXTENDIDO " + a);            }
            }
            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                int i = e.getKeyCode();
                int a = e.getExtendedKeyCode();
                //JOptionPane.showMessageDIalog((JFrame)e.getSource(),
                //"EVENTO: KeyPresed CARACTER : " + C + " NUMERO: " + code + " EXTENDIDO " + a);
            }
        
        });
}
            
public static void main(String[] args) {
        new EventoKeyListener_01();
    }
}
    
       
