package mbti.demo.domain;
import lombok.Data;
import jakarta.persistence.*;
@Data
@Entity
@Table(name = "moviedata")
public class UserMovieInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id; // String 타입으로 변경
    @Column(name = "login_id")
    private String loginId;

    private String genre;

    private String information;

    private String name;

}
