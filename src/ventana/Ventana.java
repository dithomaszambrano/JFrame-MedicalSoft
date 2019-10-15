package ventana;

import java.awt.*;
import javafx.scene.*;
import javax.swing.*;

public class Ventana extends JFrame {
    
    Container cp = getContentPane();

     public Ventana() {
        super ("Ventana 1");
        getJLabel(); 
        config(); 
        getJTexField();
        
    }
    
    public void config(){
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    
    public void getJLabel(){
        cp.setLayout(null);
        JLabel[] label = new JLabel[6];
        for (int i = 0; i < label.length; i++) {
            label[i] = new JLabel();
            label[i].setBounds(new Rectangle(15, (i + 1) * 40, 60, 25));
            label[i].setText(JOptionPane.showInputDialog("Digite Nombre De La Etiqueta en la posicion "+(i+1)));
            cp.add(label[i]);
        }
    }
       
    public void getJTexField(){
        cp.setLayout(null);
        JTextField[] text = new JTextField[6];
        JButton aceptar = new JButton("Aceptar");
        for (int i = 0; i < text.length; i++) {
            text[i] = new JTextField();
            text[i].setBounds(new Rectangle(100, (i + 1) * 40, 155, 25));
            aceptar.setBounds(new Rectangle(173, (i + 1) * 47, 80, 25));
            cp.add(aceptar);
            cp.add(text[i]);
        }
    }

    /*public void getButton(){
        cp.setLayout(null);
        JButton b = new JButton("Aceptar");
        b.setBounds(155, 47, 80, 25);
        cp.add(b);
        
    }*/
    
    public static void main(String[] args) {

        Ventana v = new Ventana();
        
    }

}
