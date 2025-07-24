public class InputValidationException extends Exception{
    String message;
    public InputValidationException(String message) {
        super(message);
    }
}
