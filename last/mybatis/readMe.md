#### 条件查询

```java
//散装参数
List<Brand> selectByCondition(@Param("status") String status, @Param("companyName") String companyName);

//对象参数
List<Brand> selectByCondition(Brand brand);

//map参数
List<Brand> selectByCondition(Map map);
```