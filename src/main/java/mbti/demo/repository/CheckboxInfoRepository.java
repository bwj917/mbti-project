package mbti.demo.repository;

import mbti.demo.domain.CheckBoxInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckboxInfoRepository extends JpaRepository<CheckBoxInfo, Long> {
}