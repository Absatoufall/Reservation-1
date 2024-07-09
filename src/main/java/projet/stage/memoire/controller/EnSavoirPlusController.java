package projet.stage.memoire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class EnSavoirPlusController {

    @GetMapping("/ensavoirplus")
    public String ensavoirplusLeopold(Model model) {
        return "ensavoirplusLeopold"; // Retourne le nom du template Thymeleaf sans extension
    }

    @GetMapping("/ensavoirplus1")
    public String ensavoirplusLatdior(Model model) {
        return "ensavoirplusLatdior"; // Retourne le nom du template Thymeleaf sans extension
    }

    @GetMapping("/ensavoirplus2")
    public String ensavoirplusAlineSitoe(Model model) {
        return "ensavoirplusAlineSitoe"; // Retourne le nom du template Thymeleaf sans extension
    }
    @GetMapping("/ensavoirplus3")
    public String ensavoirplusCaroline(Model model) {
        return "ensavoirplusCaroline"; // Retourne le nom du template Thymeleaf sans extension
    }
    @GetMapping("/ensavoirplus4")
    public String ensavoirplusNgalanda(Model model) {
        return "ensavoirplusNgalanda"; // Retourne le nom du template Thymeleaf sans extension
    }
    @GetMapping("/ensavoirplus5")
    public String ensavoirplusDiambars(Model model) {
        return "ensavoirplusDiambars"; // Retourne le nom du template Thymeleaf sans extension
    }
    @GetMapping("/ensavoirplus6")
    public String ensavoirplusDakarArena(Model model) {
        return "ensavoirplusDakarArena"; // Retourne le nom du template Thymeleaf sans extension
    }

    @GetMapping("/ensavoirplus7")
    public String ensavoirplusAbdoulaye(Model model) {
        return "ensavoirplusAbdoulaye"; // Retourne le nom du template Thymeleaf sans extension
    }



}

