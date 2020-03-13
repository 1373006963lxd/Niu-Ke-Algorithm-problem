package com.lxd.niukework.CurrentHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @auther li xiao dong
 * @date 2020/3/3 0003 下午 21:28
 */
public class TestCurrentHashMap {
    public static void main(String[] args) {
        Map map  = new ConcurrentHashMap();
        Map map1 = new HashMap();
        map1.put(1, 2);
        /**
         * 构造函数：
         *         1.无参构造
         *         2.有参构造（初始化容量）
         *         3.1 hashmap的put方法
         *         3.1.1 put的值需要传入hash值（16位），key，value
         *         final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
         *                    boolean evict) {
         *         Node<K,V>[] tab; Node<K,V> p; int n, i;
         *         if ((tab = table) == null || (n = tab.length) == 0)
         *             n = (tab = resize()).length;
         *         3.1.2 计算值所在tab数组索引位置（与运算）
         *         如果当前tab数组索引处为null，则直接将新值放在Node数组索引处
         *         if ((p = tab[i = (n - 1) & hash]) == null)，
         *             tab[i] = newNode(hash, key, value, null);
         *         3.1.3 如果当前node数组处有元素，就需要判断新值的hash值与key值是否与
         *         当前node【i】索引出的值相等，如果相等则直接覆盖，否则遍历node节点，
         *         找到相等的就覆盖，否则遍历到最后直接放在链表的尾部，如果链表长度大于阈值，则转化为
         *         红黑树，将新值放进去。
         *         else {
         *             Node<K,V> e; K k;
         *             if (p.hash == hash &&
         *                 ((k = p.key) == key || (key != null && key.equals(k))))
         *                 e = p;
         *             else if (p instanceof TreeNode)
         *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
         *             else {
         *                 for (int binCount = 0; ; ++binCount) {
         *                     if ((e = p.next) == null) {
         *                         p.next = newNode(hash, key, value, null);
         *                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
         *                             treeifyBin(tab, hash);
         *                         break;
         *                     }
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k))))
         *                         break;
         *                     p = e;
         *                 }
         *             }
         *             if (e != null) { // existing mapping for key
         *                 V oldValue = e.value;
         *                 if (!onlyIfAbsent || oldValue == null)
         *                     e.value = value;
         *                 afterNodeAccess(e);
         *                 return oldValue;
         *             }
         *         }
         *         ++modCount;
         *         if (++size > threshold)
         *             resize();
         *         afterNodeInsertion(evict);
         *         return null;
         *     }
         *
         */

    }
}
