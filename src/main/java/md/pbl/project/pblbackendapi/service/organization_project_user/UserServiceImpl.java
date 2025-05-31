package md.pbl.project.pblbackendapi.service.organization_project_user;

import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.model.user.UserDto;
import md.pbl.project.pblbackendapi.rest.organization_project_user.client.OrganizationProjectUserClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final OrganizationProjectUserClient client;

    @Override
    public List<UserDto> getByOrg(Long orgId) {
        return client.getUsersByOrg(orgId);
    }

    @Override
    public UserDto get(Long orgId, Long userId) {
        return client.getUser(orgId, userId);
    }

    @Override
    public UserDto getUserByUsername(Long orgId, String username) {
        return client.getUserByUsername(orgId, username);
    }

    @Override
    public UserDto create(Long orgId, UserDto dto) {
        return client.createUser(orgId, dto);
    }

    @Override
    public UserDto update(Long orgId, Long userId, UserDto dto) {
        return client.updateUser(orgId, userId, dto);
    }

    @Override
    public void delete(Long orgId, Long userId) {
        client.deleteUser(orgId, userId);
    }

}
