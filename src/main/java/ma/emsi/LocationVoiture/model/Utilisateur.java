package ma.emsi.LocationVoiture.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type" )
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUtilisateur",nullable = false)
    private Integer idUtilisateur;
    @Column(name = "prenom", nullable=true)
    private String prenom;
    @Column(name = "nom", nullable=true)
    private String nom;
    @Column(name = "login", nullable=true)
    private String login;
    @Column(name = "password", nullable=true)
    private String password;
    @Column(name = "cin", nullable=true)
    private String cin;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dateNaissance", nullable=true)
    private LocalDate dateNaissance;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dateCreation", nullable=true)
    private LocalDate dateCreation;



    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    List<Role> roles = new ArrayList<>();
}
