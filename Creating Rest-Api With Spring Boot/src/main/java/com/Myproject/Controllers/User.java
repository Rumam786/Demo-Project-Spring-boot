package com.Myproject.Controllers;
import com.Myproject.UserService.userService;
import com.Myproject.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class User {

    @Autowired
    private userService userService;
//    private int userid;
//    private Users users;

    @PostMapping("/users")
    public Users adduser(@RequestBody Users users) {
        return userService.adduser(users);
    }

    @GetMapping("/users")
    public List<Users> getalluser() {
        return userService.getusers();
    }

    @GetMapping("/users/{uid}")
    public Users getauser(@PathVariable("uid") int userid) {
        return userService.getauser(userid);
    }

    @PutMapping("/users/{uid}")
    public Users updateuser(@PathVariable("uid") int userid,@RequestBody Users users) {
        return userService.updateuser(userid, users);
    }

    @DeleteMapping("/users/{uid}")
    public void deleteuser(@PathVariable("uid") int userid) {
        this.userService.deleteuser(userid);
    }
}
