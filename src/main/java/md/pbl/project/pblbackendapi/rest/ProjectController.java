package md.pbl.project.pblbackendapi.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.project.ProjectDto;
import md.pbl.project.pblbackendapi.model.project.ProjectMemberDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/core/organizations/{orgId}/projects")
public class ProjectController {

    @GetMapping
    @Operation(summary = "Get all projects in organization")
    @ApiResponse(responseCode = "200", description = "List of projects returned")
    public ResponseEntity<List<ProjectDto>> list(@PathVariable Long orgId) {
        return null;
    }

    @GetMapping("/{projectId}")
    @Operation(summary = "Get project by ID")
    @ApiResponse(responseCode = "200", description = "Project returned")
    @ApiResponse(responseCode = "404", description = "Project not found", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<ProjectDto> get(@PathVariable Long orgId, @PathVariable Long projectId) {
        return null;
    }

    @PostMapping
    @Operation(summary = "Create new project")
    @ApiResponse(responseCode = "201", description = "Project created")
    @ApiResponse(responseCode = "400", description = "Invalid input", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<ProjectDto> create(@PathVariable Long orgId, @RequestBody ProjectDto dto) {
        return null;
    }

    @PutMapping("/{projectId}")
    @Operation(summary = "Update project")
    @ApiResponse(responseCode = "200", description = "Project updated")
    @ApiResponse(responseCode = "404", description = "Project not found", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<ProjectDto> update(@PathVariable Long orgId, @PathVariable Long projectId, @RequestBody ProjectDto dto) {
        return null;
    }

    @DeleteMapping("/{projectId}")
    @Operation(summary = "Delete project")
    @ApiResponse(responseCode = "204", description = "Project deleted")
    @ApiResponse(responseCode = "404", description = "Project not found", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<Void> delete(@PathVariable Long orgId, @PathVariable Long projectId) {
        return null;
    }

    @PostMapping("/{projectId}/members")
    @Operation(summary = "Add member to project")
    @ApiResponse(responseCode = "204", description = "Member added")
    public ResponseEntity<Void> addMember(@PathVariable Long orgId, @PathVariable Long projectId, @RequestBody ProjectMemberDto dto) {
        return null;
    }

    @DeleteMapping("/{projectId}/members/{userId}")
    @Operation(summary = "Remove member from project")
    @ApiResponse(responseCode = "204", description = "Member removed")
    public ResponseEntity<Void> removeMember(@PathVariable Long orgId, @PathVariable Long projectId, @PathVariable Long userId) {
        return null;
    }
}
