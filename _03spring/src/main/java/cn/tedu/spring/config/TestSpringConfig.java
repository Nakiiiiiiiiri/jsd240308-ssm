package cn.tedu.spring.config;

import cn.tedu.spring.eg1.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.config");
        SpringConfig springConfig = context.getBean(SpringConfig.class);
        System.out.println("SpringConfig ="+springConfig);
        Product product = context.getBean(Product.class);
        System.out.println("Product ="+product);
    }
}
