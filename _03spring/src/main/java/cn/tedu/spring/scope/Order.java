package cn.tedu.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope(value = "singleton")//默认不加就是单例
//@Scope(value = "prototype")//Ioc容器中多个实例,返回不同内存地址
@Component
public class Order {
}
