package culturemedia.service.Impl;
import culturemedia.model.Video;
import culturemedia.model.VideoReproduction;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.service.CultureMediaService;

import java.util.List;

public class CultureMediaServiceImpl implements CultureMediaService {
    private VideoRepository videoRepository;
    private ViewsRepository viewsRepository;

    public CultureMediaServiceImpl(VideoRepository videoRepository, ViewsRepository viewsRepository) {
        this.videoRepository = videoRepository;
        this.viewsRepository = viewsRepository;
    }

    public List<Video> findAll() {
        return videoRepository.findAll();
    }

    public Video save(Video video)  {
        return videoRepository.save(video);
    }

    public VideoReproduction save(VideoReproduction view)  {
        return viewsRepository.save(view);
    }

}
