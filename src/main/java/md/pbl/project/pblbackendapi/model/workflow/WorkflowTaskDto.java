package md.pbl.project.pblbackendapi.model.workflow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class WorkflowTaskDto {
    Long taskId;
    String currentState;
}
