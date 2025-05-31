package md.pbl.project.pblbackendapi.service.organization_project_user;

import md.pbl.project.pblbackendapi.model.project.ProjectDto;

import java.util.List;

public interface ProjectService {
    List<ProjectDto> getByOrg(Long orgId);

    ProjectDto get(Long orgId, Long projectId);

    ProjectDto create(Long orgId, ProjectDto dto);

    ProjectDto update(Long orgId, Long projectId, ProjectDto dto);

    void delete(Long orgId, Long projectId);
}
