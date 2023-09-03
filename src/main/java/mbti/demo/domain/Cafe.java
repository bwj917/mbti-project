package mbti.demo.domain;
import lombok.Data;

import java.sql.Blob;

@Data
public class Cafe {
    private String name;
    private String address;
    private String picture;


    @Override
    public String toString() {
        return "Drama{" +
                "numb=" + name +
                ", title1='" + address + '\'' +
                ", startDay='" + picture + '\'' +
                '}';
    }


}

