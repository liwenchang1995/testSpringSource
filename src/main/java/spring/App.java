package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.annotation.IUserService;

/**
 * @author: HIAPAD
 * @date: 2018/10/14 19:16
 * @description:
 */
public class App {
    public static void main( String[] args ){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        LoginService login = (LoginService)applicationContext.getBean("loginService");
//        login.add("111");
//        login.isAppliedAdvisor();
        testAnnotation();
    }

    public static void testAnnotation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        userService.add();
    }
}
