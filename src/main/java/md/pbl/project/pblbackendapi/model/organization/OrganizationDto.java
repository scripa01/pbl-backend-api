package md.pbl.project.pblbackendapi.model.organization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder
public class OrganizationDto {
    Long id;
    String name;
    String description;
    OffsetDateTime createdAt;
}
