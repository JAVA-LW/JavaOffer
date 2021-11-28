package Sort.n2;

/**
 * 插入排序：
 *
 *
 *
 */
public class InsertSort {

    /**
     * 插入排序基本while版本
     * @param arr
     */
    public static void insertSort1(int[] arr) {
        //从第二个数字开始插入：
        for (int i = 1; i < arr.length; i++) {
            //记录当前数组下标
            int curr=i;
            while (curr>=1 && arr[curr]<arr[curr-1])
            {
                Swap.swap(arr,curr,curr-1);
                curr--;
            }
        }
    }
    /**
     * 插入排序基本for版本
     * @param arr
     */
    public static void insertSort2(int[] arr) {
        //从第二个数字开始插入：
        for (int i = 1; i < arr.length; i++) {
            //记录当前数组下标
            //System.out.println("\n"+i+"-第二重：");
            for (int curr=i;curr>0;curr--)
            {
               // System.out.println("第一重："+curr);
                if (arr[curr]<arr[curr-1])
                {
                  //  System.out.println("curr的值："+arr[curr]);
                  //  System.out.println("curr-1的值："+arr[curr-1]);
                    Swap.swap(arr,curr,curr-1);
                }
            }
        }
    }


    /**
     * 插入排序基本for版本 +版本
     * @param arr
     */
    public static void insertSort3(int[] arr) {
        //从第二个数字开始插入：
        for (int i = 1; i < arr.length; i++) {
            //记录当前数组下标
            for (int curr=0;curr<i;curr++)
            {
                if (arr[curr]>arr[curr+1])
                {
                    Swap.swap(arr,curr,curr+1);
                }
            }
        }
    }




}
