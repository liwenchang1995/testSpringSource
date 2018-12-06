package spring.test;

/**
 * @author admin
 * @date 2018-12-6 - 19:29
 */
public class Student {
    private String fdId;
    private String fdName;


    public String getFdId() {
        return fdId;
    }

    public void setFdId(String fdId) {
        this.fdId = fdId;
    }

    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }

    public Student(String fdId, String fdName) {
        this.fdId = fdId;
        this.fdName = fdName;
    }
}
