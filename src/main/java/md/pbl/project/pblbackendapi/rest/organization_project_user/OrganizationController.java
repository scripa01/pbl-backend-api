package md.pbl.project.pblbackendapi.rest.organization_project_user;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.model.organization.OrganizationDto;
import md.pbl.project.pblbackendapi.service.organization_project_user.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/core/organizations/{orgId}")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearerAuth")
public class OrganizationController {
    private final OrganizationService orgService;

    @GetMapping
    public List<OrganizationDto> list() {
        return orgService.getAll();
    }

    @GetMapping("/{id}")
    public OrganizationDto get(@PathVariable Long id, @RequestParam boolean loadFullObject) {
        return orgService.get(id, loadFullObject);
    }

    @PostMapping
    @PreAuthorize("hasRole('MASTER')")
    public ResponseEntity<OrganizationDto> create(@RequestBody OrganizationDto dto) {
        return new ResponseEntity<>(orgService.create(dto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('MASTER')")
    public OrganizationDto update(@PathVariable Long id, @RequestBody OrganizationDto dto) {
        return orgService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('MASTER')")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orgService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

