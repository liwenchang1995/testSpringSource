package com.liwenchang.test.jackson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: HIAPAD
 * @date: 2018/10/21 14:33
 * @description:
 */
public class JacksonUtil {
    public static <T> T parse(Class<T> clazz, InputStream is){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD,JsonAutoDetect.Visibility.ANY);
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        T result = null;
        try {
            result = objectMapper.readValue(is, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
