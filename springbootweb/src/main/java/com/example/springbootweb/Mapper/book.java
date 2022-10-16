package com.example.springbootweb.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;


public interface book {


    @Select("select * from t_book where id = #{id}")
    public book getbyid(Integer id);

    @Insert("insert into t_book(`name`) values();")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void insert(book book);
}
