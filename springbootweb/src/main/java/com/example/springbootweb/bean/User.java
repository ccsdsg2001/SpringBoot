package com.example.springbootweb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cc
 * @date 2022年10月12日 19:33
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String userName;
    private String password;
}
