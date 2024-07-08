package projet.stage.memoire.model;

import jakarta.persistence.*;

@Entity
public class Infrastructure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String localisation;
    private String description;

    @ManyToOne
    @JoinColumn(name = "domain_id")
    private Domain domain;

    // Constructeur sans arguments
    public Infrastructure() {
    }

    // Constructeur avec paramètres
    public Infrastructure(String nom, String localisation, String description) {
        this.nom = nom;
        this.localisation = localisation;
        this.description = description;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }
}
