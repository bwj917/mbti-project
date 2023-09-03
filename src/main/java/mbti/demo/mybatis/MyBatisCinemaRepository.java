package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Cafe;
import mbti.demo.domain.Cinema;
import mbti.demo.repository.CafeRepository;
import mbti.demo.repository.CinemaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisCinemaRepository implements CinemaRepository {
    private final CinemaMapper cinemaMapper;

    @Override
    public List<Cinema> getAllCinemas() {
        return cinemaMapper.getAllCinemas();
    }
}
