package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {
    JButton add_Employee,add_Room,add_Drivers,logout,back;
    admin(){
        add_Employee=new JButton("ADD EMPLOYEE");
        add_Employee.setBounds(250,170,200,30);
        add_Employee.setBackground(Color.white);
        add_Employee.setForeground(Color.black);
        add_Employee.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Employee.addActionListener(this);
        add(add_Employee);
        add_Room=new JButton("ADD ROOM");
        add_Room.setBounds(250,320,200,30);
        add_Room.setBackground(Color.white);
        add_Room.setForeground(Color.black);
        add_Room.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Room.addActionListener(this);
        add(add_Room);
        add_Drivers=new JButton("ADD DRIVERS");
        add_Drivers.setBounds(250,470,200,30);
        add_Drivers.setBackground(Color.white);
        add_Drivers.setForeground(Color.black);
        add_Drivers.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Drivers.addActionListener(this);
        add(add_Drivers);
        logout=new JButton("Logout");
        logout.setBounds(10,600,95,30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        logout.setFont(new Font("Tahoma",Font.BOLD,15));
        logout.addActionListener(this);
        add(logout);
        back=new JButton("Back");
        back.setBounds(110,600,95,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);
        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image l11 = l1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(l11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70,100,120,120);
        add(label);
        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image= imageIcon1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(70,270,120,120);
        add(label1);
        ImageIcon imageIcon111 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image image1= imageIcon111.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1111 = new ImageIcon(image1);
        JLabel label11 = new JLabel(imageIcon1111);
        label11.setBounds(70,418,120,120);
        add(label11);
        ImageIcon imageIcon8 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image image11= imageIcon8.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11155 = new ImageIcon(image11);
        JLabel label111 = new JLabel(imageIcon11155);
        label111.setBounds(700,170,400,400);
        add(label111);




        getContentPane().setBackground(new Color(33,45,48));
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add_Employee){
           new AddEmployee();

        } else if (e.getSource()==add_Room) {
            new AddRoom();

        } else if (e.getSource()==add_Drivers) {
            new addDriver();

        } else if (e.getSource()==logout) {
            System.exit(400);

        } else if (e.getSource() == back) {

            new Dashboard();
            setVisible(false);

        }
    }

    public static void main(String[] args) {
        new admin();

    }
}
