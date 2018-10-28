package spring.model;

import java.io.Serializable;

/**
 * @author: HIAPAD
 * @date: 2018/10/20 21:13
 * @description:
 */
public class User implements Serializable {
    private String fdId;
    private String fdName;
    private String fdLoginName;
    private String fdPassword;

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

    public String getFdLoginName() {
        return fdLoginName;
    }

    public void setFdLoginName(String fdLoginName) {
        this.fdLoginName = fdLoginName;
    }

    public String getFdPassword() {
        return fdPassword;
    }

    public void setFdPassword(String fdPassword) {
        this.fdPassword = fdPassword;
    }
}
