package mybatis.entity;

/**
 * @author: HIAPAD
 * @date: 2018/11/8 23:44
 * @description:
 */
public class Person {
    private String fdId;
    private String fdName;
    private String fdPhoneNumber;

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

    public String getFdPhoneNumber() {
        return fdPhoneNumber;
    }

    public void setFdPhoneNumber(String fdPhoneNumber) {
        this.fdPhoneNumber = fdPhoneNumber;
    }
}
