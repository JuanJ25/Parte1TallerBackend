package culturemedia.service;
import culturemedia.exception.CultureMediaException;
import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.VideoReproduction;
import java.util.List;

public interface CultureMediaService {
  Video save (Video video);
  VideoReproduction save (VideoReproduction videoReproduction);
  List<Video> findAll() throws VideoNotFoundException;
  List <Video> find(String tittle) throws VideoNotFoundException;
  List <Video> find(Double fromDuration, Double toDuration) throws VideoNotFoundException;

}
