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
//��¼����
class LoginDemo extends JFrame{
	private String username="root";  //�û���������Ķ���
	private String password="root";
	
	JFrame windows;  //����
	JTextField user;   //�û����ı���
	JTextField pwd;    //�����ı���
	JButton Login;   //��¼��ť
	
	
	public LoginDemo() {
		windows=new JFrame("ѧ������ϵͳ");
		windows.setLayout(null); //���ò��ָ�ʽ��
		//���õ���5��:FlowLayout��BorderLayout��GridLayout��CardLayout��GridBagLayout��
		windows.setSize(600,600); //���ô�С
		windows.setLocationRelativeTo(null);//���þ���
		windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ÿɹر�
		
		windows.setLayout(null); //���þ��Բ��֣�������������ݲ������Ŵ��ڸı���ı䣩
		windows.setResizable(false);//���ô��ڲ���������ı��С
		//�����û���ǩ
		JLabel username_label=new JLabel("�û�����");
		username_label.setBounds(100,200,100,50);
		windows.add(username_label);
		//���������ǩ
		JLabel password_label=new JLabel("���룺");
		password_label.setBounds(100,200,100,50);
		windows.add(password_label);
		//�����û��ı���
		user=new JTextField();
		user.setBounds(150,100,300,50);
		windows.add(user);
		//���������ı���
		pwd=new JPasswordField();//��������
		pwd.setBounds(150,300,100,50);
		windows.add(Login);
		
		
		windows.setVisible(true);//�������ɼ�
	}
}