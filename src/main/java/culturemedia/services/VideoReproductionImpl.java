package culturemedia.services;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.VideoReproduction;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;

public class VideoReproductionImpl{

    private ViewsRepository videoReproductionRepository;

    public VideoReproduction save (VideoReproduction videoReproduction) throws VideoNotFoundException{
        try {
            VideoReproduction savedReproduction = videoReproductionRepository.save(videoReproduction);
            if (savedReproduction == null){
                throw new VideoNotFoundException("Error saving Video");
            }
            return savedReproduction;
        } catch (Exception e) {
            throw new VideoNotFoundException("Error saving Video" + e);
        }
    }


}
