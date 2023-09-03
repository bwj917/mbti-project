package mbti.demo.config;
import lombok.RequiredArgsConstructor;
import mbti.demo.mybatis.MemberMapper;
import mbti.demo.mybatis.MybatisMemberRepository;
import mbti.demo.repository.MemberInterface;
import mbti.demo.service.LoginInterface;
import mbti.demo.service.LoginService;
import mbti.demo.service.MemberService;
import mbti.demo.service.MemberServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class LoginCon {
    private final MemberMapper memberMapper;

    @Bean
    public LoginInterface loginInterface () {
        return new LoginService(memberServiceInterface());
    }
    @Bean
    public MemberServiceInterface memberServiceInterface() {
        return new MemberService(memberInterface());
    }
    @Bean
    public MemberInterface memberInterface() {
        return new MybatisMemberRepository(memberMapper);
    }
}
