package md.pbl.project.pblbackendapi.model.workflow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder
public class ChangeTaskStateResponseDto {
    Long taskId;
    String oldState;
    String newState;
    OffsetDateTime changedAt;
}
