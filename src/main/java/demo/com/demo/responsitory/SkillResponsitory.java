package demo.com.demo.responsitory;

import demo.com.demo.dto.SkillResponse;
import demo.com.demo.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface  SkillResponsitory extends JpaRepository<Skill, UUID> {
    @Query(value = "Select * from skill s where s.id =:id ",nativeQuery = true)
    Skill getSkillById(@Param("id") UUID id);

}
