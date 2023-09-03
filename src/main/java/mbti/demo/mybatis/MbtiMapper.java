package mbti.demo.mybatis;

import mbti.demo.domain.MbtiVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MbtiMapper {

    List<MbtiVO> getAll();
}
