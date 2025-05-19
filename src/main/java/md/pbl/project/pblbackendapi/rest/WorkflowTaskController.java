package md.pbl.project.pblbackendapi.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import md.pbl.project.pblbackendapi.model.workflow.ChangeTaskStateRequestDto;
import md.pbl.project.pblbackendapi.model.workflow.ChangeTaskStateResponseDto;
import md.pbl.project.pblbackendapi.model.workflow.WorkflowTaskDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workflow/tasks")
public class WorkflowTaskController {

    @GetMapping("/{taskId}")
    @Operation(summary = "Get workflow task state")
    @ApiResponse(responseCode = "200", description = "Workflow task state returned")
    public ResponseEntity<WorkflowTaskDto> get(@PathVariable Long taskId) {
        return null;
    }

    @PostMapping("/{taskId}/change-state")
    @Operation(summary = "Change workflow task state")
    @ApiResponse(responseCode = "200", description = "Workflow task state changed")
    @ApiResponse(responseCode = "400", description = "Invalid state transition", content = @Content(schema = @Schema(implementation = ProcessBuilder.class)))
    public ResponseEntity<ChangeTaskStateResponseDto> changeState(@PathVariable Long taskId, @RequestBody ChangeTaskStateRequestDto dto) {
        return null;
    }
}
