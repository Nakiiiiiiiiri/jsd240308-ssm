package cn.tedu.spring.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserCache {
    public static void main(String[] args) {
        //基于注解创建Ioc容器
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.auto");
        //获取SpringBean对象
        UserCache userCache = context.getBean(UserCache.class);
        //调用方法
        System.out.println("userCache ="+userCache);
    }
}
