package com.example.demo.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)   //重点
public class SpringboardsApplicationTests {

    @Autowired
    StringRedisTemplate stringRedisTemplate; //操作key-value都是字符串，最常用

    @Test
    public void test01() {
        stringRedisTemplate.opsForValue().append("msg", "coder_TEst");
    }
}
