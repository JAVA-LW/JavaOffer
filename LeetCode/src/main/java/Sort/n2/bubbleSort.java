package Sort.n2;

/** 排序算法：冒号排序
 *  基本思想：一边比较一边向后两两交换，将最大值 / 最小值冒泡到最后一位；
 *
 *  优化思路：
 *      1，经过优化的写法：使用一个变量记录当前轮次的比较是否发生过交换，
 *      如果没有发生交换表示已经有序，不再继续排序；
 *
 *      2，除了使用变量记录当前轮次是否发生交换外，
 *      再使用一个变量记录上次发生交换的位置，下一轮排序时到达上次交换的位置就停止比较。
 *  复杂度：O(n^2)
 *
 * @author
 * @site
 * @company
 * @create 2021-11-13 17:47
 */
public class bubbleSort {

    //基本版思想
    public static void bubbleSort(int[] arr) {
        //第二个循环，保证所有数组内的数字是正确。
        for (int i = 0; i < arr.length - 1; i++) {
            //System.out.println("---第二重循环："+i);
            //第一个循环，指定下标位置下数字是正确
            for (int j = 0; j < arr.length - 1 - i; j++) {
               // System.out.println("第一重循环："+j);


                //如果前面比后面大，那么他们就交换顺序（下标）
                if (arr[j] > arr[j + 1]) {
                  //  System.out.println("要交换的：arr[j]:"+arr[j]);
                   // System.out.println("要交换的：arr[j+1]:"+arr[j+1]);
                    // 如果左边的数大于右边的数，则交换，保证右边的数字最大
                    Swap.swap(arr, j, j + 1);
                }


            }
        }
    }

}
