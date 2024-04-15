package cn.tedu.spring.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//四大注解
@Component//不分层 普通组件
//@Service 业务层
//@Repository 访问层
//@Controller 控制层
//数据访问层
public class UserDao {
    @Value("root")
    private String username ;
    @Value("root")
    private String password ;
    @Value("jdbc:mysql://localhost:33061/tedu")
    private String url;
    @Value("3306")
    private String port;

    @Override
    public String toString() {
        return "UserDao{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
