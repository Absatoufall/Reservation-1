package projet.stage.memoire.controller;//package projet.stage.memoire.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import projet.stage.memoire.service.InfrastructureService;
//
//@Controller
//public class ActionInfrastController {
//
//    @Autowired
//    private InfrastructureService infrastructureService;
//
//    @GetMapping("/ajouterInfrastructure")
//    public String showAddInfrastructureForm() {
//        return "ajouter_infrastructure"; // Nom de la vue du formulaire
//    }
//
//
//}


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import projet.stage.memoire.model.Infrastructure;
import projet.stage.memoire.service.InfrastructureService;

@Controller
public class ActionInfrastController {

    @Autowired
    private InfrastructureService infrastructureService;
    @GetMapping("/success")
    public String showLoginForm() {
        return "success"; // Assurez-vous que login.html existe dans src/main/resources/templates
    }

    @GetMapping("/ajouterInfrastructure")
    public String showAjouterInfrastructureForm(Model model) {
        model.addAttribute("infrastructure", new Infrastructure());
        return "ajouter_infrastructure"; // C'est le nom de votre fichier HTML/Thymeleaf
    }

    @PostMapping("/saveInfrastructure")
    public String saveInfrastructure(@ModelAttribute("infrastructure") Infrastructure infrastructure,
                                     Model model) {
        infrastructureService.saveInfrastructure(infrastructure);
        return "redirect:/success"; // Redirection vers une page de succès par exemple
    }
}
