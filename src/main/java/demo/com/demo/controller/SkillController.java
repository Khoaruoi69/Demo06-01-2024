package demo.com.demo.controller;

import demo.com.demo.dto.SkillRequest;
import demo.com.demo.response.ResponseAPI;
import demo.com.demo.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/skill")
public class SkillController {
    @Autowired
    private SkillService skillService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseAPI createSkill( @ResponseBody @Validated SkillRequest skillRequest) {
        return skillService.createSkill(skillRequest);
    }

}
