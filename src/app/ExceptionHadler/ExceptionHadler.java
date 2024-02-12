package app.ExceptionHadler;
import app.ExceptionValidator.ExceptionValidator;
import app.HeightException.HeightException;

public class ExceptionHadler {
    public String HandleException(String exception) {
        ExceptionValidator validator = new ExceptionsValidator();
        try {
            return validator.validateHeight(validator.validateInputHeight(exception));
        } catch (IllegalArgumentException | HeightException e) {
            return e.getMessage();
        }
    }
}
