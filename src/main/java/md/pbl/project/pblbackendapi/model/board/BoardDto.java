package md.pbl.project.pblbackendapi.model.board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import md.pbl.project.pblbackendapi.model.task.TaskDto;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class BoardDto {
    Long id;
    String name;
    String description;
    Long projectId;
    OffsetDateTime createdAt;
    private List<TaskDto> tasks;
}
