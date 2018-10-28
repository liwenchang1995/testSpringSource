package com.liwenchang.test.jackson;

import java.io.Serializable;

/**
 * @author: HIAPAD
 * @date: 2018/10/21 13:24
 * @description:
 */
public class ProductBean implements Serializable {

    private String fdId;
    private String fdName;
    private String fdPrice;

    @Override
    public String toString() {
        return "ProductBean{" +
                "fdId='" + fdId + '\'' +
                ", fdName='" + fdName + '\'' +
                ", fdPrice='" + fdPrice + '\'' +
                '}';
    }

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

    public String getFdPrice() {
        return fdPrice;
    }

    public void setFdPrice(String fdPrice) {
        this.fdPrice = fdPrice;
    }
}
