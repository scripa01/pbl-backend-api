package md.pbl.project.pblbackendapi.model.notification;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@Builder
public class NotificationDto {
    Long id;
    Long recipientId;
    String type;       // e.g. TASK_ASSIGNED, COMMENT_ADDED
    String message;
    boolean read;
    OffsetDateTime sentAt;

}
