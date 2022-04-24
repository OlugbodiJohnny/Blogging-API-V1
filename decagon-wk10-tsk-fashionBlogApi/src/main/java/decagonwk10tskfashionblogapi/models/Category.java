package decagonwk10tskfashionblogapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String description;

    @ManyToOne
    private Users user;

    @ManyToOne
    private Post post;

    @CreationTimestamp
    @Column(name = "created_at")
    private Time createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private Time updatedAt;
}
