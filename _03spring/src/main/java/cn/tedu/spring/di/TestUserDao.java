package cn.tedu.spring.di;

import cn.tedu.spring.example.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        //基于注解创建Ioc容器
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.di");
        //获取SpringBean对象
        UserService UserService = context.getBean(UserService.class);
        //调用方法
        System.out.println("UserService = "+ UserService);

    }
}
