package cn.tedu.spring.fate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Fate {
    private String name;

    public Fate() {
        System.out.println("1,使用无参构造实例化");
    }

    @Value("Saber")
    public void setName(String name) {
        this.name = name;
        System.out.println("2，调用set方法进行属性赋值");
    }
    @PostConstruct
    public void init(){
        System.out.println("3,执行生命周期初始化方法");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("5,生命周期销毁");
    }
}
