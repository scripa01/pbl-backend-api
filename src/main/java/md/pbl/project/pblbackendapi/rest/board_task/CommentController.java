package md.pbl.project.pblbackendapi.rest.board_task;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.task.CommentDto;
import md.pbl.project.pblbackendapi.service.board_task.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks/{taskId}/comments")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearerAuth")
public class CommentController {
    private final CommentService service;

    @GetMapping
    public ResponseEntity<List<CommentDto>> list(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @PathVariable Long taskId,
            @RequestHeader("X-User-Id") Long userId
    ) throws PblCustomException {
        return ResponseEntity.ok(service.getAll(orgId, projId, boardId, taskId, userId));
    }

    @GetMapping("/{commentId}")
    public ResponseEntity<CommentDto> get(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @PathVariable Long taskId,
            @PathVariable Long commentId,
            @RequestHeader("X-User-Id") Long userId
    ) throws PblCustomException {
        return ResponseEntity.ok(service.get(orgId, projId, boardId, taskId, commentId, userId));
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<CommentDto> create(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @PathVariable Long taskId,
            @RequestHeader("X-User-Id") Long userId,
            @RequestBody CommentDto dto
    ) throws PblCustomException {
        return new ResponseEntity<>(service.create(orgId, projId, boardId, taskId, userId, dto), HttpStatus.CREATED);
    }

    @PutMapping("/{commentId}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<CommentDto> update(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @PathVariable Long taskId,
            @PathVariable Long commentId,
            @RequestHeader("X-User-Id") Long userId,
            @RequestBody CommentDto dto
    ) throws PblCustomException {
        return ResponseEntity.ok(service.update(orgId, projId, boardId, taskId, commentId, userId, dto));
    }

    @DeleteMapping("/{commentId}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> delete(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @PathVariable Long taskId,
            @PathVariable Long commentId,
            @RequestHeader("X-User-Id") Long userId
    ) throws PblCustomException {
        service.delete(orgId, projId, boardId, taskId, commentId, userId);
        return ResponseEntity.noContent().build();
    }
}
