package com.liwenchang.test.jackson;

import java.util.List;

/**
 * @author: HIAPAD
 * @date: 2018/10/21 14:20
 * @description:
 */
public class ResultBean {

    private String code;

    private List<ProductBean> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<ProductBean> getData() {
        return data;
    }

    public void setData(List<ProductBean> data) {
        this.data = data;
    }


}
