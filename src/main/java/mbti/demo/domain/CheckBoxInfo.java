package mbti.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CheckBoxInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "checkbox_info_seq")
    @SequenceGenerator(name = "checkbox_info_seq", sequenceName = "checkbox_info_seq", allocationSize = 1)
    private Long id;

    private String checkboxLabel;

    // Getter and setters
}