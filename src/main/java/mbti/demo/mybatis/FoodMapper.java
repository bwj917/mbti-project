package mbti.demo.mybatis;

import mbti.demo.domain.Festival;
import mbti.demo.domain.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodMapper {
    List<Food> getAllFoods();
}
