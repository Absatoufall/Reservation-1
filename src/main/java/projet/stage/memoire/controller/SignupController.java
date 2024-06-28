package projet.stage.memoire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignupController {



        @GetMapping("/signup")
        public String showRegistrationForm() {
            return "signup"; // Retourne le nom de la vue Thymeleaf (register.html)
        }



//    @Autowired
//    private com.example.demo.service.UserService userService;
//
//    @GetMapping("/signup")
//    public String showRegistrationForm(Model model) {
//        model.addAttribute("user", new User());
//        return "signup";
//    }

//    @PostMapping("/signup")
//    public String registerUser(@ModelAttribute User user) {
//        userService.registerUser(user.getUsername(), user.getEmail(), user.getPassword(), "USER");
//        return "redirect:/login";
//    }
}
