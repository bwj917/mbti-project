package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Login;
import mbti.demo.repository.LoginRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisLoginRepository implements LoginRepository {
    private final LoginMapper loginMapper;

    @Override
    public List<Login> getAllId() {
      return loginMapper.getAllId();
    }
}
