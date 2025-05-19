package md.pbl.project.pblbackendapi.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import md.pbl.project.pblbackendapi.model.board.BoardDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    @GetMapping
    @Operation(summary = "Get all boards")
    @ApiResponse(responseCode = "200", description = "List of boards returned")
    public ResponseEntity<List<BoardDto>> list() {
        return null;
    }

    @GetMapping("/{boardId}")
    @Operation(summary = "Get board by ID")
    @ApiResponse(responseCode = "200", description = "Board returned")
    public ResponseEntity<BoardDto> get(@PathVariable Long boardId) {
        return null;
    }

    @PostMapping
    @Operation(summary = "Create new board")
    @ApiResponse(responseCode = "201", description = "Board created")
    public ResponseEntity<BoardDto> create(@RequestBody BoardDto dto) {
        return null;
    }

    @PutMapping("/{boardId}")
    @Operation(summary = "Update board info")
    @ApiResponse(responseCode = "200", description = "Board updated")
    public ResponseEntity<BoardDto> update(@PathVariable Long boardId, @RequestBody BoardDto dto) {
        return null;
    }

    @DeleteMapping("/{boardId}")
    @Operation(summary = "Delete board")
    @ApiResponse(responseCode = "204", description = "Board deleted")
    public ResponseEntity<Void> delete(@PathVariable Long boardId) {
        return null;
    }
}
