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