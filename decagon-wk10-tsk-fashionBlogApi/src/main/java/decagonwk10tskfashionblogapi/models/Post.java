package decagonwk10tskfashionblogapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false, unique = true)
    private String description;

    private Long countOfLikes;


    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Likes> listOfLikes = new ArrayList<>();

//    private String imgUrl;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Category> listOfCategories = new ArrayList<>();

    //EAGER
    @OneToMany(mappedBy = "post", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> listOfComments = new ArrayList<>();

    @ManyToOne
    private Users user;

    @CreationTimestamp
    @Column(name = "created_at")
    private Time createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private Time updatedAt;
}
