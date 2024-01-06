package demo.com.demo.dto;

import demo.com.demo.entity.Translate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
public class SkillResponse {
    private UUID id;
    private LocalDate effective;
    private List<Translate> translates;
}
