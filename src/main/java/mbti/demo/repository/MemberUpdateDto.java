package mbti.demo.repository;

import lombok.Data;

@Data
public class MemberUpdateDto {
    private String password;
    private String password2;
    private String email;
    private String phoneNumber;
    private String mbti;

    public MemberUpdateDto(){
    }

}
