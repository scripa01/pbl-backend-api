package md.pbl.project.pblbackendapi.rest.organization_project_user;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.project.ProjectDto;
import md.pbl.project.pblbackendapi.service.organization_project_user.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/core/organizations/{orgId}/projects")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearerAuth")
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping
    public List<ProjectDto> list(@PathVariable Long orgId) {
        return projectService.getByOrg(orgId);
    }

    @GetMapping("/{projectId}")
    public ProjectDto get(@PathVariable Long orgId, @PathVariable Long projectId) throws PblCustomException {
        return projectService.get(orgId, projectId);
    }

    @PostMapping
    @PreAuthorize("hasRole('MASTER')")
    public ResponseEntity<ProjectDto> create(@PathVariable Long orgId, @RequestBody ProjectDto dto) {
        return new ResponseEntity<>(projectService.create(orgId, dto), HttpStatus.CREATED);
    }

    @PutMapping("/{projectId}")
    @PreAuthorize("hasRole('MASTER')")
    public ProjectDto update(@PathVariable Long orgId, @PathVariable Long projectId, @RequestBody ProjectDto dto) throws PblCustomException {
        return projectService.update(orgId, projectId, dto);
    }

    @DeleteMapping("/{projectId}")
    @PreAuthorize("hasRole('MASTER')")
    public ResponseEntity<Void> delete(@PathVariable Long orgId, @PathVariable Long projectId) {
        projectService.delete(orgId, projectId);
        return ResponseEntity.noContent().build();
    }
}
