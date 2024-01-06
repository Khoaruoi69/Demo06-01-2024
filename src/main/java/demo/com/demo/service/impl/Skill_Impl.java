package demo.com.demo.service.impl;

import demo.com.demo.constant.ErrorConstant;
import demo.com.demo.dto.SkillRequest;
import demo.com.demo.dto.SkillResponse;
import demo.com.demo.entity.Skill;
import demo.com.demo.response.ResponseAPI;
import demo.com.demo.responsitory.SkillResponsitory;
import demo.com.demo.service.SkillService;

import java.util.Objects;
import java.util.UUID;

public class Skill_Impl implements SkillService {
    private ErrorConstant errorConstant;
    private SkillResponsitory skillResponsitory;

    @Override
    public ResponseAPI createSkill(SkillRequest skillRequest) {
        try {
            Objects OK = null;

            return new ResponseAPI(errorConstant.ERROR_CREATE_SKILL, OK,"OK");
        } catch (Exception ex) {
            throw new RuntimeException("Error");
        }
    }

    @Override
    public SkillResponse getDetail(UUID uuid) {
        try {
            Skill skill = skillResponsitory.findById(uuid).orElseThrow("find not found ");
            Skill skill1 = skillResponsitory.getSkillById(uuid);
        } catch (Exception ex) {
            throw new RuntimeException("Error get detail");
        }
        return null;
    }


}
