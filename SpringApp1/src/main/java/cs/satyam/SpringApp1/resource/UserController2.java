package cs.satyam.SpringApp1.resource;

import cs.satyam.SpringApp1.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users2")
public class UserController2 {

    private List<User> users;

    public UserController2(){

        users = new ArrayList<>();
        users.add(new User(1, "John Doe" , "john@gmail.com"));
        users.add(new User(2, "Michael Jordan" , "jordan11@gmail.com"));
    }

    @GetMapping
    public  List<User> getUsers(){
        return users;
    }

    @PostMapping
    public String addUser(@RequestBody User user){
        users.add(user);
        return "Users Added";
    }

    @DeleteMapping("/{id}")
    public String deleteUser (@PathVariable int id){
        for(User u:users){
            if(u.getId() == id){
                users.remove(u);
                return "User Deleted Successfully";
            }
        }
        return "Unable to Delete User";
    }

    @PutMapping
    public String updateUser(@RequestBody User user){
        int id = user.getId();
        for(User u:users){
            if(u.getId() ==id){
                u.setName(user.getName());
                u.setEmail(user.getEmail());
                return "User updated successfully";
            }
        }
        return "User not found";

    }
}
