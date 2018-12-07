package spring.test;

/**
 * @author: HIAPAD
 * @date: 2018/12/5 22:15
 * @description: 测试基于构造器注入
 */
public class TestConstructor {

    private String fdId;

    private boolean isActive;

    public String getFdId() {
        return fdId;
    }

    public void setFdId(String fdId) {
        this.fdId = fdId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "TestConstructor{" +
                "fdId='" + fdId + '\'' +
                ", isActive=" + isActive +
                '}';
    }


    public TestConstructor(String fdId, boolean isActive) {
        this.fdId = fdId;
        this.isActive = isActive;
    }
}
