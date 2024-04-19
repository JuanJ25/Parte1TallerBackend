package culturemedia.service;
import culturemedia.exception.CultureMediaException;
import culturemedia.model.Video;
import culturemedia.model.VideoReproduction;
import java.util.List;

public interface CultureMediaService {
  List<Video> findAll();
  VideoReproduction save(VideoReproduction save);
  Video save(Video video);


}
