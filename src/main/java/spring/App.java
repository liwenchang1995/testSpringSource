package spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.annotation.IUserService;
import spring.service.imp.LoginService;

/**
 * @author: HIAPAD
 * @date: 2018/10/14 19:16
 * @description:
 */
public class App {
    
    /**
     *
     * 功能描述: 测试spring基于xml的配置
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/12/5 22:12
     */
    @Test
    public void testXml(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        LoginService login = (LoginService)applicationContext.getBean("loginService");
        login.add("111");
        login.isAppliedAdvisor();
    }

    /**
     *
     * 功能描述: 测试spring基于注解的配置
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/12/5 22:13
     */
    @Test
    public void testAnnotation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        userService.add();
    }

    /**
     *
     * 功能描述: 测试基于构造器注入
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/12/5 22:21
     */
    @Test
    public void testConstructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Object testConstructor = applicationContext.getBean("testConstructor");
        System.out.println(testConstructor);
    }

    /**
     *
     * 功能描述: 测试别名循环依赖
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/12/5 22:21
     */
    @Test
    public void testAlias(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
    }

    /**
     *
     * 功能描述: 测试实例工厂构造bean
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/12/5 22:21
     */
    @Test
    public void testInstanceFactory(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Object obj = applicationContext.getBean("testInstance");
        System.out.println(obj);
    }
    
    /**
     * @Method testCircleRef
     * @Author admin
     * @Version  1.0
     * @Description 测试循环引用
     * @param 
     * @Return void
     * @Exception 
     * @Date 2018-12-7 16:43
     */
    @Test
    public void testCircleRef(){
        String[] configLocations = new String[]{"classpath:spring.xml"};
        //将循环引用设置为false,getBean会报错
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocations,false);
        ((ClassPathXmlApplicationContext) applicationContext).setAllowCircularReferences(true);
        ((ClassPathXmlApplicationContext) applicationContext).refresh();
        Object obj = applicationContext.getBean("circleA");
        System.out.println(obj);
    }
}
