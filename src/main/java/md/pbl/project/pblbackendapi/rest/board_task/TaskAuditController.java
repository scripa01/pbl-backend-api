package md.pbl.project.pblbackendapi.rest.board_task;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.model.task.TaskAuditDto;
import md.pbl.project.pblbackendapi.service.board_task.TaskAuditService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks/{taskId}/audit")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearerAuth")
public class TaskAuditController {
    private final TaskAuditService auditService;

    @GetMapping
    public ResponseEntity<List<TaskAuditDto>> getAudit(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @PathVariable Long taskId,
            @RequestHeader("X-User-Id") Long userId
    ) {
        return ResponseEntity.ok(auditService.getAuditForTask(orgId, projId, boardId, taskId, userId));
    }
}
