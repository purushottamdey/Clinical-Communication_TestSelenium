package myApp.exception;

public class ElementNotFound extends Exception {
    String message;

    ElementNotFound(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
