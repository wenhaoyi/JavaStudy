package com.StringBufferTest;

public class StringBufferDemo6 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello").append("world").append("java");
        System.out.println(sb);
        String s = sb.substring(5);
        System.out.println(s);
        String ss = sb.substring(5,10);
        System.out.println(ss);
    }
}
