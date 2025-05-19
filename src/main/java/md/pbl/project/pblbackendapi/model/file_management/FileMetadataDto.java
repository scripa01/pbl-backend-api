package md.pbl.project.pblbackendapi.model.file_management;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder
public class FileMetadataDto {
    String fileId;
    String filename;
    String contentType;
    long size;
    OffsetDateTime uploadedAt;

}
