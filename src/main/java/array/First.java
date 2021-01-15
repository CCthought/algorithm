package array;

import java.util.Arrays;

/**
 * @author zhouchengpei
 * date    2021/1/15 9:48
 * description 两个整型有序数组合并成一个升序数组 时间复杂度要求 o(n)
 */
public class First {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,6,8,9,10,222};
        int[] b = new int[]{3,6,9,10,11,13};
        int[] sort = sort(a, b);
        System.out.println(Arrays.toString(sort));
    }

    private static int[] sort(int[] arr1, int[] arr2){
        if (arr1 == null || arr2 == null || arr1.length ==0 || arr2.length == 0){
            return null;
        }
        int[] arr = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i <= arr1.length -1 && j <= arr2.length - 1){
            if (arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        if (i < arr1.length){
            for (int o = i; o < arr1.length;o++){
                arr[k] = arr1[o];
                k++;
            }
        } else {
            for (int o = j; o < arr2.length;o++){
                arr[k] = arr2[o];
                k++;
            }
        }
        return arr;
    }

}
