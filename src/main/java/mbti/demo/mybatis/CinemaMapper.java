package mbti.demo.mybatis;

import mbti.demo.domain.Cinema;
import mbti.demo.domain.Festival;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CinemaMapper {
    List<Cinema> getAllCinemas();
}
