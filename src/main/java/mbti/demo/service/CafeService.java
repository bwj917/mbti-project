package mbti.demo.service;

import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Cafe;
import mbti.demo.domain.Cinema;
import mbti.demo.repository.CafeRepository;
import mbti.demo.repository.CinemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CafeService implements CafeServi{

    private final CafeRepository cafeRepository;

    public List<Cafe> getAllCafes() {
        return cafeRepository.getAllCafes();
    }
    public List<Cafe> getAddress() {
        return cafeRepository.getAddress();
    }
}
