package mbti.demo.service;

import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Cinema;
import mbti.demo.domain.Festival;
import mbti.demo.repository.CinemaRepository;
import mbti.demo.repository.FestivalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CinemaService implements CinemaServi{

    private final CinemaRepository cinemaRepository;

    public List<Cinema> getAllCinemas() {
        return cinemaRepository.getAllCinemas();
    }
}
