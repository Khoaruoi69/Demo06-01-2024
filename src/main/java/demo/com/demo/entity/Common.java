package demo.com.demo.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;


@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Common {
    private UUID id;
    private LocalDate createDate;
    private LocalDate updateDate;
}
