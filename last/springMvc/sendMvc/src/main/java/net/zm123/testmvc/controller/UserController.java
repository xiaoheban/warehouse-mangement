package net.zm123.testmvc.controller;

import net.zm123.testmvc.entry.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

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
    public String testParams(String name, int age, @RequestParam("gender") String userGender) {
        System.out.println("名称" + name);
        System.out.println("性别" + userGender);
        return "name:" + name + " age " + age;
    }

    @RequestMapping("/pojoParams")
    @ResponseBody
    public String pojoParams(User user) {
        System.out.println("pojo传递参数 " + user);
        return "{'code':ok,'msg':" + user + "}";
    }

    @RequestMapping("/jsonParams")
    @ResponseBody
    public String jsonParams(@RequestBody User user) {
        System.out.println("json传递参数 " + user);
        return "{'code':ok,'msg':" + user + "}";
    }

    @RequestMapping("/jsonListParams")
    @ResponseBody
    public String jsonListParams(@RequestBody List<User> users) {
        System.out.println("json传递参数 " + users != null && users.size() > 0 ? users.get(0).getName() : "无数据");
        return "{'code':'ok'}";
    }

    @RequestMapping("/dateParams")
    @ResponseBody
    public String dateParams(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1) {
        System.out.println("日期传递参数 " + date.toString());
        System.out.println("日期传递参数 " + date1.toString());
        return "{'code':'ok'}";
    }

    @RequestMapping("/responseJson")
    @ResponseBody
    public User responseJson() {
        User user = new User();
        user.setAge("22");
        user.setGender("男");
        user.setName("王辉");
        return user;
    }

}
