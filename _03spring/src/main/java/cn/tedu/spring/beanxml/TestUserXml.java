package cn.tedu.spring.beanxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//狗都不用，写一大堆标签，不如注解
public class TestUserXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    }
}
