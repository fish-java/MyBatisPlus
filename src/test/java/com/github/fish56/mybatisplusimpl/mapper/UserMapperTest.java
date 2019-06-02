package com.github.fish56.mybatisplusimpl.mapper;

import com.github.fish56.mybatisplusimpl.MybatisPlusImplApplicationTests;
import com.github.fish56.mybatisplusimpl.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest extends MybatisPlusImplApplicationTests {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有用户
     */
    @Test
    public void selectList(){
        List<User> userList = userMapper.selectList(null);
        assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    /**
     * 保存用户
     */
    @Test
    public void save(){
        User user = new User().setName("Jon").setAge(23);
        userMapper.insert(user);
        assertNotNull(user.getId());
        System.out.println(user.getId());
    }

    /**
     *
     */
    @Test
    public void adult(){
        List<User> users = userMapper.selectByAge(20);
        users.forEach(System.out::println);
    }
}