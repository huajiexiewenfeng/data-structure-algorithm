package com.huajie.chapter04;

/**
 * 测试 {@link ArrayStack} 示例
 */
public class ArrayStackDemo {

    public static void main(String[] args) {

        //演示栈溢出异常
        exception();

        //演示正常的入栈和出栈过程
        pushAndPop();

    }

    private static void pushAndPop() {
        ArrayStack arrayStack = new ArrayStack(5);
        for (int i = 0; i < 5; i++) {
            arrayStack.push("元素" + i);
            System.err.println(arrayStack.toString());
        }

        for (int i = 0; i < 5; i++) {
            String item = arrayStack.pop();
            System.err.println("弹出元素：" + item);
            System.err.println(arrayStack.toString());
        }
    }

    private static void exception() {
        ArrayStack arrayStack = new ArrayStack(5);
        for (int i = 0; i < 6; i++) {
            arrayStack.push("元素" + i);
            System.err.println(arrayStack.toString());
        }
    }
}
