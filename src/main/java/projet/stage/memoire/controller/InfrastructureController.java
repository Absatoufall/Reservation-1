package projet.stage.memoire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfrastructureController {

    @GetMapping("/football")
    public String football(Model model) {
        return "football"; // Retourne le nom du template Thymeleaf sans extension
    }

    @GetMapping("/athletisme")
    public String afficherathletisme() {
        return "athletisme"; // Retourne le nom du template Thymeleaf sans extension
    }

    @GetMapping("/centreDeFormation")
    public String affichercentreDeFormation() {
        return "centreDeFormation"; // Retourne le nom du template Thymeleaf sans extension
    }
    @GetMapping("/multiUsage")
    public String affichermultiUsage() {
        return "multiUsage"; // Retourne le nom du template Thymeleaf sans extension
    }

    @GetMapping("/SportEnSalle")
    public String affichersportEnSalle() {
        return "SportEnSalle"; // Retourne le nom du template Thymeleaf sans extension
    }

    @GetMapping("/football1")
    public String afficherfootball1() {
        return "football1"; // Retourne le nom du template Thymeleaf sans extension
    }
    @GetMapping("/SportEnSalle1")
    public String afficherSportEnSalle1() {
        return "SportEnSalle1"; // Retourne le nom du template Thymeleaf sans extension
    }
 @GetMapping("/athletisme1")
    public String afficherathletisme1() {
        return "athletisme1"; // Retourne le nom du template Thymeleaf sans extension
    }
@GetMapping("/multiUsage1")
    public String affichermultiUsage1() {
        return "multiUsage1"; // Retourne le nom du template Thymeleaf sans extension
    }
    @GetMapping("/centreDeFormation1")
    public String affichercentreDeFormation1() {
        return "centreDeFormation1"; // Retourne le nom du template Thymeleaf sans extension
    }





}
