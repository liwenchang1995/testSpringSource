package spring.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.util.Assert;

/**
 * @author: HIAPAD
 * @date: 2018/12/5 22:27
 * @description:
 */
public class TestSomeMethod {
    @Test
    public void testTransformedBeanName(){
        String name = "&&&baseService";
        Assert.notNull(name, "'name' must not be null");
        String beanName = name;
        while (beanName.startsWith(BeanFactory.FACTORY_BEAN_PREFIX)) {
            beanName = beanName.substring(BeanFactory.FACTORY_BEAN_PREFIX.length());
        }
        System.out.println(beanName);
    }
}
