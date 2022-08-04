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
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservation",nullable = false)
    private Integer idReservation;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dateDebut", nullable=true)
    private LocalDate dateDebut;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dateFin", nullable=true)
    private LocalDate dateFin;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "datePublication", nullable=true)
    private LocalDate datePublication;
    @Column(name = "message", nullable=true)
    private String message;
    @Column(name = "status", nullable=true)
    private String status;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "vehicule_id")
    @JsonIgnore
    private Vehicule vehicule;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "client_id_personne")
    @JsonIgnore
    private Client client;
}
