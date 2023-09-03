package mbti.demo.repository;

import mbti.demo.domain.Cafe;
import mbti.demo.domain.Food;

import java.util.List;

public interface CafeRepository {

    List<Cafe> getAllCafes();
    List<Cafe> getAddress();
}
