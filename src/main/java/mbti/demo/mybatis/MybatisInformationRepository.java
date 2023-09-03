package mbti.demo.mybatis;


import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Information;
import mbti.demo.repository.InformationInterface;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MybatisInformationRepository implements InformationInterface {
    private final InformationMapper informationMapper;

    @Override
    public Information save(Information information) {
        informationMapper.save(information);
        return information;
    }

    @Override
    public List<Information> findAll(){
        return informationMapper.findAll();
    }
}
