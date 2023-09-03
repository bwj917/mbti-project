package mbti.demo.repository;


import mbti.demo.domain.Festival;

import java.util.List;

public interface FestivalRepository {

    List<Festival> getAllFestivals();

    List<Festival> getX();
    List<Festival> getY();
}
