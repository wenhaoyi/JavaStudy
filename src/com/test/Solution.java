package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<Character,Character>() {};
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        map.put(')',' ');
        map.put(']',' ');
        map.put('}',' ');
        char [] charS = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        stack.push(charS[0]);
        for (int i = 1; i < charS.length; i++) {
            if(!stack.empty()){
              //  System.out.println("a: "+stack.peek());
             //   System.out.println("b: "+map.get(stack.peek()));
            }

            if( !stack.empty() && map.get(stack.peek()) == charS[i]){
                stack.pop();
            }else if(charS[i]==')'|charS[i]==']'|charS[i]=='}'){
                return false;
            }else{
                stack.push(charS[i]);
            }
            //System.out.println("total: "+stack);
        }
        if (stack.empty()) {
            return true;
        }else{
            return false;
        }
    }
}
