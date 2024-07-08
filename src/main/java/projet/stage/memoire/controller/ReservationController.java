package projet.stage.memoire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservationController {

    @GetMapping("/Creneau")
    public String afficherDomaines() {
        return "Creneau"; // Retourne le nom du template Thymeleaf sans extension
    }


}
