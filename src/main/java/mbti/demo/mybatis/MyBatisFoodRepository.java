package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Festival;
import mbti.demo.domain.Food;
import mbti.demo.repository.FestivalRepository;
import mbti.demo.repository.FoodRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisFoodRepository implements FoodRepository {
    private final FoodMapper foodMapper;

    @Override
    public List<Food> getAllFoods() {
        return foodMapper.getAllFoods();
    }
}
