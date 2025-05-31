package md.pbl.project.pblbackendapi.service.board_task;

import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.task.TaskDto;
import md.pbl.project.pblbackendapi.model.task.TaskStatus;

import java.util.List;

public interface TaskService {
    List<TaskDto> getAll(Long orgId, Long projId, Long boardId, Long userId) throws PblCustomException;

    TaskDto get(Long orgId, Long projId, Long boardId, Long taskId, Long userId) throws PblCustomException;

    TaskDto create(Long orgId, Long projId, Long boardId, Long userId, TaskDto dto) throws PblCustomException;

    TaskDto update(Long orgId, Long projId, Long boardId, Long taskId, Long userId, TaskDto dto) throws PblCustomException;

    void delete(Long orgId, Long projId, Long boardId, Long taskId, Long userId) throws PblCustomException;

    TaskDto workflowStatus(Long orgId, Long projId, Long boardId, Long taskId, Long userId, TaskStatus newStatus) throws PblCustomException;
}

