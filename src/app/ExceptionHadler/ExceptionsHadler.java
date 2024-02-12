package app.ExceptionHadler;
import app.ExceptionValidator.ExceptionsValidator;
import app.HeightException.HeightException;

public class ExceptionsHadler {
    public String HandleException(String exception) {
        ExceptionsValidator validator = new app.ExceptionHadler.ExceptionsValidator();
        try {
            return validator.validateHeight(validator.validateInputHeight(exception));
        } catch (IllegalArgumentException | HeightException e) {
            return e.getMessage();
        }
    }
}
