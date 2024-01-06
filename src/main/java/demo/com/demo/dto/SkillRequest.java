package demo.com.demo.dto;

import demo.com.demo.entity.Translate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
public class SkillRequest {
    @NonNull
    private LocalDate effective;
    @Validated
    private List<Translate> translates;
}
