package ma.emsi.LocationVoiture.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@Entity
@Data
@Getter
@Setter
@DiscriminatorValue("a")
public class Admin extends Utilisateur {

    @Column(name = "etat", nullable=true)
    private String etat;
}
