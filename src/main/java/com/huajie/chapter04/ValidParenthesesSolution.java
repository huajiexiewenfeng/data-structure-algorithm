package com.huajie.chapter04;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ValidParenthesesSolution {

    private static Map<Character, Character> map = new HashMap();

    static {
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
    }

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                stack.push(c);//压栈
            } else if (stack.empty() || c != map.get(stack.pop())) {
                return false;
            }
        }
        return stack.empty();
    }

}
