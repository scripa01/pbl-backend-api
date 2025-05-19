package md.pbl.project.pblbackendapi.model.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class TaskFilterDto {
    Long boardId;
    String status;
    Long assigneeId;
}
