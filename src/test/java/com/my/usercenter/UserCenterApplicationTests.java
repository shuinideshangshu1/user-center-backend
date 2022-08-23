package com.my.usercenter;
import java.util.Date;

import com.my.usercenter.model.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserCenterApplicationTests {

    @Test
    void test() {
        User user = new User();
        user.setId(0L);
        user.setUsername("asd");
        user.setUserAccount("asd");
        user.setGender("男");
        user.setPhone("");
        user.setEmail("");
        user.setUserStatus(0);
        user.setCreateTime(new Date());
        user.setUserRole(0);
        System.out.println(user.toString());
    }


}
