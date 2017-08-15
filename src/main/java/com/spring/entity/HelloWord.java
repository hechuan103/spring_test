package com.spring.entity;

/**
 * Created by:  intelliJ IDEA
 *
 * @Author albert
 * @Description:
 * @Date:2017/7/21 下午2:15
 * @package:entity
 * @Modified By:
 */
public class HelloWord {
    private String name;
    private String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "HelloWord{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
