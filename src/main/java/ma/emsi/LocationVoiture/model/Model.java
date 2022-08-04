package ma.emsi.LocationVoiture.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Year;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "model")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idModel",nullable = false)
    private Integer idModel;
    @Column(name = "libelle", nullable=true)
    private String libelle;
    @Column(name = "annee", nullable=true)
    private Year annee;
    @Column(name = "tarifParJour", nullable=true)
    private double tarifParJour;


    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "model",orphanRemoval = false,
            fetch = FetchType.LAZY)
    //  @LazyCollection(value = LazyCollectionOption.FALSE)
    //foreign key, reference f many

    List<Vehicule> vehicules;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "marque_id")
    @JsonIgnore
    private Marque marque;
}
