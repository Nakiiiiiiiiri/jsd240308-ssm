package cn.tedu.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired//自动装配 灵活:属性上，构造方法上，set方法上都能加
    //不加会输出"UserService = UserService{userDao=null}"
    private UserDao userDao;
    /*@Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }*/
    //@Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}
