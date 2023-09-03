package mbti.demo.mybatis;

import mbti.demo.domain.Cafe;
import mbti.demo.domain.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CafeMapper {
    List<Cafe> getAllCafes();
    List<Cafe> getAddress();
}
