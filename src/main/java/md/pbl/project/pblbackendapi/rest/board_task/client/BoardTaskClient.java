package md.pbl.project.pblbackendapi.rest.board_task.client;

import md.pbl.project.pblbackendapi.model.board.BoardDto;
import md.pbl.project.pblbackendapi.model.task.CommentDto;
import md.pbl.project.pblbackendapi.model.task.TaskAuditDto;
import md.pbl.project.pblbackendapi.model.task.TaskDto;
import md.pbl.project.pblbackendapi.model.task.TaskStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "board-service", url = "${org.service.url.board-task}")
public interface BoardTaskClient {
    // Boards
    @GetMapping("/api/orgs/{orgId}/projects/{projId}/boards")
    List<BoardDto> getBoards(@PathVariable Long orgId, @PathVariable Long projId, @RequestHeader("X-User-Id") Long userId);

    @GetMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}")
    BoardDto getBoard(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @RequestHeader("X-User-Id") Long userId);

    @PostMapping("/api/orgs/{orgId}/projects/{projId}/boards")
    BoardDto createBoard(@PathVariable Long orgId, @PathVariable Long projId, @RequestBody BoardDto dto, @RequestHeader("X-User-Id") Long userId);

    @PutMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}")
    BoardDto updateBoard(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @RequestBody BoardDto dto, @RequestHeader("X-User-Id") Long userId);

    @DeleteMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}")
    void deleteBoard(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @RequestHeader("X-User-Id") Long userId);

    // Tasks
    @GetMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks")
    List<TaskDto> getTasks(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @RequestHeader("X-User-Id") Long userId);

    @GetMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks/{taskId}")
    TaskDto getTask(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @PathVariable Long taskId, @RequestHeader("X-User-Id") Long userId);

    @PostMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks")
    TaskDto createTask(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @RequestBody TaskDto dto, @RequestHeader("X-User-Id") Long userId);

    @PutMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks/{taskId}")
    TaskDto updateTask(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @PathVariable Long taskId, @RequestBody TaskDto dto, @RequestHeader("X-User-Id") Long userId);

    @DeleteMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks/{taskId}")
    void deleteTask(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @PathVariable Long taskId, @RequestHeader("X-User-Id") Long userId);

    @PutMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks/{taskId}/status")
    TaskDto changeTaskStatus(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @PathVariable Long taskId, @RequestParam TaskStatus newStatus, @RequestHeader("X-User-Id") Long userId);

    // Comments
    @GetMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks/{taskId}/comments")
    List<CommentDto> getComments(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @PathVariable Long taskId, @RequestHeader("X-User-Id") Long userId);

    @GetMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks/{taskId}/comments/{id}")
    CommentDto getComment(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @PathVariable Long taskId, @PathVariable Long id, @RequestHeader("X-User-Id") Long userId);

    @PostMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks/{taskId}/comments")
    CommentDto createComment(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @PathVariable Long taskId, @RequestBody CommentDto dto, @RequestHeader("X-User-Id") Long userId);

    @PutMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks/{taskId}/comments/{id}")
    CommentDto updateComment(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @PathVariable Long taskId, @PathVariable Long id, @RequestBody CommentDto dto, @RequestHeader("X-User-Id") Long userId);

    @DeleteMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks/{taskId}/comments/{id}")
    void deleteComment(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @PathVariable Long taskId, @PathVariable Long id, @RequestHeader("X-User-Id") Long userId);

    // Audit
    @GetMapping("/api/orgs/{orgId}/projects/{projId}/boards/{boardId}/tasks/{taskId}/audit")
    List<TaskAuditDto> getTaskAudit(@PathVariable Long orgId, @PathVariable Long projId, @PathVariable Long boardId, @PathVariable Long taskId, @RequestHeader("X-User-Id") Long userId);
}
