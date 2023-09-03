package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Cinema;
import mbti.demo.domain.Festival;
import mbti.demo.repository.CinemaRepository;
import mbti.demo.repository.FestivalRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisFestivalRepository implements FestivalRepository {
    private final FestivalMapper festivalMapper;

    @Override
    public List<Festival> getAllFestivals() {
        return festivalMapper.getAllFestivals();
    }
    @Override
    public List<Festival> getX() {
        return festivalMapper.getX();
    }
    @Override
    public List<Festival> getY() {
        return festivalMapper.getY();
    }
}
