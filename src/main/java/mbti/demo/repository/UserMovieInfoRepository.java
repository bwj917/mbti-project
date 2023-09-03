package mbti.demo.repository;

import mbti.demo.domain.UserMovieInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMovieInfoRepository extends JpaRepository<UserMovieInfo, Long> {
}