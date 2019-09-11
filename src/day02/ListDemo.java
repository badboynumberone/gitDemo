package day02;

import java.util.Arrays;
import java.util.LinkedList;

/*
* 集合
*
* ArrayList
优点: 底层数据结构是数组，查询快，增删慢。
缺点: 线程不安全，效率高

LinkedList
优点: 底层数据结构是链表，查询慢，增删快。
缺点: 线程不安全，效率高
* */
public class ListDemo {
    public static void main(String[] args) {
       int[] intarr = {1,2,3,6,5,49,8};
        System.out.println();
        System.out.println(Arrays.toString(intarr));
        System.out.println("尼玛的傻逼玩意别瞎比比了");
    }

}
