package webservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter

@Setter
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Rechargement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rechargement")
    private int id_rechargement;

    @Column(name = "valeur")
    private double valeur;

    @Column(name = "id_utilisateur")
    private int id_utilisateur;

    @Column(name = "statut")
    private int statut =0;

}
