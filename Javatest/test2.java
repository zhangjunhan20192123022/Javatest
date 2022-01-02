package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import tcp.wimdow.client;




public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		LoginDemo LD=new LoginDemo();
		
		
	}

}
//登录界面
class LoginDemo extends JFrame{
	private String username="root";  //用户名和密码的定义
	private String password="root";
	
	JFrame windows;  //窗口
	JTextField user;   //用户名文本框
	JTextField pwd;    //密码文本框
	JButton Login;   //登录按钮
	
	
	public LoginDemo() {
		windows=new JFrame("学生管理系统");
		windows.setLayout(null); //设置布局格式，
		//常用的有5种:FlowLayout、BorderLayout、GridLayout、CardLayout、GridBagLayout。
		windows.setSize(600,600); //设置大小
		windows.setLocationRelativeTo(null);//设置居中
		windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置可关闭
		
		windows.setLayout(null); //设置绝对布局（窗口里面的内容不会随着窗口改变而改变）
		windows.setResizable(false);//设置窗口不可以拉伸改变大小
		//设置用户标签
		JLabel username_label=new JLabel("用户名：");
		username_label.setBounds(100,200,100,50);
		windows.add(username_label);
		//设置密码标签
		JLabel password_label=new JLabel("密码：");
		password_label.setBounds(100,200,100,50);
		windows.add(password_label);
		//设置用户文本框
		user=new JTextField();
		user.setBounds(150,100,300,50);
		windows.add(user);
		//设置密码文本框
		pwd=new JPasswordField();//隐藏密码
		pwd.setBounds(150,300,100,50);
		windows.add(Login);
		
		
		windows.setVisible(true);//设置面板可见
	}
}