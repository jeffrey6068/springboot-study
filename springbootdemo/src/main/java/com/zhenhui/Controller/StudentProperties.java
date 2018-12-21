package com.zhenhui.Controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Zhenhui
 * Date: 2018-09-26
 */
@Component
@ConfigurationProperties(prefix = "student")
/*@Component：表明当前类是一个 Java Bean
@ConfigurationProperties(prefix = "student")：表示获取前缀为 sutdent 的配置信息*/
public class StudentProperties {

    private String name;
    private  Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
