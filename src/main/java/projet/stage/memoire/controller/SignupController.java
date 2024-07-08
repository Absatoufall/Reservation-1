package projet.stage.memoire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import projet.stage.memoire.model.User;
import projet.stage.memoire.service.UserService;

@Controller
public class SignupController {
    private final UserService userService;

    @Autowired
    public SignupController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup"; // Nom de votre template Thymeleaf pour le formulaire d'inscription
    }

    @PostMapping("/signup")
    public String signupSubmit(@ModelAttribute User user) {
        userService.saveUser(user);
        return "redirect:/login"; // Redirige vers la page de connexion
    }


}
