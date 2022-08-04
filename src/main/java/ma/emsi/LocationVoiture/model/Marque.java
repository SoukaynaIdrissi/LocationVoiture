package ma.emsi.LocationVoiture.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "marque")
public class Marque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMarque",nullable = false)
    private Integer idMarque;
    @Column(name = "libelleM", nullable=true)
    private String libelleM;

}
