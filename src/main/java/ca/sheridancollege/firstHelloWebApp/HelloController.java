package ca.sheridancollege.firstHelloWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/index")
    public String showRiteshyadavPage(Model model) {
        return "index";
    }

}

