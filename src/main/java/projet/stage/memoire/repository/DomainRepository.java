package projet.stage.memoire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projet.stage.memoire.model.Domain;

@Repository
public interface DomainRepository extends JpaRepository<Domain, Long> {
}
