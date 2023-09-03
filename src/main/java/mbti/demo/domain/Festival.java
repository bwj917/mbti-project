package mbti.demo.domain;
import lombok.Data;

@Data
public class Festival {
    private String festival;
    private String day;
    private String place;
    private String x;
    private String y;
    private byte[] picture;

    @Override
    public String toString() {
        return "Drama{" +
                "numb=" + festival +
                ", title1='" + day + '\'' +
                ", startDay='" + place + '\'' +
                ", endDay='" + picture + '\'' +
                '}';
    }
}

