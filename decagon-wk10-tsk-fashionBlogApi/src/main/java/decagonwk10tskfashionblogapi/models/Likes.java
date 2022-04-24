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

public class Likes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Users user;

    @ManyToOne
    private Post post;

    @ManyToOne
    private Comment comment;

    @CreationTimestamp
    @Column(name = "created_at")
    private Time createdAt;


}
