package id.sf.furnari.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class home {

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    
    @GetMapping("/bustepaga")
    public String bustePaga() {
        return "bustep";
    }

    @GetMapping("/amministrazione")
    public String amministrazione() {
        return "amministrazione";
    }
    
    @GetMapping("/consulenza")
    public String consulenza() {
        return "consulenza";
    }
}
