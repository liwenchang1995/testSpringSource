package com.liwenchang.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author admin
 * @date 2018-10-23 - 19:28
 */
public class TestMap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("liwenchnag");
        list.add("bbbbb");
        //第一个map
        HashMap<String, List> map = new HashMap<>();
        map.put("明细表id",list);
        //第二个map
        HashMap<String, List> map1 = new HashMap<>();
        map1.put("明细表id",list);

        //清空第二个map里面的集合
        map1.get("明细表id").clear();

        //打印第一个map里面的集合,集合[]
        System.out.println(map.get("明细表id"));

    }
}
