package md.pbl.project.pblbackendapi.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import md.pbl.project.pblbackendapi.model.task.TaskDto;
import md.pbl.project.pblbackendapi.model.task.TaskFilterDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards/{boardId}/tasks")
public class TaskController {

    @GetMapping
    @Operation(summary = "Get tasks for board")
    @ApiResponse(responseCode = "200", description = "List of tasks returned")
    public ResponseEntity<List<TaskDto>> list(@PathVariable Long boardId) {
        return null;
    }

    @GetMapping("/{taskId}")
    @Operation(summary = "Get task by ID")
    @ApiResponse(responseCode = "200", description = "Task returned")
    public ResponseEntity<TaskDto> get(@PathVariable Long boardId, @PathVariable Long taskId) {
        return null;
    }

    @PostMapping
    @Operation(summary = "Create new task")
    @ApiResponse(responseCode = "201", description = "Task created")
    public ResponseEntity<TaskDto> create(@PathVariable Long boardId, @RequestBody TaskDto dto) {
        return null;
    }

    @PutMapping("/{taskId}")
    @Operation(summary = "Update task info")
    @ApiResponse(responseCode = "200", description = "Task updated")
    public ResponseEntity<TaskDto> update(@PathVariable Long boardId, @PathVariable Long taskId, @RequestBody TaskDto dto) {
        return null;
    }

    @DeleteMapping("/{taskId}")
    @Operation(summary = "Delete task")
    @ApiResponse(responseCode = "204", description = "Task deleted")
    public ResponseEntity<Void> delete(@PathVariable Long boardId, @PathVariable Long taskId) {
        return null;
    }

    @GetMapping("/all")
    @Operation(summary = "Filter tasks across boards")
    @ApiResponse(responseCode = "200", description = "Filtered tasks returned")
    public ResponseEntity<List<TaskDto>> filter(
            @RequestBody TaskFilterDto taskFilterDto) {
        return null;
    }
}
