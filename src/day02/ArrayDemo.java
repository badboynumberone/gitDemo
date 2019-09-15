package day02;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/*
* 定义数组的两种方式
* 数组内所有内容格式必须一致
* */
public class ArrayDemo {
    public static void main(String[] args) {
        //动态定义数组的个数,初始值:[0,0,0,0,0,0,0,0,0,0]
        int[] intArr01 = new int[10];
        intArr01[3] = 4;
        System.out.println(Arrays.toString(intArr01));
        //填充每一个数的值
        Arrays.fill(intArr01,20);
        System.out.println(Arrays.toString(intArr01));
        //直接量定义一个数组
        int[] intArr02 = {6,7,8,9,1,2,3,4,5,};
        System.out.println(Arrays.toString(intArr02));
        //给一个数组重新排序
        Arrays.sort(intArr02);
        //查找该值得索引
        System.out.println(Arrays.binarySearch(intArr02,6));
        //查看该数组的内容
        System.out.println(Arrays.toString(intArr02));
        //判断两个数组是否一致
        System.out.println(Arrays.equals(intArr01,intArr02));
        //生成一个随机数的两周方式
        //默认是double类型
        System.out.println("随机数"+Math.random());
        System.out.println(new Random().nextDouble());
        //生成一个0-80的数
        System.out.println((int)(20+(new Random().nextDouble()*61)));
        Random rm = new Random();
        int num = rm.nextInt(600);
        System.out.println(num);
        System.out.println();
        Integer a =20;
        String str = "abcd";
        char[] strArr = str.toCharArray();
        System.out.println(Arrays.toString(strArr));
        String str01 = new String(strArr);
        System.out.println(str01);
        System.out.println(str.lastIndexOf(""));//默认字符串，
        System.out.println("lalal");
    }
}
