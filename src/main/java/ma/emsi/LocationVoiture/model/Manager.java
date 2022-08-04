package ma.emsi.LocationVoiture.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@NoArgsConstructor
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@DiscriminatorValue("m")
public class Manager extends Utilisateur {

    @Column(name = "salaire", nullable = true)
    private double salaire;
}
