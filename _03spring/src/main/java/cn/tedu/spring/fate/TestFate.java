package cn.tedu.spring.fate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestFate {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.fate");
        Fate fate = context.getBean(Fate.class);
        System.out.println("4,开发者使用阶段");
        context.close();
    }
}
