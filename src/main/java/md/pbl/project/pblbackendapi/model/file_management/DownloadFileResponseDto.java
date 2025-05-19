package md.pbl.project.pblbackendapi.model.file_management;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class DownloadFileResponseDto {
    byte[] data;
    String filename;
    String contentType;
}
