package exceptions;

public class WebdriverNotValidException extends RuntimeException {

    public WebdriverNotValidException() {
        super("Webdriver not valid");
    }
}
