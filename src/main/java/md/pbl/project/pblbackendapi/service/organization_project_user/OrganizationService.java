package md.pbl.project.pblbackendapi.service.organization_project_user;

import md.pbl.project.pblbackendapi.model.organization.OrganizationDto;

import java.util.List;

public interface OrganizationService {
    List<OrganizationDto> getAll();

    OrganizationDto get(Long orgId, boolean loadFullObject);

    OrganizationDto create(OrganizationDto dto);

    OrganizationDto update(Long orgId, OrganizationDto dto);

    void delete(Long orgId);
}

