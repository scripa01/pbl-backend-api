package md.pbl.project.pblbackendapi.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AssignUserToProjectDto {
    Long projectId;
    Long userId;
    String role;
}
