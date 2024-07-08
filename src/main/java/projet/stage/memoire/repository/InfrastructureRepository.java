package projet.stage.memoire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projet.stage.memoire.model.Infrastructure;

@Repository
public interface InfrastructureRepository extends JpaRepository<Infrastructure, Long> {
    // Vous pouvez ajouter des méthodes spécifiques si besoin
}
