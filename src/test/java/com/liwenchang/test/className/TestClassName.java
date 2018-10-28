package com.liwenchang.test.className;

/**
 * @author: HIAPAD
 * @date: 2018/10/23 21:50
 * @description:
 */
public class TestClassName {
    public static void main(String[] args) {
        testArrayClassName();
        testPrimitiveClassName();
        System.out.println(TestClassName.class.getPackage());
        TestClassName testClassName = new TestClassName();
        InnerClass innerClass = testClassName.new InnerClass();
        System.out.println(innerClass.getClass().getName());
    }
    
    /**
     *
     * 功能描述: 测试非基本类型数组的类名
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/10/23 21:52
     */
    public static void testArrayClassName(){
        String[] strArr = new String[2];
        strArr[0] = "liwenchang";
        strArr[1] = "hhhhh";
        System.out.println(strArr.getClass().getName());
    }
    
    /**
     *
     * 功能描述: 测试基本类型数组的类名
     *
     * @param: []
     * @return: void
     * @auther: HIAPAD
     * @date: 2018/10/23 21:55
     */
    public static void testPrimitiveClassName(){
        int[] intArr = new int[2];
        intArr[0] = 1;
        intArr[1] = 2;
        System.out.println(intArr.getClass().getName());
    }
    
    /**
     *
     * 功能描述: 测试内部类类名
     *
     * @param:
     * @return: 
     * @auther: HIAPAD
     * @date: 2018/10/23 21:59
     */
    protected class InnerClass{
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
    }
}
