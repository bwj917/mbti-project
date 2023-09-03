package mbti.demo.repository;

import mbti.demo.domain.Information;

import java.util.List;

public interface InformationInterface {
    Information save(Information information);

    List<Information> findAll();
}
