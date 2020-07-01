package exception;

public class TooShortStringLengthException extends Exception {
    public TooShortStringLengthException(String message) {
        super(message);
    }
}
