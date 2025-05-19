package md.pbl.project.pblbackendapi.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.annotation.Resource;
import md.pbl.project.pblbackendapi.model.file_management.DeleteFileResponseDto;
import md.pbl.project.pblbackendapi.model.file_management.FileMetadataDto;
import md.pbl.project.pblbackendapi.model.file_management.UploadFileResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @PostMapping("/upload")
    @Operation(summary = "Upload a file")
    @ApiResponse(responseCode = "201", description = "File uploaded successfully")
    public ResponseEntity<UploadFileResponseDto> upload(@RequestParam("file") MultipartFile file) {
        return null;
    }

    @GetMapping("/{fileId}")
    @Operation(summary = "Download a file")
    @ApiResponse(responseCode = "200", description = "File downloaded")
    public ResponseEntity<Resource> download(@PathVariable String fileId) {
        return null;
    }

    @GetMapping("/{fileId}/metadata")
    @Operation(summary = "Get file metadata")
    @ApiResponse(responseCode = "200", description = "File metadata returned")
    public ResponseEntity<FileMetadataDto> metadata(@PathVariable String fileId) {
        return null;
    }

    @DeleteMapping("/{fileId}")
    @Operation(summary = "Delete a file")
    @ApiResponse(responseCode = "204", description = "File deleted")
    public ResponseEntity<DeleteFileResponseDto> delete(@PathVariable String fileId) {
        return null;
    }
}
