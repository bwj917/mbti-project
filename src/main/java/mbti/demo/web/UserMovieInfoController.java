package mbti.demo.web;

import jakarta.servlet.http.HttpSession;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Member;
import mbti.demo.domain.UserMovieInfo;
import mbti.demo.repository.SessionConst;
import mbti.demo.repository.UserMovieInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
@Slf4j
@Controller
public class UserMovieInfoController {

    @Autowired
    private UserMovieInfoRepository userMovieInfoRepository;

    @PostMapping("/save-user-movie-info")
    @ResponseBody
    public  ResponseEntity<String>saveUserMovieInfo(@RequestBody UserMovieInfoRequest request, HttpSession session) {
        Member loginMember = (Member) session.getAttribute(SessionConst.LOGIN_MEMBER);

        if (loginMember == null) {
            // 로그인이 안 되어 있는 경우 처리
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not logged in.");
        }

        UserMovieInfo userMovieInfo = new UserMovieInfo();
        userMovieInfo.setLoginId(loginMember.getLoginId());  // 사용자 로그인 아이디를 직접 설정
        userMovieInfo.setInformation(request.getInformation());
        userMovieInfo.setName(request.getName());
        userMovieInfo.setGenre(request.getGenre());
        userMovieInfoRepository.save(userMovieInfo);

        return ResponseEntity.ok("{\"message\": \"Movie info saved successfully.\"}");

    }
}
@Data
class UserMovieInfoRequest {
    private String information;
    private String genre;
    private String loginId;
    private String name;
}