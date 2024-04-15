package cn.tedu.spring.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;
@PropertySource(value = "classpath:application.properties")//classpath默认会去resources中找
@Repository
public class Database {
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password }")
    private String password;

    @Override
    public String toString() {
        return "Database{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
