package md.pbl.project.pblbackendapi.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.authorization.*;
import md.pbl.project.pblbackendapi.model.user.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/register")
    @Operation(summary = "Register a new user")
    @ApiResponse(responseCode = "201", description = "User registered successfully")
    @ApiResponse(responseCode = "400", description = "Invalid data", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<AuthResponseDto> register(@RequestBody RegisterRequestDto dto) {
        // implementation
        return null;
    }

    @PostMapping("/login")
    @Operation(summary = "User login")
    @ApiResponse(responseCode = "200", description = "Login successful")
    @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<AuthResponseDto> login(@RequestBody LoginRequestDto dto) {
        // implementation
        return null;
    }

    @PostMapping("/refresh")
    @Operation(summary = "Refresh authentication token")
    @ApiResponse(responseCode = "200", description = "Token refreshed successfully")
    @ApiResponse(responseCode = "400", description = "Invalid refresh token", content = @Content(schema = @Schema(implementation = PblCustomException.class)))
    public ResponseEntity<RefreshTokenResponseDto> refresh(@RequestBody RefreshTokenRequestDto dto) {
        // implementation
        return null;
    }

    @PostMapping("/logout")
    @Operation(summary = "Logout user")
    @ApiResponse(responseCode = "204", description = "User logged out successfully")
    public ResponseEntity<Void> logout(@RequestBody RefreshTokenRequestDto dto) {
        // implementation
        return null;
    }

    @GetMapping("/me")
    @Operation(summary = "Get current user info")
    @ApiResponse(responseCode = "200", description = "User information retrieved")
    public ResponseEntity<UserDto> me(UserDto principal) {
        // implementation
        return null;
    }
}
