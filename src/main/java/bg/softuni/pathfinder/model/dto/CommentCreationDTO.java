package bg.softuni.pathfinder.model.dto;

public class CommentCreationDTO {
    private String username;
    private Long routeId;
    private String message;

    public CommentCreationDTO(String username, Long routeId, String message) {
        this.username = username;
        this.routeId = routeId;
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public CommentCreationDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public Long getRouteId() {
        return routeId;
    }

    public CommentCreationDTO setRouteId(Long routeId) {
        this.routeId = routeId;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CommentCreationDTO setMessage(String message) {
        this.message = message;
        return this;
    }
}
