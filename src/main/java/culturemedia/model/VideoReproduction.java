package culturemedia.model;

import java.time.LocalDateTime;

public record VideoReproduction(String userFullName, LocalDateTime startPlayingTime,Integer age, Video video) {
}


