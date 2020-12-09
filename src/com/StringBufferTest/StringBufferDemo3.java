package com.StringBufferTest;

public class StringBufferDemo3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello").append("world").append("java");
        System.out.println(sb);
        sb.delete(0,5);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.delete(0,sb.length());
        System.out.println("sb: "+sb);
    }
}
