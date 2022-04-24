package decagonwk10tskfashionblogapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Time;

@NoArgsConstructor

@AllArgsConstructor

@Getter

@Setter

@Entity

public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    private Comment comment;

    @CreationTimestamp
    @Column(name = "created_at")
    private Time createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private Time updatedAt;
}
