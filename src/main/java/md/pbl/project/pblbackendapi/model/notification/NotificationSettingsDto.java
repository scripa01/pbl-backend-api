package md.pbl.project.pblbackendapi.model.notification;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class NotificationSettingsDto {
    Long userId;
    boolean emailEnabled;
    boolean pushEnabled;
    boolean inAppEnabled;
}
