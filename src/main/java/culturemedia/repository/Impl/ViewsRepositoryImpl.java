package culturemedia.repository.Impl;
import java.util.ArrayList;
import java.util.List;
import culturemedia.model.VideoReproduction;
import culturemedia.repository.ViewsRepository;

public class ViewsRepositoryImpl implements ViewsRepository {
    private final List<VideoReproduction> Views;

    public ViewsRepositoryImpl() {
        this.Views = new ArrayList<>();
    }

    @Override
    public VideoReproduction save(VideoReproduction view) {
        this.Views.add( view );
        return view;
    }
}


