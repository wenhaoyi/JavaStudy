package com.StringBufferTest;

public class StringBufferDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(1);
        sb.append(1.2);
        sb.append(true);
        System.out.println(sb);
        System.out.println("-------------------------");
        sb.append("hello").append(1).append(1.2).append(true);
        System.out.println(sb);
        System.out.println("-------------------------");
        sb.insert(5,22222);
        System.out.println(sb);
    }
}
