package md.pbl.project.pblbackendapi.service.organization_project_user;

import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.model.project.ProjectDto;
import md.pbl.project.pblbackendapi.model.user.UserDto;
import md.pbl.project.pblbackendapi.rest.organization_project_user.client.OrganizationProjectUserClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectUserServiceImpl implements ProjectUserService {
    private final OrganizationProjectUserClient client;

    @Override
    public List<UserDto> getUsersByProject(Long orgId, Long projectId) {
        return client.getUsersByProject(orgId, projectId);
    }

    @Override
    public List<ProjectDto> getProjectsByUser(Long orgId, Long userId) {
        return client.getProjectsByUser(orgId, userId);
    }

    @Override
    public void assignUserToProject(Long orgId, Long projectId, Long userId, String role) {
        client.assignUserToProject(orgId, projectId, userId, role);
    }

    @Override
    public void removeUserFromProject(Long orgId, Long projectId, Long userId) {
        client.removeUserFromProject(orgId, projectId, userId);
    }
}
