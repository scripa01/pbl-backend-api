package md.pbl.project.pblbackendapi.rest.organization_project_user;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.user.UserDto;
import md.pbl.project.pblbackendapi.service.organization_project_user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/core/organizations/{orgId}/users")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearerAuth")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserDto> list(@PathVariable Long orgId) {
        return userService.getByOrg(orgId);
    }

    @GetMapping("/{userId}")
    public UserDto get(@PathVariable Long orgId, @PathVariable Long userId) throws PblCustomException {
        return userService.get(orgId, userId);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<UserDto> create(@PathVariable Long orgId, @RequestBody UserDto dto) {
        return new ResponseEntity<>(userService.create(orgId, dto), HttpStatus.CREATED);
    }

    @PutMapping("/{userId}")
    @PreAuthorize("hasRole('ADMIN')")
    public UserDto update(@PathVariable Long orgId, @PathVariable Long userId, @RequestBody UserDto dto) {
        return userService.update(orgId, userId, dto);
    }

    @DeleteMapping("/{userId}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> delete(@PathVariable Long orgId, @PathVariable Long userId) {
        userService.delete(orgId, userId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/findUserByUsername")
    public UserDto findByUsername(@PathVariable Long orgId, @RequestParam String username) {
        return userService.getUserByUsername(orgId, username);
    }
}
