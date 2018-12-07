package spring.test;

/**
 * @ClassName: CircleB
 * @Author: admin
 * @Description: 测试循环引用
 * @Date: 2018-12-7 15:45
 * @Version: 1.0
 */
public class CircleB {
    private CircleA circleA;

    public CircleA getCircleA() {
        return circleA;
    }

    public void setCircleA(CircleA circleA) {
        this.circleA = circleA;
    }
}
