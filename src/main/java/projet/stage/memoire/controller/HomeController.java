package projet.stage.memoire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Ajoutez ici des données à passer à la vue
        model.addAttribute("pageTitle", "Bienvenue sur la Plateforme de Réservation");
        return "home";
    }
}
