package ma.emsi.LocationVoiture.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categorie")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategorie",nullable = false)
    private Integer idCategorie;
    @Column(name = "libelle", nullable=true)
    private String libelle;


    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "categorie",orphanRemoval = false,
            fetch = FetchType.LAZY)
    //  @LazyCollection(value = LazyCollectionOption.FALSE)
    //foreign key, reference f many

    List<Vehicule> vehicules;
}
