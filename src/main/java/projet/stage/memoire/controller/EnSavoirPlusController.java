package projet.stage.memoire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class EnSavoirPlusController {

    @GetMapping("/ensavoirplus")
    public String football(Model model) {
        return "ensavoirplusLeopold"; // Retourne le nom du template Thymeleaf sans extension
    }
}

