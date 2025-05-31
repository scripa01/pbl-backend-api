package md.pbl.project.pblbackendapi.service.organization_project_user;

import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.model.project.ProjectDto;
import md.pbl.project.pblbackendapi.rest.organization_project_user.client.OrganizationProjectUserClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final OrganizationProjectUserClient client;

    @Override
    public List<ProjectDto> getByOrg(Long orgId) {
        return client.getProjectsByOrg(orgId);
    }

    @Override
    public ProjectDto get(Long orgId, Long projectId) {
        return client.getProject(orgId, projectId);
    }

    @Override
    public ProjectDto create(Long orgId, ProjectDto dto) {
        return client.createProject(orgId, dto);
    }

    @Override
    public ProjectDto update(Long orgId, Long projectId, ProjectDto dto) {
        return client.updateProject(orgId, projectId, dto);
    }

    @Override
    public void delete(Long orgId, Long projectId) {
        client.deleteProject(orgId, projectId);
    }
}
