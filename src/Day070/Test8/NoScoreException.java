package Day070.Test8;

public class NoScoreException extends RuntimeException{


    public NoScoreException(String message) {
        super(message);
    }
    public NoScoreException() {
    }

    public NoScoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoScoreException(Throwable cause) {
        super(cause);
    }

    public NoScoreException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
