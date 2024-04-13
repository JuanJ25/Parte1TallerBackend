package culturemedia.exception;

import java.text.MessageFormat;

public class VideoNotFoundException extends CultureMediaException {

    // Constructor que recibe el título como parámetro
    public VideoNotFoundException(String title) {
        super(MessageFormat.format("Video with title {0} not found.", title));
    }
    // Constructor seria el vacío
    public VideoNotFoundException() {
        super("Video not found.");
    }
}
