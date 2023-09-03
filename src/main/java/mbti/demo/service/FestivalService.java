package mbti.demo.service;

import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Festival;
import mbti.demo.repository.FestivalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FestivalService implements FestivalServi{

    private final FestivalRepository festivalRepository;

    public List<Festival> getAllFestivals() {
        return festivalRepository.getAllFestivals();
    }
    public List<Festival> getX() {
        return festivalRepository.getX();
    }
    public List<Festival> getY() {
        return festivalRepository.getY();
    }
}
