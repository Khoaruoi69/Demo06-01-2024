package demo.com.demo.entity;

import jakarta.persistence.ManyToOne;
import lombok.NonNull;
import org.springframework.validation.annotation.*;
public class Translate extends Common {
    @Size(225)
    private String name;
    @NonNull
    @Phone
    @Email
    private String lang;
    @NonNull
    private String content;
    @ManyToOne
    Skill skill;
}
