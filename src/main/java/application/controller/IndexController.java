package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class IndexController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/mensagem")
    public String mensagem(@RequestParam int opcao, Model ui) {
        String texto = "";
        switch (opcao) {
            case 1:
                texto = "Bon jour";
                break;
            case 2:
                texto = "Buenas Tardies";
                break;
            default:
                texto = "Digite algo logo";
                break;
        }
        ui.addAttribute("texto", texto);
        return "mensagem";
    }
}


