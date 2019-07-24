package com.github.fish56.mybatisplusimpl.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ToString
@TableName("user") // 对应数据库的表名
public class User {
    @TableId // 声明主键
    private Long id;

    @TableField("name") // 对应的列名称
    private String name;
    private Integer age;
    private String email;

    @TableField(exist = false) // 不映射到数据库
    private String wow;
}
