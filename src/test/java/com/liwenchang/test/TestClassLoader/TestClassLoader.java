package com.liwenchang.test.TestClassLoader;

/**
 * @author: HIAPAD
 * @date: 2018/10/24 22:23
 * @description: 测试类加载器
 */
public class TestClassLoader {
    public static void main(String[] args) throws Exception{
        //BootstrapClass 加载的jar路径
        System.out.println(System.getProperty("sun.boot.class.path"));
        //Extention Class 加载的jar路径
        System.out.println(System.getProperty("java.ext.dirs"));
        //appClass  加载的jar
        System.out.println(System.getProperty("java.class.path"));
        //测试当前类的加载器
        System.out.println(TestClassLoader.class.getClassLoader());

        DickClassLoader dickClassLoader = new DickClassLoader("D:\\java");
        Class<?> clzz = dickClassLoader.loadClass("com.liwenchang.test.jackson.JacksonUtil");
        if (clzz != null){
            Object instance = clzz.newInstance();
            System.out.println(instance);
        }
    }
}
