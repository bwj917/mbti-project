package mbti.demo.config;

import mbti.demo.mybatis.MbtiMapper;
import mbti.demo.mybatis.MyBatisMbtiRepository;
import mbti.demo.service.MbtiInterface;
import mbti.demo.service.MbtiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.RequiredArgsConstructor;


@Configuration
@RequiredArgsConstructor
public class MbtiCon {
    private final MbtiMapper mbtiMapper;

    @Bean
    public MbtiInterface mbtiInterface(){
        return new MyBatisMbtiRepository(mbtiMapper);
    }

}
