package ma.emsi.LocationVoiture.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contrat")
public class Contrat {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContrat",nullable = false)
    private Integer idContrat;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dateDebutC", nullable=true)
    private LocalDate dateDebutC;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dateFinC", nullable=true)
    private LocalDate dateFinC;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "vehicul_id")
    @JsonIgnore
    private Vehicule vehicul;
}
