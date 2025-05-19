package md.pbl.project.pblbackendapi.model.project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder
public class ProjectDto {
    Long id;
    String name;
    String description;
    Long organizationId;
    OffsetDateTime createdAt;

}
