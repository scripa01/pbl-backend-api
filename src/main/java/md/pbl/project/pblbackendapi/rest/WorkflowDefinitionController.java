package md.pbl.project.pblbackendapi.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import md.pbl.project.pblbackendapi.model.workflow.WorkflowDefinitionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workflow/definitions")
public class WorkflowDefinitionController {

    @GetMapping
    @Operation(summary = "Get all workflow definitions")
    @ApiResponse(responseCode = "200", description = "List of workflow definitions returned")
    public ResponseEntity<List<WorkflowDefinitionDto>> list() {
        return null;
    }

    @GetMapping("/{defId}")
    @Operation(summary = "Get workflow definition by ID")
    @ApiResponse(responseCode = "200", description = "Workflow definition returned")
    public ResponseEntity<WorkflowDefinitionDto> get(@PathVariable Long defId) {
        return null;
    }

    @PostMapping
    @Operation(summary = "Create new workflow definition")
    @ApiResponse(responseCode = "201", description = "Workflow definition created")
    public ResponseEntity<WorkflowDefinitionDto> create(@RequestBody WorkflowDefinitionDto dto) {
        return null;
    }

    @PutMapping("/{defId}")
    @Operation(summary = "Update workflow definition")
    @ApiResponse(responseCode = "200", description = "Workflow definition updated")
    public ResponseEntity<WorkflowDefinitionDto> update(@PathVariable Long defId, @RequestBody WorkflowDefinitionDto dto) {
        return null;
    }

    @DeleteMapping("/{defId}")
    @Operation(summary = "Delete workflow definition")
    @ApiResponse(responseCode = "204", description = "Workflow definition deleted")
    public ResponseEntity<Void> delete(@PathVariable Long defId) {
        return null;
    }
}
