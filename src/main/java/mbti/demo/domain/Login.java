package mbti.demo.domain;

import lombok.Data;

@Data
public class Login {
    private String ID;
    private String PASSWORD;

    @Override
    public String toString() {
        return "Login{" +
                "ID=" + ID +
                ", PASSWORD='" + PASSWORD + '\'' +
                '}';
    }
}
