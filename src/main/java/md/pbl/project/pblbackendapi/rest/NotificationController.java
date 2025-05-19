package md.pbl.project.pblbackendapi.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import md.pbl.project.pblbackendapi.model.notification.NotificationDto;
import md.pbl.project.pblbackendapi.model.notification.NotificationSettingsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @GetMapping
    @Operation(summary = "Get all notifications")
    @ApiResponse(responseCode = "200", description = "List of notifications returned")
    public ResponseEntity<List<NotificationDto>> list() {
        return null;
    }

    @GetMapping("/{notificationId}")
    @Operation(summary = "Get notification by ID")
    @ApiResponse(responseCode = "200", description = "Notification returned")
    public ResponseEntity<NotificationDto> get(@PathVariable Long notificationId) {
        return null;
    }

    @PostMapping
    @Operation(summary = "Create notification")
    @ApiResponse(responseCode = "201", description = "Notification created")
    public ResponseEntity<NotificationDto> create(@RequestBody NotificationDto dto) {
        return null;
    }

    @PutMapping("/{notificationId}")
    @Operation(summary = "Update notification status (read/unread)")
    @ApiResponse(responseCode = "200", description = "Notification status updated")
    public ResponseEntity<NotificationDto> markRead(@PathVariable Long notificationId, @RequestBody NotificationSettingsDto dto) {
        return null;
    }

    @DeleteMapping("/{notificationId}")
    @Operation(summary = "Delete notification")
    @ApiResponse(responseCode = "204", description = "Notification deleted")
    public ResponseEntity<Void> delete(@PathVariable Long notificationId) {
        return null;
    }

    @GetMapping("/settings/{userId}")
    @Operation(summary = "Get user notification settings")
    @ApiResponse(responseCode = "200", description = "Notification settings returned")
    public ResponseEntity<NotificationSettingsDto> settings(@PathVariable Long userId) {
        return null;
    }

    @PutMapping("/settings/{userId}")
    @Operation(summary = "Update user notification settings")
    @ApiResponse(responseCode = "200", description = "Notification settings updated")
    public ResponseEntity<NotificationSettingsDto> updateSettings(@PathVariable Long userId, @RequestBody NotificationSettingsDto dto) {
        return null;
    }
}
