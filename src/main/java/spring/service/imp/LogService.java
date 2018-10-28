package spring.service.imp;

import spring.service.ILogService;

/**
 * @author: HIAPAD
 * @date: 2018/10/14 19:20
 * @description:
 */
public class LogService implements ILogService {
    @Override
    public void beforeMethod() {
        System.out.println("before method");

    }

    @Override
    public void afterMethod() {
        System.out.println("after method");
    }
}
