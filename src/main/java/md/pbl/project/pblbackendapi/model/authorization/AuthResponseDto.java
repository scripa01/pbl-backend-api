package md.pbl.project.pblbackendapi.model.authorization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AuthResponseDto {
    String accessToken;
    String tokenType = "Bearer";
}
