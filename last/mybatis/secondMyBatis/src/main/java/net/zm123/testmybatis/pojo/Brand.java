package net.zm123.testmybatis.pojo;

import org.apache.ibatis.type.Alias;

/**
 * 实体类
 */
@Alias("brand")//不加这个mybatisx会报错
public class Brand {
    private int id;
    private String brandName;
    private String companyName;
    private String addr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
