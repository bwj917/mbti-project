package mbti.demo.mybatis;

import mbti.demo.domain.Information;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InformationMapper {

    void save(Information information);
    List<Information> findAll();
}
