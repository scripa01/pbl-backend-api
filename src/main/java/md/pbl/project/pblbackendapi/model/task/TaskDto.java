package md.pbl.project.pblbackendapi.model.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private String status;
    private Long assigneeId;
    private Long createdByUserId;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private List<CommentDto> comments;
    private Long boardId;

}
