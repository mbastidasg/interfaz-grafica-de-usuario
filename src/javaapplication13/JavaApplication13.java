/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.*;
/**
 *
 * @author Estudiante
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Image icon = Toolkit.getDefaultToolkit().getImage("descarga.png") ;
         Image icon2 = Toolkit.getDefaultToolkit().getImage("hello.png") ;
            
        JFrame frame = new JFrame ();
//        JButton button1 = new JButton();
//        button1.setText("i'm a buttom");
//        
//        button1.getIcon();
//        
//        button1.setBackground(Color.red);
//        frame.add(button1);
//        JButton button2 = new JButton();
//        button2.setText("click me!");
//        button2.setBackground(Color.MAGENTA);
//        frame.add(button2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("holaaaaaa");
        frame.getTitle();
        //listar botones horzontal o verticalmente
        BoxLayout boxLayout = new BoxLayout (frame.getContentPane(), BoxLayout.X_AXIS);
        frame.setLayout(boxLayout);
        frame.add(new JButton ("button 1"));
        frame.add(new JButton ("button 2"));
        frame.add(new JButton ("button 3"));
    //frame.setSize(new Dimension(400,300));
//       
//        frame.setIconImage(icon);
//        frame.getIconImage();
       
        //anadir botones segun ubicacion 
//        frame.setLayout(new BorderLayout());
//        frame.add(new JButton("north"), BorderLayout.NORTH);
//        frame.add(new JButton ("south"),BorderLayout.SOUTH);
//        frame.add(new JButton ("west"), BorderLayout.WEST);
//        frame.add(new JButton ("east"),BorderLayout.EAST);
//        
  Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
//        frame.setTitle("a frame");
        JLabel label = new JLabel ("type your zipe code");
        JTextField field = new JTextField (5);
        
// add boton con texto e icono
        JButton button = new JButton ("submit");
        button.setIcon(new ImageIcon ("devo-icon-pack.png"));
        button.addActionListener(new MessageListener());
      frame.setLayout(new FlowLayout());
//      frame.setLayout(new GridLayout (2, 3));
//        for (int i = 0; i <= 6; i++) {
//            frame.add(new JButton ( "button" + i));
//        }
      frame.add(label);
      frame.add(field);
      frame.add(button);
      frame.pack();
        frame.setVisible(true);
        
        
//        String name = JOptionPane.showInputDialog(null,"what's your name?");
//       
//        int choice = JOptionPane.showConfirmDialog(null,  "do you like cake" + name + " ?");
//                
//        if ( choice == JOptionPane.YES_OPTION){
//                    JOptionPane.showMessageDialog(null, "of course! who doesn't");
//                } else {
//                    JOptionPane.showMessageDialog(null, "we'll have to agree to desagree");
//                }
    }
    
}
