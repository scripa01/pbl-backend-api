package md.pbl.project.pblbackendapi.model.workflow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ChangeTaskStateRequestDto {
    Long taskId;
    String targetState;
    Long changedByUserId;
}
