package mbti.demo.repository;

import mbti.demo.domain.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityRepository extends JpaRepository<Community, Long> {
//    List<Community> ContentByOrderByCreatedAsc();
}
