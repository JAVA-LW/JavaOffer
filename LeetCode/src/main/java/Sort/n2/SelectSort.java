package Sort.n2;

/**
 * 算法：选择排序
 * 基本思想：双重循环遍历数组，每经过一轮比较，找到最小元素的下标，将其交换至首位。
 * 复杂度：O（n^2）
 *
 * @author
 * @site
 * @company
 * @create 2021-11-13 17:43
 */
public class SelectSort {


    public static void SelectSort(int[] arr)
    {
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            //System.out.println("-----第二重循环："+i);
            minIndex = i;
            for (int j = i+1 ; j < arr.length; j++) {
               // System.out.println("第一重循环："+j);

                if (arr[minIndex] > arr[j]) {
                    //System.out.println("最小值："+arr[j]);
                    // 记录最小值的下标
                    minIndex = j;
                }
            }
            // 将最小元素交换至首位
            Swap.swap(arr,i,minIndex);
        }
    }


}
