package md.pbl.project.pblbackendapi.rest.board_task;

import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.task.TaskDto;
import md.pbl.project.pblbackendapi.model.task.TaskStatus;
import md.pbl.project.pblbackendapi.service.board_task.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService service;

    @GetMapping
    public ResponseEntity<List<TaskDto>> list(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @RequestHeader("X-User-Id") Long userId
    ) throws PblCustomException {
        return ResponseEntity.ok(service.getAll(orgId, projId, boardId, userId));
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<TaskDto> get(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @PathVariable Long taskId,
            @RequestHeader("X-User-Id") Long userId
    ) throws PblCustomException {
        return ResponseEntity.ok(service.get(orgId, projId, boardId, taskId, userId));
    }

    @PostMapping
    @PreAuthorize("hasRole('MASTER')")
    public ResponseEntity<TaskDto> create(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @RequestHeader("X-User-Id") Long userId,
            @RequestBody TaskDto dto
    ) throws PblCustomException {
        return new ResponseEntity<>(service.create(orgId, projId, boardId, userId, dto), HttpStatus.CREATED);
    }

    @PutMapping("/{taskId}")
    @PreAuthorize("hasRole('MASTER')")
    public ResponseEntity<TaskDto> update(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @PathVariable Long taskId,
            @RequestHeader("X-User-Id") Long userId,
            @RequestBody TaskDto dto
    ) throws PblCustomException {
        return ResponseEntity.ok(service.update(orgId, projId, boardId, taskId, userId, dto));
    }

    @DeleteMapping("/{taskId}")
    @PreAuthorize("hasRole('MASTER')")
    public ResponseEntity<Void> delete(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @PathVariable Long taskId,
            @RequestHeader("X-User-Id") Long userId
    ) throws PblCustomException {
        service.delete(orgId, projId, boardId, taskId, userId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{taskId}/status")
    @PreAuthorize("hasRole('MASTER')")
    public ResponseEntity<TaskDto> changeStatus(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @PathVariable Long taskId,
            @RequestHeader("X-User-Id") Long userId,
            @RequestParam TaskStatus newStatus
    ) throws PblCustomException {
        return ResponseEntity.ok(service.workflowStatus(orgId, projId, boardId, taskId, userId, newStatus));
    }
}
