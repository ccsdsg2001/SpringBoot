package com.example.springbootweb.Mapper;

import com.example.springbootweb.bean.Account;
import org.apache.ibatis.annotations.Mapper;



public interface accMapper {
    public Account getuser(Integer id);
}
