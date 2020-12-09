package com.StringBufferTest;

public class StringBufferDemo4 {
    public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    sb.append("hello").append("world").append("java");
        System.out.println(sb);
        sb.replace(0,5,"lalala");
        System.out.println(sb);
    }
}
