1.手动创建spring mvc项目

![image-20230426095348638](C:\Users\wanghui\AppData\Roaming\Typora\typora-user-images\image-20230426095348638.png)

pom配置

```xml

<dependencies>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>javax.servlet-api</artifactId>
        <version>4.0.1</version>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.1.2.RELEASE</version>
    </dependency>
</dependencies>
```

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.tomcat.maven</groupId>
            <artifactId>tomcat7-maven-plugin</artifactId>
            <version>2.1</version>
            <configuration>
                <port>8090</port>
                <path>/</path>
                <ignorePackaging>true</ignorePackaging>
            </configuration>
        </plugin>
    </plugins>
</build>
```

添加java目录

![image-20230426100613198](C:\Users\wanghui\AppData\Roaming\Typora\typora-user-images\image-20230426100613198.png)

```java
@Controller
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        return "user save";
    }
}
```

```java
@Configuration
@ComponentScan("net.zm123.testmvc.controller")
public class SpringMvcConfig {
}
```

```java
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //加载指定配置类
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};//拦截所有请求交给tomcat处理
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
```

```java
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        return "{'code':'success','msg':'操作成功'}";
    }
}
```

```java
@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        return "{'cdoe':'success'}";
    }
}
```

2.请求参数

普通参数

```java
@RequestMapping("/testParams")
@ResponseBody
public String testParams(String name, int age, @RequestParam("gender") String userGender) {
    //客户端传过来的是gender ，我们这里要处理成userGender
    System.out.println("名称" + name);
    System.out.println("性别" + userGender);
    return "name:" + name + " age " + age;
}
```

POJO对象

嵌套POJO类型参数

数组类型参数

集合类型参数

传递json数据

```xml
<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-databind</artifactId>
  <version>2.9.0</version>
</dependency>
```

```java
@EnableWebMvc //开启自动json转换
public class SpringMvcConfig {
}
```

![image-20230427151739501](C:\Users\wanghui\AppData\Roaming\Typora\typora-user-images\image-20230427151739501.png)

日期格式:

```java
@RequestMapping("/dateParams")
@ResponseBody
public String dateParams(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1) {
    System.out.println("日期传递参数 " + date.toString());
    System.out.println("日期传递参数 " + date1.toString());
    return "{'code':'ok'}";
}
```

返回json

```java
@RequestMapping("/responseJson")
@ResponseBody
public User responseJson() {
    User user = new User();
    user.setAge("22");
    user.setGender("男");
    user.setName("王辉");
    return user;
}
```

restful

![image-20230428114738593](C:\Users\wanghui\AppData\Roaming\Typora\typora-user-images\image-20230428114738593.png)

![image-20230428114838400](C:\Users\wanghui\AppData\Roaming\Typora\typora-user-images\image-20230428114838400.png)

![image-20230428115346267](C:\Users\wanghui\AppData\Roaming\Typora\typora-user-images\image-20230428115346267.png)

简化后

```java
@RestController//该类的每个方法都返回给客户端
@RequestMapping("/user1")
public class UserController1 {
    @PostMapping
    public String save(@RequestBody User user) {
        return "{'action':'save','result':" + user + "}";
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable Integer id) {
        return "{'action':'delete','id':" + id + "}";
    }

    @PutMapping
    public String update(@RequestBody User user) {
        return "{'action':'update','result':" + user + "}";
    }

    @GetMapping
    public String getAllUsers() {
        return "{'action':'update','result':" + "all users" + "}";
    }
}
```