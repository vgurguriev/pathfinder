package bg.softuni.pathfinder.model.views;

import java.util.List;
import java.util.Set;

public class RouteDetailsView {
    private Long id;
    private String gpxCoordinates;
    private String level;
    private String name;
    private String description;
    private String authorName;
    private String videoUrl;
    private List<String> pictureUrls;

    public RouteDetailsView(Long id, String gpxCoordinates, String level,
                            String name, String description, String authorName,
                            String videoUrl, List<String> pictureUrls) {
        this.id = id;
        this.gpxCoordinates = gpxCoordinates;
        this.level = level;
        this.name = name;
        this.description = description;
        this.authorName = authorName;
        this.videoUrl = videoUrl;
        this.pictureUrls = pictureUrls;
    }

    public Long getId() {
        return id;
    }

    public RouteDetailsView setId(Long id) {
        this.id = id;
        return this;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public RouteDetailsView setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public RouteDetailsView setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return name;
    }

    public RouteDetailsView setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RouteDetailsView setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAuthorName() {
        return authorName;
    }

    public RouteDetailsView setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public RouteDetailsView setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public List<String> getPictureUrls() {
        return pictureUrls;
    }

    public RouteDetailsView setPictureUrls(List<String> pictureUrls) {
        this.pictureUrls = pictureUrls;
        return this;
    }
}
