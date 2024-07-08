package projet.stage.memoire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutAdminController {


    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login"; // Assurez-vous que login.html existe dans src/main/resources/templates
    }
}
