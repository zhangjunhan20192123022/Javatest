package test3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Frame {
    public static void main(String[] args){
   LoginDemo  LD=new LoginDemo();


    }
}
class LoginDemo extends JFrame{
     private String[] userbox=new String[]{"root","root"};
    //窗口
    JFrame  windows;
    //用户名，密码文本框
    JTextField  username;
    JTextField  password;
    //登录按钮
    JButton   Login;
    //初始化
    public LoginDemo(){      //构造方法所以要和类同名
         windows=new JFrame("学生管理系统");
         windows.setLayout(null);  //设置绝对布局
         windows.setSize(600,600);  //设置窗口大小
         windows.setLocationRelativeTo(null);  //设置居中
         windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置可关闭
        //设置用户标签
        JLabel username_label=new JLabel("账号：");
        username_label.setBounds(100,100,100,50);
        windows.add(username_label);
        //设置密码标签
        JLabel userpwd_label=new JLabel("密码：");
        userpwd_label.setBounds(100,150,100,150);
        windows.add(userpwd_label);
        //设置用户名文本框
         username=new JTextField();
         username.setBounds(150,100,300,50);
         windows.add(username);
         //设置密码文本框
        password=new JPasswordField();  //隐藏密码
        password=new JTextField();
        password.setBounds(150,200,300,50);
        windows.add(password);
        //设置按钮
        Login=new JButton("登录");
        Login.setBounds(250,300,100,50);
        windows.add(Login);
        //添加事件监测器，当用户输入正确密码和账户时，可进入到主界面
        Login.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Scanner sc=new Scanner(System.in);
                 String name=sc.next();
                 String pwd= sc.next();


                int X=0;
                if (userbox[0].equals(name)&&userbox[1].equals(pwd))
                {
                    X=1;
                }
                switch (X){
                    case 1:
                        windows.dispose();
                        new mainDemo();
                        break;
                    case 0:
                        System.out.println("Error");
                    default:
                        System.out.println("Error");



                }
                }



        });






        windows.setVisible(true);
    }
}


