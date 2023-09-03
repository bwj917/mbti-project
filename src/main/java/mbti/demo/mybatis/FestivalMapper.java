package mbti.demo.mybatis;

import mbti.demo.domain.Festival;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FestivalMapper {
    List<Festival> getAllFestivals();
    List<Festival> getX();
    List<Festival> getY();
}
