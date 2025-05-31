package md.pbl.project.pblbackendapi.service.board_task;

import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.model.task.TaskAuditDto;
import md.pbl.project.pblbackendapi.rest.board_task.client.BoardTaskClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class TaskAuditServiceImpl implements TaskAuditService {
    private final BoardTaskClient client;

    @Override
    public List<TaskAuditDto> getAuditForTask(Long orgId, Long projId, Long boardId, Long taskId, Long userId) {
        return client.getTaskAudit(orgId, projId, boardId, taskId);
    }
}
