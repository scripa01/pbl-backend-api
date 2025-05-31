package md.pbl.project.pblbackendapi.service.board_task;

import md.pbl.project.pblbackendapi.model.task.TaskAuditDto;

import java.util.List;

public interface TaskAuditService {
    List<TaskAuditDto> getAuditForTask(Long orgId, Long projId, Long boardId, Long taskId, Long userId);
}