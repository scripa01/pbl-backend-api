package md.pbl.project.pblbackendapi.service.board_task;

import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.task.TaskDto;
import md.pbl.project.pblbackendapi.model.task.TaskStatus;
import md.pbl.project.pblbackendapi.rest.board_task.client.BoardTaskClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class TaskServiceImpl implements TaskService {
    private final BoardTaskClient client;

    @Override
    public List<TaskDto> getAll(Long orgId, Long projId, Long boardId, Long userId) throws PblCustomException {
        return client.getTasks(orgId, projId, boardId);
    }

    @Override
    public TaskDto get(Long orgId, Long projId, Long boardId, Long taskId, Long userId) throws PblCustomException {
        return client.getTask(orgId, projId, boardId, taskId);
    }

    @Override
    public TaskDto create(Long orgId, Long projId, Long boardId, Long userId, TaskDto dto) throws PblCustomException {
        return client.createTask(orgId, projId, boardId, dto);
    }

    @Override
    public TaskDto update(Long orgId, Long projId, Long boardId, Long taskId, Long userId, TaskDto dto) throws PblCustomException {
        return client.updateTask(orgId, projId, boardId, taskId, dto);
    }

    @Override
    public void delete(Long orgId, Long projId, Long boardId, Long taskId, Long userId) throws PblCustomException {
        client.deleteTask(orgId, projId, boardId, taskId);
    }

    @Override
    public TaskDto workflowStatus(Long orgId, Long projId, Long boardId, Long taskId, Long userId, TaskStatus newStatus) throws PblCustomException {
        return client.changeTaskStatus(orgId, projId, boardId, taskId, newStatus);
    }
}

