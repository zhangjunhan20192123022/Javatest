package test3;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mFrame {
    public static void main(String[] args){
       mainDemo MD=new mainDemo();
    }
}
class  mainDemo extends Frame{
      //窗口
      JFrame windows;
      //学生名，年龄，班级号，老师的文本框
      JTextField studentname;
      JTextField age;
      JTextField classnumber;
      JTextField teacher;
      //退出按钮
      JButton exit;
      //
      JButton revise;
      //初始化
      public mainDemo(){
         windows=new JFrame("学生管理系统");//初始化文本框
         windows.setLayout(null);//设置流式布局
         windows.setLocationRelativeTo(null);//设置居中
         windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置文本框可关闭
         windows.setSize(700,700);//设置文本框大小
         //设置学生姓名标签
          JLabel studentname_j= new JLabel("学生姓名：");
          studentname_j.setBounds(90,100,300,50);
          windows.add(studentname_j);
         //设置学生年龄标签
           JLabel age_J= new JLabel("学生年龄：");
          age_J.setBounds(90,200,300,50);
          windows.add(age_J);
          //设置班级名称标签
           JLabel classname_J= new JLabel("班级名称：");
          classname_J.setBounds(90,300,300,50);
          windows.add(classname_J);
          //设置老师标签
           JLabel teacher_J= new JLabel("老师：");
          teacher_J.setBounds(90,400,300,50);
          windows.add(teacher_J);
          //设置学生姓名文本框
          studentname=new JTextField();
          studentname.setBounds(150,100,300,50);
          windows.add(studentname);
          //设置学生年龄文本框
          age=new JTextField();
          age.setBounds(150,200,300,50);
          windows.add(age);
          //设置班级名称文本框
          classnumber=new JTextField();
          classnumber.setBounds(150,300,300,50);
          windows.add(classnumber);
          //设置老师名称文本框
          teacher=new JTextField();
          teacher.setBounds(150,400,300,50);
          windows.add(teacher);
          //设置按钮exit
          exit=new JButton("退出");
          exit.setBounds(250,500,100,50);
          windows.add(exit);
          exit.addActionListener(new ActionListener()
          {
              @Override
              public void actionPerformed(ActionEvent e)
              {
                 windows.dispose();
              }


          });

          windows.setVisible(true);//设置文本框可见
      }

}

