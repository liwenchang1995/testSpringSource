package spring.test;

/**
 * @author admin
 * @date 2018-12-6 - 19:07
 */
public class TestInstanceFactory {

    /**
     * 测试实例工厂化
     * @return
     */
    public Object getInstance(){
        return new Student("222","instaceFactory");
    }

}
