package net.zm123.testmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        return "{'code':'success','msg':'操作成功'}";
    }

    @RequestMapping("/testParams")
    @ResponseBody
    public String testParams(String name, int age) {
        return "name:" + name + " age " + age;
    }
}
