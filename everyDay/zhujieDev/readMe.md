注解开发，后面将进入注解开发的阶段

yeah

配置文件

```java
@Configuration
@ComponentScan("net.zm123.test")
public class SpringConfig {
}
```

Beans

@Component/@Controller/@Service/@Repository

​                       控制层 服务层 业务层

```java
@Autowired //可以用Resource注解
private BookDao bookDao;//注入
```

后端框架：

一般包括 web service dao

web层主要由servlet来处理，负责页面请求和数据的收集以及响应结果给前端

service层主要负责业务逻辑的处理

dao层主要负责数据的增删改查操作