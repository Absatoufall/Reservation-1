package projet.stage.memoire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DomainController {

    @GetMapping("/domaines-public")
    public String afficherDomaines() {
        return "domaines-public"; // Retourne le nom du template Thymeleaf sans extension
    }



//    @GetMapping("/domaines")
//    public String afficherDomaines1() {
//        return "domaines"; // Retourne le nom du template Thymeleaf sans extension
//    }

}

