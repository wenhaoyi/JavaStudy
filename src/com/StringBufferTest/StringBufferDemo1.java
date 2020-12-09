package com.StringBufferTest;
//https://blog.csdn.net/qq_40817827/article/details/89313998?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-1.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-1.control
public class StringBufferDemo1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("sb: "+sb);
        System.out.println("sb.capacity(): "+sb.capacity());
        System.out.println("sb.length(): "+sb.length());
        System.out.println("---------------------------");
        StringBuffer sb2 = new StringBuffer(50);
        System.out.println("sb2: "+sb2);
        System.out.println("sb2.capacity(): "+sb2.capacity());
        System.out.println("sb2.length(): "+sb2.length());
        System.out.println("---------------------------");
        StringBuffer sb3 = new StringBuffer("hello");
        System.out.println("sb3: "+sb3);
        System.out.println("sb3.capacity(): "+sb3.capacity());
        System.out.println("sb3.length(): "+sb3.length());
    }
}
