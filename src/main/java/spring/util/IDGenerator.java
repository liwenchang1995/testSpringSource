package spring.util;

import java.util.UUID;

/**
 * @author: HIAPAD
 * @date: 2018/10/20 23:28
 * @description:
 */
public class IDGenerator {
    public static String generate(){
        return UUID.randomUUID().toString();
    }
}
