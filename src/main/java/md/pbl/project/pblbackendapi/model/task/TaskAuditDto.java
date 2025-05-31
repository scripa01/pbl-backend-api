package md.pbl.project.pblbackendapi.model.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder
public class TaskAuditDto {
    private Long id;
    private Long taskId;
    private Long changedByUserId;
    private TaskStatus oldStatus;
    private TaskStatus newStatus;
    private String changeComment;
    private OffsetDateTime changedAt;
}
