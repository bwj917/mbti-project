package mbti.demo.service;

import mbti.demo.domain.Member;

public interface LoginInterface {
    Member login (String loginId, String password);
}
