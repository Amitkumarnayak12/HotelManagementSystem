package Hotel.Management.System;

import javax.swing.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon imageIcon =new ImageIcon(ClassLoader.getSystemResource("icon/splash.gif"));
        JLabel label=new JLabel(imageIcon);
        label.setBounds(0,0,858,580);
        add(label);
        setLayout(null);
        setLocation(210,80);
        setSize(858,580);
        setVisible(true);
        try{
            Thread.sleep((5000));
            new Login();
            setVisible(false);

        }
        catch (Exception e){
            e.printStackTrace();

        }




    }

    public static void main(String[] args) {
        new Splash();

    }
}
