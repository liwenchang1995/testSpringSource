package com.liwenchang.test.jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * @author: HIAPAD
 * @date: 2018/10/21 13:17
 * @description:
 */
public class TestJackSon {

    public static void main(String[] args) throws Exception {
//        bean2json();
        json2bean();
//        list2json();
//        json2list();
//        listMap2json();
//        json2listMap();
//        complexBean2json();
//        json2complexBean();
    }
    
    /**
     *
     * 功能描述: 将javabean转成json字符串
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/10/21 13:33
     */
    public static void bean2json() throws IOException {
        ProductBean productBean = new ProductBean();
        productBean.setFdId(UUID.randomUUID().toString());
        productBean.setFdName("liwenchang");
        productBean.setFdPrice("100");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("data.txt"),productBean);
    }
    
    /**
     *
     * 功能描述: 将json字符串转成javabean
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/10/21 13:33
     */
    public static void json2bean() throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        ProductBean productBean = objectMapper.readValue(new File("data.txt"), ProductBean.class);
        System.out.println(productBean.toString());
    }
    
    /**
     *
     * 功能描述: 将集合转成json
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/10/21 13:40
     */
    public static void list2json() throws Exception{
        List<ProductBean> productBeans = buildProdutBeans();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("data1.txt"),productBeans);
    }

    /**
     *
     * 功能描述: 将json转成集合
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/10/21 13:40
     */
    public static void json2list() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        CollectionType type = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, ProductBean.class);
        List<ProductBean> productBeans = objectMapper.readValue(new File("data1.txt"), type);
        for (ProductBean productBean : productBeans){
            System.out.println(productBean.toString());
        }
    }
    
    /**
     *
     * 功能描述: 将元素为map的集合转为json
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/10/21 13:58
     */
    public static void listMap2json() throws Exception{
        List<Map<String,String>> list = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("fdId",UUID.randomUUID().toString());
        hashMap.put("fdName","liwenchang");
        list.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("fdId",UUID.randomUUID().toString());
        hashMap.put("fdName","map");
        list.add(hashMap);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("data2.txt"),list);
    }

    /**
     *
     * 功能描述: 将json转为元素为map的集合
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/10/21 13:58
     */
    public static void json2listMap() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayList<Map<String,String>> list = objectMapper.readValue(new File("data2.txt"), ArrayList.class);
        for(Map<String,String> map : list){
            System.out.println(map.toString());
        }
    }
    
    /**将复杂的javabean转成json字符串
     *
     * 功能描述: 
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/10/21 14:26
     */
    public static void complexBean2json() throws Exception{
        List<ProductBean> productBeans = buildProdutBeans();
        ResultBean resultBean = new ResultBean();
        resultBean.setData(productBeans);
        resultBean.setCode("1");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("data3.txt"),resultBean);
    }
    
    /**
     *
     * 功能描述: 将复杂json字符串转成javabean
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/10/21 14:45
     */
    public static void json2complexBean() throws Exception{
        ResultBean resultBean = JacksonUtil.parse(ResultBean.class, new FileInputStream(new File("data3.txt")));
        List<ProductBean> productBeans = resultBean.getData();
        for(ProductBean productBean : productBeans){
            System.out.println(productBean.toString());
        }
        System.out.println(resultBean.getCode());
    }

    /**
     *
     * 功能描述: 构建productbeans集合
     *
     * @param: []
     * @return: java.util.List<com.liwenchang.test.jackson.ProductBean>
     * @auther: HIAPAD
     * @date: 2018/10/21 14:24
     */
    public static List<ProductBean> buildProdutBeans() throws Exception{
        List<ProductBean> productBeans = new ArrayList<>();
        ProductBean productBean = new ProductBean();
        productBean.setFdId(UUID.randomUUID().toString());
        productBean.setFdPrice("111");
        productBean.setFdName("liwenchang");
        productBeans.add(productBean);
        productBean = new ProductBean();
        productBean.setFdId(UUID.randomUUID().toString());
        productBean.setFdName("productBean");
        productBean.setFdPrice("222");
        productBeans.add(productBean);
        return productBeans;
    }


}
