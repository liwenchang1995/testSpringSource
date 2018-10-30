package spring.annotation;

import org.springframework.stereotype.Service;

/**
 * @author: HIAPAD
 * @date: 2018/10/29 23:04
 * @description:
 */
@Service
public class UserService implements IUserService {
    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }
}
