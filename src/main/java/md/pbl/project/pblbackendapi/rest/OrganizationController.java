package md.pbl.project.pblbackendapi.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.organization.OrganizationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/core/organizations")
public class OrganizationController {

    @GetMapping
    @Operation(summary = "Get all organizations")
    @ApiResponse(responseCode = "200", description = "List of organizations returned")
    public ResponseEntity<List<OrganizationDto>> list() {
        return null;
    }

    @GetMapping("/{orgId}")
    @Operation(summary = "Get organization by ID")
    @ApiResponse(responseCode = "200", description = "Organization returned")
    @ApiResponse(responseCode = "404", description = "Organization not found", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<OrganizationDto> get(@PathVariable Long orgId) {
        return null;
    }

    @PostMapping
    @Operation(summary = "Create new organization")
    @ApiResponse(responseCode = "201", description = "Organization created")
    @ApiResponse(responseCode = "400", description = "Invalid input", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<OrganizationDto> create(@RequestBody OrganizationDto dto) {
        return null;
    }

    @PutMapping("/{orgId}")
    @Operation(summary = "Update organization")
    @ApiResponse(responseCode = "200", description = "Organization updated")
    @ApiResponse(responseCode = "404", description = "Organization not found", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<OrganizationDto> update(@PathVariable Long orgId, @RequestBody OrganizationDto dto) {
        return null;
    }

    @DeleteMapping("/{orgId}")
    @Operation(summary = "Delete organization")
    @ApiResponse(responseCode = "204", description = "Organization deleted")
    @ApiResponse(responseCode = "404", description = "Organization not found", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<Void> delete(@PathVariable Long orgId) {
        return null;
    }
}

