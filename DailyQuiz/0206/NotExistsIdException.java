package chapter09;

public class NotExistsIdException extends Exception{
    public NotExistsIdException() {

    }
    public NotExistsIdException(String message) {
        super(message);
    }
}
