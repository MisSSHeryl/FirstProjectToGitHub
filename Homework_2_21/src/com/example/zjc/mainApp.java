package com.example.zjc;

/*
    1.列举出5种集合类：
    (1)ArrayList
    (2)LinkList
    (3)HashSet
    (4)TreeSet
    (5)HashMap
    (6)TreeMap

    2.map，set是什么？两者的区别是什么？
        map和set是Java中的集合，map中的数据以键值对的方式存储，map没有迭代器方法，但是可以使用
    entrySet方法把map中的键值对以entry实体的方式取出来然后再取出他的key和value，因为有key的概念
    所以map与set一样不允许有相同key值得数据存在。set有迭代器方法，他的遍历方式类似于list集合，
    set集合不允许存在相同数据。
 */
import java.util.Scanner;

public class mainApp {

    public static  void main(String [] args) {
        //3.尝试开发一个程序，获取2~32之间的6个偶数，不包含32，
        //                            并取得这6个偶数的和，将和  及这六个偶数（排序，升序）分别输出
//        homework3();
        //4.尝试开发一个程序，定义一个求圆面积的方法，其中以圆半径作为参数，并将计算结果保留3位小数
        homework4();
    }

    private static void homework3() {
        //声名用于存储6个偶数的array和1个sum
        int [] array = new int[7];
        //声名变量sum计算6个偶数的和
        int sum = 0;
        //取得六个偶数
        for (int i = 2, j = 0; i < 32; i++) {
            //判断array长度是否等于6，等于6不再添加
            if (j == 6) {
                break;
            }
            //判断i是否为偶数并做相应操作
            if (i % 2 == 0) {
                array [j] = i;
                j++;
                sum += i;
            }
        }
        //将sum存入array
        array [6] = sum;
        //对array排序(冒泡排序)
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array [j] < array [j + 1]) {
                    int temp = array [j];
                    array [j] = array [j + 1];
                    array [j + 1] = temp;
                }
            }
        }
        //遍历输出array
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void homework4() {
        //接收圆的面积
        System.out.println("请输入圆的半径:");
        double r = new Scanner(System.in).nextDouble();
        //打印圆的面积
        System.out.println(String.format("%.3f", getArea(r)));
    }

    //获得圆的面积
    private static double getArea(double r) {
        return Math.PI * r * r;
    }

    private static void test() {

    }

}
