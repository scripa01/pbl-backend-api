package md.pbl.project.pblbackendapi.model.project;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ProjectMemberDto {
    Long userId;
    String role;
}
