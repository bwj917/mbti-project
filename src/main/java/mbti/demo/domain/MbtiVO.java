package mbti.demo.domain;

import lombok.Data;

@Data
public class MbtiVO {

    private String mbti;
    private int cnt;


    public MbtiVO(String mbti, int cnt ) {
        this.mbti = mbti;
        this.cnt = cnt;
    }
}
