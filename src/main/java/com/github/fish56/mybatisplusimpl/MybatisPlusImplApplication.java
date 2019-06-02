package com.github.fish56.mybatisplusimpl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.fish56.mybatisplusimpl.mapper")
public class MybatisPlusImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusImplApplication.class, args);
    }

}
