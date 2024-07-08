package projet.stage.memoire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfrastructureAdminController {


    @GetMapping("/footAdmin")
    public String football(Model model) {
        return "footAdmin"; // Retourne le nom du template Thymeleaf sans extension
    }

@GetMapping("/athletAdmin")
    public String athletAdmin(Model model) {
        return "athletAdmin"; // Retourne le nom du template Thymeleaf sans extension
    }
@GetMapping("/centreFormationAdmin")
    public String centreFormationAdmin(Model model) {
        return "centreFormationAdmin"; // Retourne le nom du template Thymeleaf sans extension
    }

    @GetMapping("/multiUsageAdmin")
    public String multiUsageAdmin(Model model) {
        return "multiUsageAdmin"; // Retourne le nom du template Thymeleaf sans extension
    }

    @GetMapping("/sportEnSalleAdmin")
    public String sportEnSalleAdmin(Model model) {
        return "sportEnSalleAdmin"; // Retourne le nom du template Thymeleaf sans extension
    }

}
