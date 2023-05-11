

手动创建springboot项目

1.pom文件配置

```xml
<!-- 父工程 -->
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.7.11</version>
</parent>
<!-- 起步依赖 -->
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

2.入口文件

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }
}
```

3.控制器，和spring写法一样

```java
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
```

使用idea创建

![image-20230510135949806](C:\Users\wanghui\AppData\Roaming\Typora\typora-user-images\image-20230510135949806.png)

![image-20230510140016735](C:\Users\wanghui\AppData\Roaming\Typora\typora-user-images\image-20230510140016735.png)

springboot 3.0xx需要java 17,这里用2.x测试



#### 配置文件

properties yml yaml （优先级从高到底）

```properties
server.port=8090
```

```yaml
server:
  port: 8083
```

![lADPJxRxWflVOA7NBDjNCWA_2400_1080](C:\Users\wanghui\AppData\Roaming\DingTalk\137570643_v2\ImageFiles\fb\lADPJxRxWflVOA7NBDjNCWA_2400_1080.jpg)

![208f54b4171f79fe51dc24f1f847141e](C:\Users\wanghui\AppData\Roaming\DingTalk\137570643_v2\resource_cache\20\208f54b4171f79fe51dc24f1f847141e.jpg)

```yaml
name: 老师
  #自定义对象
person:
  name: 张三
  age: 20
person1: { name: 张三,age：20 }

#对象的行内写法


#数组
address:
  - 背景
  - 上海
#数组的行内写法
address1: [ 南京,海南 ]
# 纯量 可以理解为常量
#单双引号
msg1: 'hello\nworld' #忽略\n 原样输出

msg2: "hello\nworld" #换行
```

@Value方式

```java
@Value("${name}")
private String name;
@Value("${person.name}")
private String personName;

@Value("${address[0]}")
private String address;

@Value("${person.age}")
private int age;
```

Environment 对象

```java

@Autowired
private Environment env;
```