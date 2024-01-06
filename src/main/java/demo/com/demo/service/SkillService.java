package demo.com.demo.service;

import demo.com.demo.dto.SkillRequest;
import demo.com.demo.dto.SkillResponse;
import demo.com.demo.response.ResponseAPI;

import java.util.UUID;

public interface SkillService {
    ResponseAPI createSkill(SkillRequest skillRequest);
    SkillResponse getDetail(UUID uuid);
}
