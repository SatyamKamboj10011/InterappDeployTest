package cs.satyam.SpringApp1.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")

    public String sayHello(){
        return "Welcome to my REST API😎";
    }

    @GetMapping("/about")
    public String about(){
        return "This API is Developed by SATYAM KAMBOJ 👦";
    }

    @GetMapping("/")
    public String api(){
        return "Possible API localhost:8080/hello "  +
                "localhost:8080/about👦";
    }
}
