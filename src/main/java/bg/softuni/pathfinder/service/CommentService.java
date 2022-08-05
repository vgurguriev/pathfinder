package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.model.dto.CommentCreationDTO;
import bg.softuni.pathfinder.model.entity.Comment;
import bg.softuni.pathfinder.model.entity.User;
import bg.softuni.pathfinder.model.views.CommentDisplayView;
import bg.softuni.pathfinder.repository.CommentRepository;
import bg.softuni.pathfinder.repository.RouteRepository;
import bg.softuni.pathfinder.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CommentService {

    private final RouteRepository routeRepository;
    private final UserRepository userRepository;
    private final CommentRepository commentRepository;

    public CommentService(RouteRepository routeRepository, UserRepository userRepository, CommentRepository commentRepository) {
        this.routeRepository = routeRepository;
        this.userRepository = userRepository;
        this.commentRepository = commentRepository;
    }

    public CommentDisplayView createComment(CommentCreationDTO commentDTO) {
        User author = userRepository.findByUsername(commentDTO.getUsername()).get();
        Comment comment = new Comment();

        comment.setCreated(LocalDateTime.now());
        comment.setRoute(routeRepository.getById(commentDTO.getRouteId()));
        comment.setAuthor(author);
        comment.setApproved(true);
        comment.setTextContent(commentDTO.getMessage());

        commentRepository.save(comment);

        return new CommentDisplayView(comment.getId(), author.getFullName(), comment.getTextContent());
    }
}
