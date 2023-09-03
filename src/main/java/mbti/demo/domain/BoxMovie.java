package mbti.demo.domain;

import lombok.Data;

@Data
public class BoxMovie {
    private int rank;
    private int rankInten;
    private String rankOldAndNew;
    private String movieCd;
    private String movieNm;
    private String openDt;
    private int audiCnt;
    private int audiInten;
    private int audiAcc;
    private String boxURL;
    private String boxInfo;
    private String bookingURL;
}
