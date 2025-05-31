package md.pbl.project.pblbackendapi.model.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder
public class CommentDto {
    private Long id;
    private Long taskId;
    private Long userId;
    private String content;
    private OffsetDateTime createdAt;
}
