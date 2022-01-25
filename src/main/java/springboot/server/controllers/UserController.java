package springboot.server.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.server.entities.User;
import springboot.server.services.UserService;

import java.util.List;

@CrossOrigin(origins ="http://localhost:4200/")
@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllusers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id){
        return  userService.getUser(id);
    }

    @PostMapping("/add")
    public User addUser(@RequestBody  User user){
        return  userService.saveUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return  userService.saveUser(user);
    }

    @DeleteMapping("/del/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

}
