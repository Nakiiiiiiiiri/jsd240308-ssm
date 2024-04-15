package cn.tedu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//声明此类为配置类，工程启动时框架会自动加载此类
@ComponentScan("cn.tedu.spring")//自动扫描的注解,扫描该包及子孙包中所有类，都注册为Ioc容器中的SpringBean对象
public class SpringConfig {
}
