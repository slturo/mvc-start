package pl.turo.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Simple spring mvc controller
 * User: turo
 * Date: 07.08.12
 * Time: 22:38
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public void sayHello(Model model) {
        String name = "Sławek";
        model.addAttribute("imie", name);
    }
}
