package cn.tedu.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {
    /*
    1,创建Ioc容器:SpringFramework会将创建的SpringBean对象放入Ioc容器中；
    2,获取Bean对象：从Ioc容器中获取Spring Framework创建好的对象
    3，调用方法测速
    复制路径
    crl+shift+alt+c/v

    * */
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.example");
        User user = context.getBean(User.class);
        user.run();

    }
}
