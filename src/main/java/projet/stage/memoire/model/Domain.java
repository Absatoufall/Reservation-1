package projet.stage.memoire.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "domain")
    private List<Infrastructure> infrastructures;

    // Constructeurs, getters et setters
    public Domain() {
    }

    public Domain(String name, List<Infrastructure> infrastructures) {
        this.name = name;
        this.infrastructures = infrastructures;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Infrastructure> getInfrastructures() {
        return infrastructures;
    }

    public void setInfrastructures(List<Infrastructure> infrastructures) {
        this.infrastructures = infrastructures;
    }
}
