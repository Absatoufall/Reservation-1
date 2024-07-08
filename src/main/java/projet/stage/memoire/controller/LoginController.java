////package projet.stage.memoire.controller;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Controller;
////import org.springframework.ui.Model;
////import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.PostMapping;
////import org.springframework.web.bind.annotation.RequestParam;
////import projet.stage.memoire.service.UserService;
////
////@Controller
////public class LoginController {
////
////    @Autowired
////    private UserService userService;
////
////    @GetMapping("/login")
////    public String showLoginForm() {
////        return "login"; // Assurez-vous que login.html existe dans src/main/resources/templates
////    }
////
////    @PostMapping("/login")
////    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
////        if (userService.authenticate(username, password)) {
////            return "domaines"; // Redirection vers domaine.html si l'authentification réussit
////        } else {
////            model.addAttribute("error", "Identifiants incorrects. Veuillez réessayer."); // Message d'erreur si l'authentification échoue
////            return "login"; // Retourne à la page de connexion avec un message d'erreur
////        }
////    }
////
////
////}
////
//
//
//package projet.stage.memoire.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import projet.stage.memoire.model.User;
//import projet.stage.memoire.service.UserService;
//
//@Controller
//public class LoginController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/login")
//    public String showLoginForm() {
//        return "login"; // Assurez-vous que login.html existe dans src/main/resources/templates
//    }
//
//    @PostMapping("/login")
//    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
//        if (userService.authenticate(username, password)) {
//            User user = userService.findByUsername(username);
//            model.addAttribute("username", user.getUsername()); // Ajoute le nom d'utilisateur à l'attribut de modèle
//            return "domaines"; // Redirige vers domaines.html si l'authentification réussit
//        } else {
//            model.addAttribute("error", "Identifiants incorrects. Veuillez réessayer."); // Message d'erreur si l'authentification échoue
//            return "login"; // Retourne à la page de connexion avec un message d'erreur
//        }
//    }
//
//
//
//}
//


package projet.stage.memoire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import projet.stage.memoire.model.Admin;
import projet.stage.memoire.model.User;
import projet.stage.memoire.service.UserService;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Assurez-vous que login.html existe dans src/main/resources/templates
    }

    @GetMapping("/adminPage")
    public String showadminPage() {
        return "adminPage"; // Assurez-vous que login.html existe dans src/main/resources/templates
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        if (Admin.isAdmin(username, password)) {
            return "adminPage"; // Redirection vers la page d'administration si l'authentification admin réussit
        } else if (userService.authenticate(username, password)) {
            User user = userService.findByUsername(username);
            model.addAttribute("username", user.getUsername()); // Ajoute le nom d'utilisateur à l'attribut de modèle
            return "domaines"; // Redirige vers domaines.html si l'authentification réussit pour un utilisateur normal
        } else {
            model.addAttribute("error", "Identifiants incorrects. Veuillez réessayer."); // Message d'erreur si l'authentification échoue
            return "login"; // Retourne à la page de connexion avec un message d'erreur
        }
    }
}
