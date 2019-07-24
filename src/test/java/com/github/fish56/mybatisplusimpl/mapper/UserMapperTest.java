package com.github.fish56.mybatisplusimpl.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.fish56.mybatisplusimpl.MybatisPlusImplApplicationTests;
import com.github.fish56.mybatisplusimpl.domain.User;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
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
     * 查询一组id的用户
     */
    @Test
    public void selectBatchIds(){
        List<Long> ids = Arrays.asList(1L,2L,3L);

        List<User> list = userMapper.selectBatchIds(ids);
        System.out.println(list);
    }

    /**
     * 条件查询
     */
    @Test
    public void selectByWrapper(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();

        // age字段 great than 19的记录
        userQueryWrapper.gt("age", 19);

        List<User> list = userMapper.selectList(userQueryWrapper);

        System.out.println(list);
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
}