package cn.tedu.spring.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLife {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.life");
        Life life = context.getBean(Life.class);
        System.out.println("4,开发者使用阶段");
        //手动关闭Ioc容器
        context.close();
    }
}
