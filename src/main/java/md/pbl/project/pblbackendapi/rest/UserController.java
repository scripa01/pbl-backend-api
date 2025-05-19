package md.pbl.project.pblbackendapi.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.user.AssignUserToProjectDto;
import md.pbl.project.pblbackendapi.model.user.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/core/organizations/{orgId}/users")
public class UserController {

    @GetMapping
    @Operation(summary = "Get all users in organization")
    @ApiResponse(responseCode = "200", description = "List of users returned")
    public ResponseEntity<List<UserDto>> list(@PathVariable Long orgId) {
        return null;
    }

    @GetMapping("/{userId}")
    @Operation(summary = "Get user by ID")
    @ApiResponse(responseCode = "200", description = "User returned")
    @ApiResponse(responseCode = "404", description = "User not found", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<UserDto> get(@PathVariable Long orgId, @PathVariable Long userId) {
        return null;
    }

    @PostMapping
    @Operation(summary = "Create new user")
    @ApiResponse(responseCode = "201", description = "User created")
    public ResponseEntity<UserDto> create(@PathVariable Long orgId, @RequestBody UserDto dto) {
        return null;
    }

    @PutMapping("/{userId}")
    @Operation(summary = "Update user info")
    @ApiResponse(responseCode = "200", description = "User updated")
    @ApiResponse(responseCode = "404", description = "User not found", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<UserDto> update(@PathVariable Long orgId, @PathVariable Long userId, @RequestBody UserDto dto) {
        return null;
    }

    @DeleteMapping("/{userId}")
    @Operation(summary = "Delete user from organization")
    @ApiResponse(responseCode = "204", description = "User deleted")
    public ResponseEntity<Void> delete(@PathVariable Long orgId, @PathVariable Long userId) {
        return null;
    }

    @PostMapping("/{userId}/projects")
    @Operation(summary = "Assign user to project")
    @ApiResponse(responseCode = "204", description = "User assigned to project")
    public ResponseEntity<Void> assignToProject(@PathVariable Long orgId, @PathVariable Long userId, @RequestBody AssignUserToProjectDto dto) {
        return null;
    }

    @DeleteMapping("/{userId}/projects/{projectId}")
    @Operation(summary = "Remove user from project")
    @ApiResponse(responseCode = "204", description = "User removed from project")
    public ResponseEntity<Void> removeFromProject(@PathVariable Long orgId, @PathVariable Long userId, @PathVariable Long projectId) {
        return null;
    }
}
