package it.best_of_the_year.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class bestOfTheYearController {
    @GetMapping("/")
    public String getMethodName(@RequestParam(name = "name", required=false) String name, Model model) {
        model.addAttribute("name", name);
        return "best-of-the-year";
    }
    
}
