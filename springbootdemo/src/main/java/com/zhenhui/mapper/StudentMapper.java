package com.zhenhui.mapper;

import com.zhenhui.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Zhenhui
 * Date: 2018-09-26
 */
@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM student")
    List<Student> findAll();

}
