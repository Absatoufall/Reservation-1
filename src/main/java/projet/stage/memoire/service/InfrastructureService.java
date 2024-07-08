package projet.stage.memoire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet.stage.memoire.model.Infrastructure;
import projet.stage.memoire.repository.InfrastructureRepository;

import java.util.Optional;

@Service
public class InfrastructureService {

    @Autowired
    private InfrastructureRepository infrastructureRepository;

    public Infrastructure saveInfrastructure(Infrastructure infrastructure) {
        return infrastructureRepository.save(infrastructure);
    }

    public Optional<Infrastructure> findById(Long id) {
        return infrastructureRepository.findById(id);
    }

    // Autres méthodes de service si nécessaire
}
