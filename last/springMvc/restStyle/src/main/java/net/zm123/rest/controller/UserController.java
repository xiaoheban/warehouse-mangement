package net.zm123.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String save() {
        return "{'action':'save'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id) {
        return "{'action':'delete','id':" + id + "}";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update() {
        return "{'action':'update'}";
    }

}
