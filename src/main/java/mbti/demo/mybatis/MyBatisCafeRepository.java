package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Cafe;
import mbti.demo.repository.CafeRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisCafeRepository implements CafeRepository {
    private final CafeMapper cafeMapper;

    @Override
    public List<Cafe> getAllCafes() {
        return cafeMapper.getAllCafes();
    }
    @Override
    public List<Cafe> getAddress() {
        return cafeMapper.getAddress();
    }
}
