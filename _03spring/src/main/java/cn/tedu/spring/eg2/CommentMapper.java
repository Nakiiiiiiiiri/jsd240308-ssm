package cn.tedu.spring.eg2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class CommentMapper {
    @Autowired
    @Qualifier(value = "mapperImpl2")
    private Mapper mapper;
}
