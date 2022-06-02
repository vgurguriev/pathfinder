package bg.softuni.pathfinder.model.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_time", nullable = false)
    private Instant dateTime;

    @Column(columnDefinition = "TEXT")
    private String text;
}
