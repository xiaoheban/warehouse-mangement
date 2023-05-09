#### 条件查询

```java
//散装参数
List<Brand> selectByCondition(@Param("status") String status, @Param("companyName") String companyName);

//对象参数
List<Brand> selectByCondition(Brand brand);

//map参数
List<Brand> selectByCondition(Map map);
```

如果用户输入的条件不全的情况下怎么写sql,

动态条件查询

```xml
<select id="selectByCondition" resultMap="brandResultMap">
    select * from tb_brand
    where
    <if test="status != null">
        status = #{status}
    </if>
    <if test="companyName != null and companyName != ''">
        and company_name like #{companyName}
    </if>

</select>
```

```xml
<select id="selectByCondition" resultMap="brandResultMap">
    select * from tb_brand
    <!--where-->
    <where>
        <if test="status != null">
            and status = #{status}
        </if>
        <if test="companyName != null and companyName != ''">
            and company_name like #{companyName}
        </if>
    </where>
</select>
```

where标签



单条件动态条件查询

choose(when,otherwise)

```xml
<select id="selectByConditionSingle" resultMap="brandResultMap">
    select * from tb_brand
    where
    <choose>
        <when test="status != null">
            status = #{status}
        </when>
        <when test="companyName != null and companyName != ''">
            company_name like #{companyName}
        </when>
        <otherwise>
            1=1
        </otherwise>
    </choose>
</select>
```

```xml
<select id="selectByConditionSingle" resultMap="brandResultMap">
    select * from tb_brand
    <where>
        <choose>
            <when test="status != null">
                status = #{status}
            </when>
            <when test="companyName != null and companyName != ''">
                company_name like #{companyName}
            </when>
        </choose>
    </where>
</select>
```

#### 添加

```java
/**
 * 增加
 * @param brand
 */
void add(Brand brand);
```

```xml
<!--添加-->
<insert id="add">
    insert into tb_brand (brand_name, company_name, status, addr)
    values (#{brandName}, #{companyName}, #{status}, #{addr});
</insert>

```

```xml
<!--添加-->
<!--useGeneratedKeys="true" keyProperty="id" 返回新插入的id-->
<insert id="add" useGeneratedKeys="true" keyProperty="id">
    insert into tb_brand (brand_name, company_name, status, addr)
    values (#{brandName}, #{companyName}, #{status}, #{addr});
</insert>
```

```java
SqlSession sqlSession = sqlSessionFactory.openSession(true);
//业务
 Brand newBrand = new Brand();
            newBrand.setStatus("0");
            newBrand.setBrandName("超越全部");
            newBrand.setCompanyName("南京上上签有限公司");
            newBrand.setAddr("紫峰大厦20号");
            brandMapper.add(newBrand);
//sqlSession.commit();//开启事务以后 如果 sqlSessionFactory.openSession()/sqlSessionFactory.openSession(false)需要commit一下才能真正提交数据并且保存到数据块
```

#### 修改

修改全部字段

```xml
<!--更新-->
<update id="updateBrand">
    update tb_brand
    <set>
        <if test="brandName !=null and brandName!=''">
            brand_name = #{brandName},
        </if>
        <if test="companyName !=null and companyName!=''">
            company_name = #{companyName},
        </if>
        <if test="status !=null and status!=''">
            status = #{status},
        </if>
        <if test="addr !=null and addr!=''">
            addr = #{addr}
        </if>
    </set>
    where id = #{id};
</update>
```

修改单个字段

#### 删除

删除单个

```java
void deleteById(int id);
```

```xml
<delete id="deleteById">
    delete
    from tb_brand
    where id = #{id};
</delete>
```

批量删除

```java
/**
 * 批量删除
 * @param ids
 */
void deleteByIds(@Param("ids") int[] ids);
```

```xml
<!--批量删除-->
<delete id="deleteByIds">
    delete
    from tb_brand
    where id in
    <foreach collection="ids" item="id" open="(" close=")" separator=",">
        #{id}
    </foreach>
</delete>
```