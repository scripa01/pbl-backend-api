package md.pbl.project.pblbackendapi.rest.board_task;

import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.board.BoardDto;
import md.pbl.project.pblbackendapi.service.board_task.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orgs/{orgId}/projects/{projId}/boards")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service;

    @GetMapping
    public ResponseEntity<List<BoardDto>> list(
            @PathVariable Long orgId,
            @PathVariable Long projId
    ) throws PblCustomException {
        return ResponseEntity.ok(service.getAll(orgId, projId));
    }

    @GetMapping("/{boardId}")
    public ResponseEntity<BoardDto> get(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId
    ) throws PblCustomException {
        return ResponseEntity.ok(service.get(orgId, projId, boardId));
    }

    @PostMapping
    @PreAuthorize("hasRole('MASTER')")
    public ResponseEntity<BoardDto> create(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @RequestHeader("X-User-Id") Long userId,
            @RequestBody BoardDto dto
    ) throws PblCustomException {
        return new ResponseEntity<>(service.create(orgId, projId, userId, dto), HttpStatus.CREATED);
    }

    @PutMapping("/{boardId}")
    @PreAuthorize("hasRole('MASTER')")
    public ResponseEntity<BoardDto> update(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @RequestHeader("X-User-Id") Long userId,
            @RequestBody BoardDto dto
    ) throws PblCustomException {
        return ResponseEntity.ok(service.update(orgId, projId, boardId, userId, dto));
    }

    @DeleteMapping("/{boardId}")
    @PreAuthorize("hasRole('MASTER')")
    public ResponseEntity<Void> delete(
            @PathVariable Long orgId,
            @PathVariable Long projId,
            @PathVariable Long boardId,
            @RequestHeader("X-User-Id") Long userId
    ) throws PblCustomException {
        service.delete(orgId, projId, boardId, userId);
        return ResponseEntity.noContent().build();
    }
}

