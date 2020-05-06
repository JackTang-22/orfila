package com.orfila.string;

/**
 * @Description string
 * @Author tangye
 * @Time 2020-05-06 22:26
 */
public class StringType {

    public static void testString() {
        // "s"在常量池中不存在，在常量池初始化变量
        String s1 = "s";
        // "s" 在常量池中存在，直接指向这个变量
        String s2 = "s";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        // new 分配地址空间, value指向常量池中的"s"
        String s3 = new String("s");
        // new 分配地址空间, value指向常量池中的"s"
        String s4 = new String("s");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }

    public static void testString1() {
        String s1 = "abc";

        StringBuffer s2 = new StringBuffer(s1);

        //false  equals会判断类型是否一致，String和StringBuffer类型不一致
        System.out.println(s1.equals(s2));

        StringBuffer s3 = new StringBuffer("abc");

        //false  StringBuffer没有重写Object的equals方法，相当于使用=判断
        System.out.println(s3.equals("abc"));

        //true  String重写了Object的equals方法，是值比较
        System.out.println(s3.toString().equals("abc"));
    }
}
