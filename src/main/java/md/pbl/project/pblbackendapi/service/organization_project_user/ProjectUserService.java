package md.pbl.project.pblbackendapi.service.organization_project_user;

import md.pbl.project.pblbackendapi.model.project.ProjectDto;
import md.pbl.project.pblbackendapi.model.user.UserDto;

import java.util.List;

public interface ProjectUserService {
    List<UserDto> getUsersByProject(Long orgId, Long projectId);

    List<ProjectDto> getProjectsByUser(Long orgId, Long userId);

    void assignUserToProject(Long orgId, Long projectId, Long userId, String role);

    void removeUserFromProject(Long orgId, Long projectId, Long userId);
}
