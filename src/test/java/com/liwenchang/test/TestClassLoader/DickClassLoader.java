package com.liwenchang.test.TestClassLoader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author: HIAPAD
 * @date: 2018/10/24 23:29
 * @description: 自定义类加载器,加载指定路径下的class文件
 */
public class DickClassLoader extends ClassLoader{
    //指定加载路径
    private String path;
    public DickClassLoader(String path){
        this.path = path;
    }

    /**
     * Finds the class with the specified <a href="#name">binary name</a>.
     * This method should be overridden by class loader implementations that
     * follow the delegation model for loading classes, and will be invoked by
     * the {@link #loadClass <tt>loadClass</tt>} method after checking the
     * parent class loader for the requested class.  The default implementation
     * throws a <tt>ClassNotFoundException</tt>.
     *
     * @param name The <a href="#name">binary name</a> of the class
     * @return The resulting <tt>Class</tt> object
     * @throws ClassNotFoundException If the class could not be found
     * @since 1.2
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String fileName = getFileName(name);
        File file = new File(this.path, fileName);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int len = 0;
            while ((len = fileInputStream.read()) != -1){
                byteArrayOutputStream.write(len);
            }
            byte[] bytes = byteArrayOutputStream.toByteArray();
            return defineClass(name, bytes, 0, bytes.length);
        }catch (Exception e){

        }
        return super.findClass(name);
    }

    public String getFileName(String fileName){
        int index = fileName.lastIndexOf(".");
        if (index == -1){
            return fileName + ".class";
        }else{
            return fileName.substring(index+1) + ".class";
        }
    }
}
