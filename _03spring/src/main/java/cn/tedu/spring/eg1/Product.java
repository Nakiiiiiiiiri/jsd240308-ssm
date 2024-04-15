package cn.tedu.spring.eg1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
    @Value("标题")
    private String title;
    @Value("100")//属性值注入，双引号中写int类型
    private int num;
    @Value("描述")
    private String comment;

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", num=" + num +
                ", comment='" + comment + '\'' +
                '}';
    }
}
