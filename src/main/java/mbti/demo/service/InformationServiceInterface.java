package mbti.demo.service;

import mbti.demo.domain.Information;

import java.util.List;

public interface InformationServiceInterface {
    Information save(Information information);
    List<Information> findAll();
}
