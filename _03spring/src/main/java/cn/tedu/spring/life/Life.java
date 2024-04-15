package cn.tedu.spring.life;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Life {
    private String mean;

    public Life() {System.out.println("1,调用无参构造进行实例化");}

    @Value("世界那么大")
    public void setMean(String mean){
        this.mean = mean;
        System.out.println("2,调用set方法进行属性赋值");
    }
    @PostConstruct
    public void init(){
        System.out.println("3,执行生命周期初始化方法");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("5,执行生命周期的销毁方法");
    }
}
