package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: HIAPAD
 * @date: 2018/12/5 22:50
 * @description:
 */
public class TestStaticFactory {
    /**
     *
     * 功能描述: 测试静态工厂实例化bean
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/12/5 22:43
     */
    public static Object testStaticFactory(){
        return new TestConstructor("1234",false);
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Object testStaticFactory = applicationContext.getBean("testStatic");
        System.out.println(testStaticFactory);
    }
}
