package md.pbl.project.pblbackendapi.model.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder
public class BoardDto {
    Long id;
    String name;
    String description;
    Long organizationId;
    Long projectId;
    OffsetDateTime createdAt;
}
