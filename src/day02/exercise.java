package day02;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise {
    public static void main(String[] args) {
        //流的方式去读取数据
        int a = 20;
        Arrays.asList("hello","boy","girl","heihei").stream().forEach(System.out::println);
        ArrayList<Integer> array = new ArrayList<>();
        int[] arr = {1,56,7812,3,24,59,852,2};
        System.out.println(Arrays.toString(arr));
        System.out.println("这是在some-feature上编辑的内容");
    }
}