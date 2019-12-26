package userShow;

import controller.MyWindowListener;

import javax.swing.*;
import java.awt.*;

public class UserGUI {
    //设计用户图形初始界面
    JFrame frame = new JFrame("选课系统");
    JPanel panel = new JPanel();

    public void creatWindow(int x,int y,int width,int height){
        this.frame.setVisible(true);
        //frame.setLayout(null);
        frame.setResizable(false);
        panel.setLayout(null);
        panel.setBackground(Color.CYAN);
        this.frame.setBounds(x, y, width, height);
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void addLabel(String name,int x,int y,int width,int height,int size){
        JLabel label = new JLabel(name);
        this.panel.add(label);
        this.frame.add(this.panel);
        label.setBounds(x,y,width,height);
        label.setFont(new Font("黑体",Font.BOLD,size));
    }
    public void addTextField(int x,int y,int width,int height,int length){
        JTextField textField = new JTextField(length);
        this.panel.add(textField);
        this.frame.add(this.panel);
        textField.setBounds(x,y,width,height);
        textField.setFont(new Font("黑体",Font.BOLD,18));
        new MyWindowListener(textField);
    }
    public void addPasswordField(int x,int y,int width,int height,int length){
        JPasswordField passwdField = new JPasswordField(length);
        passwdField.setEchoChar('*');
        passwdField.setBounds(x,y,width,height);
        passwdField.setFont(new Font("黑体",Font.BOLD,18));
        this.panel.add(passwdField);
        this.frame.add(this.panel);
        new MyWindowListener(passwdField);
    }
    public void addButton(String name,int x,int y,int width,int height){
        JButton bt = new JButton(name);
        this.panel.add(bt);
        this.frame.add(this.panel);
        bt.setBounds(x,y,width,height);
        bt.setFont(new Font("黑体",Font.BOLD,18));
        new MyWindowListener(bt,name);
    }

}