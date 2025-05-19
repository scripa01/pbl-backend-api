package md.pbl.project.pblbackendapi.model.user;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserDto {
    Long id;
    String username;
    String email;
    String fullName;
    List<String> roles;

}
