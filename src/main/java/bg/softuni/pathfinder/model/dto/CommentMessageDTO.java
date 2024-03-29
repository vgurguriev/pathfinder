package bg.softuni.pathfinder.model.dto;

public class CommentMessageDTO {
    private String message;

    public String getMessage() {
        return message;
    }

    public CommentMessageDTO(String message) {
        this.message = message;
    }

    public CommentMessageDTO() {}

    public CommentMessageDTO setMessage(String message) {
        this.message = message;
        return this;
    }
}
