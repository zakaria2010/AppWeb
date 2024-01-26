package demo.controller;

import demo.request.UserRequest;
import demo.respense.UserRespense;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUser(){
        return ("get user was called");
    }

    @PostMapping
    public UserRespense createUser(@RequestBody UserRequest userRequest){
        return null;
    }
    @PutMapping
    public String updateUser(){
        return ("update user was called");
    }
    @DeleteMapping
    public String deleteUser(){
        return ("delete user was called");
    }
}
