package mbti.demo.service;

import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Food;

import mbti.demo.repository.FestivalRepository;
import mbti.demo.repository.FoodRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService implements FoodServi {

    private final FoodRepository foodRepository;

    public List<Food> getAllFoods() {
        return foodRepository.getAllFoods();
    }
}
