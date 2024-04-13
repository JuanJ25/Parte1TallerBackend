package culturemedia.exception;

import java.text.MessageFormat;

public class DurationNotValidException extends CultureMediaException {

    public DurationNotValidException(String tittle, Double Duration) {
        super(MessageFormat.format("Unable to find videos with related tittle {0} and duration {1} ", tittle, Duration));


    }
}
