package decagonwk10tskfashionblogapi.models;

import decagonwk10tskfashionblogapi.enums.Gender;
import decagonwk10tskfashionblogapi.enums.Role;
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
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String confirmPassword;

    @Column(nullable = false)
    private Role role;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Category> listOfCategories = new ArrayList<>();

    @CreationTimestamp
    @Column(name = "created_at")
    private Time createdAt;
}
