package md.pbl.project.pblbackendapi.model.authorization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class RegisterRequestDto {
    String username;
    String email;
    String password;
}
