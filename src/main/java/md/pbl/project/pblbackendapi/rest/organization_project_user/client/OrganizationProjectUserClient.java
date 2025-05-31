package md.pbl.project.pblbackendapi.rest.organization_project_user.client;

import md.pbl.project.pblbackendapi.model.organization.OrganizationDto;
import md.pbl.project.pblbackendapi.model.project.ProjectDto;
import md.pbl.project.pblbackendapi.model.user.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "org-service", url = "${org.service.url.organization-project-user}")
public interface OrganizationProjectUserClient {
    // Organization endpoints
    @GetMapping("/api/core/organizations")
    List<OrganizationDto> getAllOrganizations();

    @GetMapping("/api/core/organizations/{orgId}")
    OrganizationDto getOrganization(@PathVariable("orgId") Long orgId,
                                    @RequestParam boolean loadFullObject);

    @PostMapping("/api/core/organizations")
    OrganizationDto createOrganization(@RequestBody OrganizationDto dto);

    @PutMapping("/api/core/organizations/{orgId}")
    OrganizationDto updateOrganization(@PathVariable("orgId") Long orgId,
                                       @RequestBody OrganizationDto dto);

    @DeleteMapping("/api/core/organizations/{orgId}")
    void deleteOrganization(@PathVariable("orgId") Long orgId);

    // Project endpoints
    @GetMapping("/api/core/organizations/{orgId}/projects")
    List<ProjectDto> getProjectsByOrg(@PathVariable("orgId") Long orgId);

    @GetMapping("/api/core/organizations/{orgId}/projects/{projectId}")
    ProjectDto getProject(@PathVariable("orgId") Long orgId,
                          @PathVariable("projectId") Long projectId);

    @PostMapping("/api/core/organizations/{orgId}/projects")
    ProjectDto createProject(@PathVariable("orgId") Long orgId,
                             @RequestBody ProjectDto dto);

    @PutMapping("/api/core/organizations/{orgId}/projects/{projectId}")
    ProjectDto updateProject(@PathVariable("orgId") Long orgId,
                             @PathVariable("projectId") Long projectId,
                             @RequestBody ProjectDto dto);

    @DeleteMapping("/api/core/organizations/{orgId}/projects/{projectId}")
    void deleteProject(@PathVariable("orgId") Long orgId,
                       @PathVariable("projectId") Long projectId);

    // User endpoints
    @GetMapping("/api/core/organizations/{orgId}/users")
    List<UserDto> getUsersByOrg(@PathVariable Long orgId);

    @GetMapping("/api/core/organizations/{orgId}/users/{userId}")
    UserDto getUser(@PathVariable Long orgId, @PathVariable Long userId);

    @GetMapping("/api/core/organizations/{orgId}/users/findUserByUsername")
    UserDto getUserByUsername(@PathVariable Long orgId, @RequestParam String username);

    @PostMapping("/api/core/organizations/{orgId}/users")
    UserDto createUser(@PathVariable Long orgId, @RequestBody UserDto dto);

    @PutMapping("/api/core/organizations/{orgId}/users/{userId}")
    UserDto updateUser(@PathVariable Long orgId, @PathVariable Long userId, @RequestBody UserDto dto);

    @DeleteMapping("/api/core/organizations/{orgId}/users/{userId}")
    void deleteUser(@PathVariable Long orgId, @PathVariable Long userId);

    // Project-User endpoints
    @GetMapping("/api/core/organizations/{orgId}/project-users/projects/{projectId}")
    List<UserDto> getUsersByProject(
            @PathVariable("orgId") Long orgId,
            @PathVariable("projectId") Long projectId
    );

    @GetMapping("/api/core/organizations/{orgId}/project-users/users/{userId}")
    List<ProjectDto> getProjectsByUser(
            @PathVariable("orgId") Long orgId,
            @PathVariable("userId") Long userId
    );

    @PostMapping("/api/core/organizations/{orgId}/project-users/projects/{projectId}/users/{userId}")
    void assignUserToProject(
            @PathVariable Long orgId,
            @PathVariable Long projectId,
            @PathVariable Long userId,
            @RequestParam String role
    );

    @DeleteMapping("/api/core/organizations/{orgId}/project-users/projects/{projectId}/users/{userId}")
    void removeUserFromProject(
            @PathVariable Long orgId,
            @PathVariable Long projectId,
            @PathVariable Long userId
    );
}
