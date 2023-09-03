package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.MbtiVO;
import mbti.demo.service.MbtiInterface;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MyBatisMbtiRepository implements MbtiInterface {
    private final MbtiMapper mbtiMapper;


    @Override
    public List<MbtiVO> getAll() {
        return mbtiMapper.getAll();
    }

}
