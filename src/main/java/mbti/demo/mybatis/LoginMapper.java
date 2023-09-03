package mbti.demo.mybatis;

import mbti.demo.domain.Login;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {
    List<Login> getAllId();
}
