package ma.emsi.LocationVoiture.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role", nullable = false)
    private Integer idRole;
    private String name;


    @ManyToMany(mappedBy = "roles")
            @JsonIgnore
    List<Utilisateur> users;
}
