package mbti.demo.service;

import lombok.RequiredArgsConstructor;
import mbti.demo.domain.MbtiVO;
import mbti.demo.mybatis.MbtiMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MbtiService implements MbtiInterface{
    private final MbtiMapper mbtiMapper;

    @Override
    public List<MbtiVO> getAll(){
        return mbtiMapper.getAll();
    }
}
