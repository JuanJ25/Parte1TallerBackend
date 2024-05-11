package culturemedia.controller;
import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.repository.impl.VideoRepositoryImpl;
import culturemedia.repository.impl.ViewsRepositoryImpl;
import culturemedia.service.CultureMediaService;
import java.util.Collections;
import java.util.List;
import culturemedia.service.Impl.CultureMediaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import static java.util.Collections.emptyList;



@RestController
public class CultureMediaController {

    private final CultureMediaService cultureMediaService;

    public CultureMediaController(CultureMediaService cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }

    public CultureMediaController() {
        this.cultureMediaService = new CultureMediaServiceImpl(new VideoRepositoryImpl(), new ViewsRepositoryImpl());
    }


    @GetMapping("/videos")
    public ResponseEntity<List<Video>> findAllVideos() {

        try {
            return ResponseEntity.ok().body(cultureMediaService.findAll());
        } catch (VideoNotFoundException e) {

            return ResponseEntity.ok().header("Error-Message", e.getMessage()).build();
        }
    }

    @PostMapping("/videos")
    public Video save(@RequestBody @Valid Video video) {
        return cultureMediaService.save(video);
    }
}
