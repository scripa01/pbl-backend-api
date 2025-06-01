package md.pbl.project.pblbackendapi.rest.organization_project_user;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.model.project.ProjectDto;
import md.pbl.project.pblbackendapi.model.user.UserDto;
import md.pbl.project.pblbackendapi.service.organization_project_user.ProjectUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/core/organizations/{orgId}/project-users")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearerAuth")
public class ProjectUserController {
    private final ProjectUserService puService;

    @GetMapping("/projects/{projectId}")
    public List<UserDto> getUsersByProject(@PathVariable Long orgId, @PathVariable Long projectId) {
        return puService.getUsersByProject(orgId, projectId);
    }

    @GetMapping("/users/{userId}")
    public List<ProjectDto> getProjectsByUser(@PathVariable Long orgId, @PathVariable Long userId) {
        return puService.getProjectsByUser(orgId, userId);
    }

    @PostMapping("/projects/{projectId}/users/{userId}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> assignUser(@PathVariable Long orgId, @PathVariable Long projectId, @PathVariable Long userId, @RequestParam String role) {
        puService.assignUserToProject(orgId, projectId, userId, role);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/projects/{projectId}/users/{userId}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> removeUser(@PathVariable Long orgId, @PathVariable Long projectId, @PathVariable Long userId) {
        puService.removeUserFromProject(orgId, projectId, userId);
        return ResponseEntity.noContent().build();
    }
}
