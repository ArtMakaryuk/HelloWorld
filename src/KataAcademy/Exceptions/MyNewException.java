package KataAcademy.Exceptions;

public class MyNewException extends Exception {
    public MyNewException() {
        super();
    }

    public MyNewException(String message) {
        super(message);
    }

    public MyNewException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyNewException(Throwable cause) {
        super(cause);
    }
}
