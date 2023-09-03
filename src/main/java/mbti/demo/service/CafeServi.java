package mbti.demo.service;

import mbti.demo.domain.Cafe;
import mbti.demo.domain.Food;

import java.util.List;

public interface CafeServi {

    List<Cafe> getAllCafes();
    List<Cafe> getAddress();
}
