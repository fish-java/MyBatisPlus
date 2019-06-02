package com.github.fish56.mybatisplusimpl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.fish56.mybatisplusimpl.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper extends BaseMapper<User> {
    public List<User> selectByAge(Integer age);
}
