package com.liwenchang.test.reflection;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @author: HIAPAD
 * @date: 2018/10/24 20:41
 * @description:
 */
public class TestPropertyDescriptor {
    public static void main(String[] args) throws Exception{
        User user = new User("1234567890");
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("fdId", user.getClass());
        Method readMethod = propertyDescriptor.getReadMethod();
        Object fdId = readMethod.invoke(user);
        System.out.println(fdId);
    }
}
