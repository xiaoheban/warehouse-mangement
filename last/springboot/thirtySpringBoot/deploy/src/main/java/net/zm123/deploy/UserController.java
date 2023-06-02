package net.zm123.deploy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/addUser")
    public String addUSer(){
        return "success";
    }
}
