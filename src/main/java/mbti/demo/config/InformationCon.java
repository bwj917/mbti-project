package mbti.demo.config;

import lombok.RequiredArgsConstructor;
import mbti.demo.mybatis.InformationMapper;
import mbti.demo.mybatis.MbtiMapper;
import mbti.demo.mybatis.MyBatisMbtiRepository;
import mbti.demo.mybatis.MybatisInformationRepository;
import mbti.demo.repository.InformationInterface;
import mbti.demo.service.InformationService;
import mbti.demo.service.MbtiInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class InformationCon {
    private final InformationMapper informationMapper;
    private final MbtiMapper mbtiMapper;
//    private final CommunityMapper communityMapper;

    @Bean
    public InformationInterface informationInterface(){
        return new MybatisInformationRepository(informationMapper);
    }

    @Bean
    public InformationService informationServiceInterface(){
        return new InformationService(informationInterface());
    }

    @Bean
    public MbtiInterface mbtiInterface(){
        return new MyBatisMbtiRepository(mbtiMapper);
    }


}
