package aula104CustomExceptions.domain;

public class InvalidLoginException extends Exception{
    public InvalidLoginException() {
        super("Invalid Login");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}
