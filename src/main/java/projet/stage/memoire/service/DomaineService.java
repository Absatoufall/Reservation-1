package projet.stage.memoire.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet.stage.memoire.model.Domain;
import projet.stage.memoire.model.Infrastructure;
import projet.stage.memoire.repository.DomainRepository;
import projet.stage.memoire.repository.InfrastructureRepository;

import java.util.Arrays;

@Service
public class DomaineService {

    private final DomainRepository domainRepository;
    private final InfrastructureRepository infrastructureRepository;

    @Autowired
    public DomaineService(DomainRepository domainRepository, InfrastructureRepository infrastructureRepository) {
        this.domainRepository = domainRepository;
        this.infrastructureRepository = infrastructureRepository;
    }

    @PostConstruct
    public void init() {
        // Football
        Domain football = new Domain("Football", Arrays.asList(
                new Infrastructure("Stade Léopold Sédar Senghor", "Dakar", "Principalement utilisé pour les matchs de football."),
                new Infrastructure("Stade Lat Dior", "Thiès", "Utilisé principalement pour le football et l'athlétisme."),
                new Infrastructure("Stade Aline Sitoé Diatta", "Ziguinchor", "Accueille des matchs de football."),
                new Infrastructure("Stade Caroline Faye", "Mbour", "Utilisé pour le football et d'autres événements sportifs locaux."),
                new Infrastructure("Complexe Sportif de Diambars", "Saly", "Académie de football avec des installations d'entraînement et de formation."),
                new Infrastructure("Stade Ngalandou Diouf", "Rufisque", "Utilisé pour les matchs de football locaux et régionaux.")
        ));

        football.getInfrastructures().forEach(infrastructure -> infrastructure.setDomain(football));

        // Sports en Salle
        Domain sportsEnSalle = new Domain("Sports en Salle", Arrays.asList(
                new Infrastructure("Dakar Arena", "Diamniadio", "Construit pour accueillir des compétitions de basketball, handball et autres sports en salle."),
                new Infrastructure("Palais des Sports Dakar", "Dakar", "Utilisé pour les compétitions de basketball, handball, volleyball et autres sports en salle.")
        ));

        sportsEnSalle.getInfrastructures().forEach(infrastructure -> infrastructure.setDomain(sportsEnSalle));

        // Athlétisme
        Domain athletisme = new Domain("Athlétisme", Arrays.asList(
                new Infrastructure("Stade Léopold Sédar Senghor", "Dakar", "Terrain de football en herbe et piste d'athlétisme."),
                new Infrastructure("Stade Lat Dior", "Thiès", "Utilisé pour le football et l'athlétisme.")
        ));

        athletisme.getInfrastructures().forEach(infrastructure -> infrastructure.setDomain(athletisme));

        // Multi-usage
        Domain multiUsage = new Domain("Multi-usage", Arrays.asList(
                new Infrastructure("Stade Léopold Sédar Senghor", "Dakar", "Utilisé pour le football, l'athlétisme et autres événements sportifs et culturels."),
                new Infrastructure("Stade Lat Dior", "Thiès", "Utilisé pour le football et l'athlétisme."),
                new Infrastructure("Stade Aline Sitoé Diatta", "Ziguinchor", "Utilisé pour des matchs de football et autres événements sportifs."),
                new Infrastructure("Stade Caroline Faye", "Mbour", "Utilisé pour le football et autres événements sportifs locaux.")
        ));

        multiUsage.getInfrastructures().forEach(infrastructure -> infrastructure.setDomain(multiUsage));

        // Centres de Formation
        Domain centresFormation = new Domain("Centres de Formation", Arrays.asList(
                new Infrastructure("Complexe Sportif de Diambars", "Saly", "Académie de football et complexe sportif pour la formation des jeunes footballeurs.")
        ));

        centresFormation.getInfrastructures().forEach(infrastructure -> infrastructure.setDomain(centresFormation));

        // Enregistrer les domaines et infrastructures dans la base de données
        domainRepository.saveAll(Arrays.asList(football, sportsEnSalle, athletisme, multiUsage, centresFormation));
    }

}
