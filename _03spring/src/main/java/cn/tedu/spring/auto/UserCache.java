package cn.tedu.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

//最终类（普通类） bean对象
@Repository//数据访问层
public class UserCache {
    //自动装配
    @Autowired//对象类型时也可以使用，但只能根据类型装配，是SpringFramework框架注解
    //@Value() 只能是普通类型时使用
    @Qualifier(value = "cacheImpl1")//配合@Autowired当一个接口有多个实现类时使用,第一位必须小写,默认规则
    //通过此注解指定IoC容器中Spring Bean对象的名称进行装配;，弥补了@Autowired的不足
    //失去了@Autowired后虽然不报异常，但是本身也失去了作用
    //@Resource
    //如果@Resource是标准注解没指定名称还会有2次机会，下一次会寻找属性名，最后一次会寻找类名(但是有多个实现类时会异常)
    private Cache cache;
}
