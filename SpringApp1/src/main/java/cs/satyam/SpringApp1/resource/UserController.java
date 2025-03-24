package cs.satyam.SpringApp1.resource;

import cs.satyam.SpringApp1.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> users = new ArrayList();
        users.add(new User(1, "Satyam","satyam@gmail.com"));
        users.add(new User(2, "Pratham","pratham2712@gmail.com"));
        users.add(new User(3, "Vikash","thevikash2103@gmail.com"));
        users.add(new User(4, "Smith","smith@gmail.com"));
        return users;
    }
}
