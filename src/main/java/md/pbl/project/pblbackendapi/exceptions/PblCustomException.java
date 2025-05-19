package md.pbl.project.pblbackendapi.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PblCustomException extends Exception {
    private String message;
    private String errorCode;
    private Throwable cause;

    public PblCustomException(String message) {
        super(message);
        this.message = message;
    }

    public PblCustomException(String message, String errorCode) {
        super(message);
        this.message = message;
        this.errorCode = errorCode;
    }

    public PblCustomException(String message, String errorCode, Throwable cause) {
        super(message, cause);
        this.message = message;
        this.errorCode = errorCode;
        this.cause = cause;
    }

    public PblCustomException(Throwable cause) {
        super(cause);
        this.cause = cause;
    }

    public PblCustomException(String errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
        this.cause = cause;
    }
}
