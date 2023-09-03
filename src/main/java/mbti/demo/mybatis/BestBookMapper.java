package mbti.demo.mybatis;
import mbti.demo.domain.BestBook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BestBookMapper {

    void save(BestBook bestBook);
    List<BestBook> findAll();

}
