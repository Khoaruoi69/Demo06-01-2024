package demo.com.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "skill")
public class Skill extends Common {
    @Column(name = "effective")
    private LocalDate effective;
    @OneToMany
    private List<Translate> translate;

}
