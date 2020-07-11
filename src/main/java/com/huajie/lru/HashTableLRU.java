package com.huajie.lru;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * 使用哈希表实现 LRU 算法
 * 实现 get 和 put 方法
 * {@link LinkedHashMap} 实现
 *
 * @author ：xwf
 * @date ：Created in 2020\7\11 0011 22:28
 */
public class HashTableLRU {

    private int maxSize;
    static Map<Integer, Integer> linkedHashMap;

    public HashTableLRU(int size) {
        this.maxSize = size;
        linkedHashMap = new LinkedHashMap();
    }

    public static void main(String[] args) {
        HashTableLRU hashTableLRU = new HashTableLRU(5);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int key = random.nextInt(10);
            Integer value = random.nextInt(10);
            System.out.println("插入值:[" + key + ":" + value + "]");
            hashTableLRU.put(key, value);
            System.out.println("链表：" + linkedHashMap.toString());
        }
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(10);
            System.out.println("获取值>" + value + ":" + hashTableLRU.get(value));
            System.out.println("链表：" + linkedHashMap.toString());
        }
    }

    Integer get(Integer key) {
        if (linkedHashMap.containsKey(key)) {
            Integer value = linkedHashMap.remove(key);
            linkedHashMap.put(key, value);
            return value;
        }
        return -1;
    }

    void put(Integer key, Integer value) {
        if (linkedHashMap.containsKey(key)) {
            linkedHashMap.remove(key);
        }
        linkedHashMap.put(key, value);
        if (linkedHashMap.size() > maxSize) {
            linkedHashMap.remove(linkedHashMap.entrySet().iterator().next().getKey());
        }
    }


}
