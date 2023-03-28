import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{

    static JFrame f = new JFrame();


    Calculator(){
        f.getContentPane();
        f.setBounds(0,0,400,663);
        f.setLocation(30,150);
        f.setLayout(null);
        f.setUndecorated(true);

        JPanel p = new JPanel();
        p.setBounds(0,0,400,223);
        p.setBackground(new Color(38, 49, 51));
        p.setLayout(null);

        JLabel calculator_text = new JLabel("Calculator");
        calculator_text.setBounds(20,20,200,30);
        calculator_text.setFont(new Font("SANS_SERIF",Font.PLAIN,35));
        calculator_text.setForeground(Color.WHITE);

        p.add(calculator_text);
        f.add(p);

        

        f.add(Numpad.numpad_func());
        

        f.repaint();
        f.invalidate();
        f.validate();
        f.setVisible(true);

        
    }

    public void actionPerformed(ActionEvent ae){

    }

    public static void main(String[] args) {
        new Calculator();
    }
}