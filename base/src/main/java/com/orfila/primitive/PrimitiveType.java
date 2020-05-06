package com.orfila.primitive;

/**
 * @Description primitive type
 * @Author tangye
 * @Time 2020-05-05 16:09
 */
public class PrimitiveType {

    private static void testMethod() {
        short a = 1;
        // a + 1 -> int
        a = (short) (a + 1);
        short b = 1;
        // 编译器转换处理
        b += 1;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        testMethod();
    }
}

