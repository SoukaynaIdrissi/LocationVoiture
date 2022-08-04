package ma.emsi.LocationVoiture.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Getter
@Setter
@EqualsAndHashCode(callSuper=false)
@DiscriminatorValue("c")
public class Client extends Utilisateur{


    @Column(name = "Tel",nullable = false)
    private String Tel;
    @Column(name = "adresse", nullable=true)
    private String adresse;
    @Column(name = "pays", nullable=true)
    private String pays;
    @Column(name = "ville", nullable=true)
    private String ville;
    @Column(name = "numPermis", nullable=true)
    private String numPermis;


    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "client",orphanRemoval = false,
            fetch = FetchType.LAZY)
    //  @LazyCollection(value = LazyCollectionOption.FALSE)
    //foreign key, reference f many

    List<Reservation> reservations;
}
