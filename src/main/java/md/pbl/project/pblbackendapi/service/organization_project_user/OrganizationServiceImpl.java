package md.pbl.project.pblbackendapi.service.organization_project_user;

import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.model.organization.OrganizationDto;
import md.pbl.project.pblbackendapi.rest.organization_project_user.client.OrganizationProjectUserClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    private final OrganizationProjectUserClient client;

    @Override
    public List<OrganizationDto> getAll() {
        return client.getAllOrganizations();
    }

    @Override
    public OrganizationDto get(Long orgId, boolean loadFullObject) {
        return client.getOrganization(orgId, loadFullObject);
    }

    @Override
    public OrganizationDto create(OrganizationDto dto) {
        return client.createOrganization(dto);
    }

    @Override
    public OrganizationDto update(Long orgId, OrganizationDto dto) {
        return client.updateOrganization(orgId, dto);
    }

    @Override
    public void delete(Long orgId) {
        client.deleteOrganization(orgId);
    }
}

