package md.pbl.project.pblbackendapi.service.organization_project_user;

import md.pbl.project.pblbackendapi.model.user.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getByOrg(Long orgId);

    UserDto get(Long orgId, Long userId);

    UserDto getUserByUsername(Long orgId, String username);

    UserDto create(Long orgId, UserDto dto);

    UserDto update(Long orgId, Long userId, UserDto dto);

    void delete(Long orgId, Long userId);

}

