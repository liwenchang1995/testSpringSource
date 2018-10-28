package com.liwenchang.test.reflection;

/**
 * @author: HIAPAD
 * @date: 2018/10/24 20:39
 * @description:
 */
public class User {

    private String fdId;
    private String fdName;

    private String getFdId() {
        return fdId;
    }

    private void setFdId(String fdId) {
        this.fdId = fdId;
    }

    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }

    public User(String fdId){
        this.fdId = fdId;
    }
}
