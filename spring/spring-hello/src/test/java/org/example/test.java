package org.example;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class test {
    @Test
    public void test01(){

    }
    @Test
    public void test02(){
        String config="beans.xml";
        //ClassPathXmlApplicationContext从类路径中去加载配置文件，通过容器获取对象
        ApplicationContext ac=new ClassPathXmlApplicationContext("config");
        //getBean(id值),转为接口类型
    SomeService service=(SomeService) ac.getBean("s1");
        //使用spring创建好的对象完成方法
         service.s();

    }
    @Test
    public void test03(){
        String config="beans.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext("config");
       Date my=(Date) ac.getBean("mydata");
        System.out.println(my);
    }
}

