package mbti.demo.domain;
import lombok.Data;

@Data
public class Cinema {
    private String name;
    private String address;
    private String picture;

    @Override
    public String toString() {
        return "Drama{" +
                "numb=" + name +
                ", title1='" + address + '\'' +
                ", endDay='" + picture + '\'' +
                '}';
    }
}

