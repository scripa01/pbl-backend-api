package md.pbl.project.pblbackendapi.model.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder
public class TaskDto {
    Long id;
    String title;
    String description;
    String status;
    Long boardId;
    Long assigneeId;
    OffsetDateTime createdAt;
    OffsetDateTime updatedAt;

}
