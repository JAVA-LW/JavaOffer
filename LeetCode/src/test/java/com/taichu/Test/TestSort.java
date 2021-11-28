package com.taichu.Test;

import Sort.n2.InsertSort;
import Sort.n2.SelectSort;
import Sort.n2.bubbleSort;

import java.util.Arrays;

/**
 * @author
 * @site
 * @company
 * @create 2021-11-17 9:16
 */
public class TestSort {
    public static void main(String[] args) {
        //乱序数组
       // int[] arr={9,2,5,8,4,7,8,6};
        int[] arr=largeArr(99999);
        //获取开始时间
        long startTime = System.currentTimeMillis();

        //bubbleSort.bubbleSort(arr);
        // SelectSort.SelectSort(arr);
        InsertSort.insertSort2(arr);

        //获取结束时间
        long endTime = System.currentTimeMillis();
        //打印排列好的，有序数组
        System.out.println(Arrays.toString(arr));
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
    }



    //生成大量的随机数组：
    public static int[] largeArr(int length)
    {
        int[] arr=new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random()*length);
        }
        return arr;
    }
}
