package mbti.demo.repository;

import mbti.demo.domain.Cinema;
import mbti.demo.domain.Festival;

import java.util.List;

public interface CinemaRepository {

    List<Cinema> getAllCinemas();
}
