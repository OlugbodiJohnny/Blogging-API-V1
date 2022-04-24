package decagonwk10tskfashionblogapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.lang.module.FindException;
import java.sql.Time;
import java.util.List;
import java.util.Set;

@NoArgsConstructor

@AllArgsConstructor

@Getter

@Setter

@Entity

public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private Long countOfLikes;

    @ManyToOne
    private Users user;

    @ManyToOne
    private Post post;

    @OneToMany(mappedBy = "comment", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Likes> listOfLikes;


    @OneToMany(mappedBy = "comment", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reply> listOfReplies;

    @CreationTimestamp
    @Column(name = "created_at")
    private Time createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private Time updatedAt;

}
