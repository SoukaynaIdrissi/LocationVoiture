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
@Table(name = "vehicule")
public class Vehicule {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVehicule",nullable = false)
    private Integer idUtilisateur;
    @Column(name = "typeCarburant", nullable=true)
    private String typeCarburant;
    @Column(name = "kilometrage", nullable=true)
    private double kilometrage;
    @Column(name = "nbrPlace", nullable=true)
    private Integer nbrPlace;
    @Column(name = "montantReservation", nullable=true)
    private double montantReservation;
    @Column(name = "couleur", nullable=true)
    private String couleur;
    @Column(name = "disponibilite", nullable=true)
    private String disponibilite;
    @Column(name = "description", nullable=true)
    private String description;
    @Column(name = "image", nullable=true)
    private String image;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "vehicule",orphanRemoval = false,
            fetch = FetchType.LAZY)
    //  @LazyCollection(value = LazyCollectionOption.FALSE)
    //foreign key, reference f many

    List<Reservation> reservations;


    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "vehicul",orphanRemoval = false,
            fetch = FetchType.LAZY)
    //  @LazyCollection(value = LazyCollectionOption.FALSE)
    //foreign key, reference f many

    List<Contrat> contrats;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "model_id")
    @JsonIgnore
    private Model model;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "categorie_id")
    @JsonIgnore
    private Categorie categorie;
}
