package demo.controller;

import com.fasterxml.jackson.databind.util.BeanUtil;
import demo.Shared.dto.UserDto;
import demo.request.UserRequest;
import demo.respense.UserRespense;
import demo.services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser(){
        return ("get user was called");
    }

    @PostMapping
    public UserRespense createUser(@RequestBody UserRequest userRequest){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userRequest, userDto);
        UserDto createUser = userService.createUser(userDto);
        UserRespense userRespense = new UserRespense();
        BeanUtils.copyProperties(createUser, userRespense);
        return userRespense;
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
