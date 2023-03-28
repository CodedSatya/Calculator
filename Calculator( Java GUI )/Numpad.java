import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Numpad implements ActionListener{

    public static JButton clear;
    public static JButton del;
    public static JButton mod;
    public static JButton div;
    public static JButton num7;
    public static JButton num8;
    public static JButton num9;
    public static JButton mul;
    public static JButton num4;
    public static JButton num5;
    public static JButton num6;
    public static JButton minus;
    public static JButton num1;
    public static JButton num2;
    public static JButton num3;
    public static JButton plus;
    public static JButton close;
    public static JButton num0;
    public static JButton point;
    public static JButton equal;



    public static JPanel numpad_func(){
        JPanel num_pad = new JPanel();
        num_pad.setLayout(null);
        num_pad.setBounds(0,223,400,440);
        num_pad.setBackground(Color.DARK_GRAY);
        // f.add(num_pad);

        clear = new JButton("AC");
        clear.setBounds(0,0,100,88);
        clear.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        clear.setForeground(Color.WHITE);
        clear.setBackground(new Color(26, 33, 46));
        num_pad.add(clear);

        del = new JButton("DEL");
        del.setBounds(100,0,100,88);
        del.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        del.setForeground(Color.WHITE);
        del.setBackground(new Color(26, 33, 46));
        num_pad.add(del);

        mod = new JButton("%");
        mod.setBounds(200,0,100,88);
        mod.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        mod.setForeground(Color.WHITE);
        mod.setBackground(new Color(26, 33, 46));
        num_pad.add(mod);

        div = new JButton("/");
        div.setBounds(300,0,100,88);
        div.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        div.setForeground(Color.WHITE);
        div.setBackground(new Color(26, 33, 46));
        num_pad.add(div);

        num7 = new JButton("7");
        num7.setBounds(0,88,100,88);
        num7.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        num7.setForeground(Color.WHITE);
        num7.setBackground(new Color(26, 33, 46));
        num_pad.add(num7);

        num8 = new JButton("8");
        num8.setBounds(100,88,100,88);
        num8.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        num8.setForeground(Color.WHITE);
        num8.setBackground(new Color(26, 33, 46));
        num_pad.add(num8);

        num9 = new JButton("9");
        num9.setBounds(200,88,100,88);
        num9.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        num9.setForeground(Color.WHITE);
        num9.setBackground(new Color(26, 33, 46));
        num_pad.add(num9);

        mul = new JButton("X");
        mul.setBounds(300,88,100,88);
        mul.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        mul.setForeground(Color.WHITE);
        mul.setBackground(new Color(26, 33, 46));
        num_pad.add(mul);

        num4 = new JButton("4");
        num4.setBounds(0,176,100,88);
        num4.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        num4.setForeground(Color.WHITE);
        num4.setBackground(new Color(26, 33, 46));
        num_pad.add(num4);
        
        num5 = new JButton("5");
        num5.setBounds(100,176,100,88);
        num5.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        num5.setForeground(Color.WHITE);
        num5.setBackground(new Color(26, 33, 46));
        num_pad.add(num5);

        num6 = new JButton("6");
        num6.setBounds(200,176,100,88);
        num6.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        num6.setForeground(Color.WHITE);
        num6.setBackground(new Color(26, 33, 46));
        num_pad.add(num6);

        minus = new JButton("-");
        minus.setBounds(300,176,100,88);
        minus.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        minus.setForeground(Color.WHITE);
        minus.setBackground(new Color(26, 33, 46));
        num_pad.add(minus);

        num1 = new JButton("1");
        num1.setBounds(0,264,100,88);
        num1.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        num1.setForeground(Color.WHITE);
        num1.setBackground(new Color(26, 33, 46));
        num_pad.add(num1);

        num2 = new JButton("2");
        num2.setBounds(100,264,100,88);
        num2.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        num2.setForeground(Color.WHITE);
        num2.setBackground(new Color(26, 33, 46));
        num_pad.add(num2);

        num3 = new JButton("3");
        num3.setBounds(200,264,100,88);
        num3.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        num3.setForeground(Color.WHITE);
        num3.setBackground(new Color(26, 33, 46));
        num_pad.add(num3);

        plus = new JButton("+");
        plus.setBounds(300,264,100,88);
        plus.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        plus.setForeground(Color.WHITE);
        plus.setBackground(new Color(26, 33, 46));
        num_pad.add(plus);

        close = new JButton("esc");
        close.setBounds(0,352,100,88);
        close.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        close.setForeground(Color.WHITE);
        close.setBackground(new Color(26, 33, 46));
        num_pad.add(close);
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
          });

        num0 = new JButton("0");
        num0.setBounds(100,352,100,88);
        num0.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        num0.setForeground(Color.WHITE);
        num0.setBackground(new Color(26, 33, 46));
        num_pad.add(num0);

        point = new JButton(".");
        point.setBounds(200,352,100,88);
        point.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        point.setForeground(Color.WHITE);
        point.setBackground(new Color(26, 33, 46));
        num_pad.add(point);

        equal = new JButton("=");
        equal.setBounds(300,352,100,88);
        equal.setFont(new Font("SANS_SERIF",Font.PLAIN,18));
        equal.setForeground(Color.WHITE);
        equal.setBackground(new Color(26, 33, 46));
        num_pad.add(equal);

        

        return num_pad;

    }

    public void actionPerformed(ActionEvent ae){
            
    }
    
}
