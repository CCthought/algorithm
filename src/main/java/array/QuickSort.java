package array;

import java.util.Arrays;

/**
 * @author zhouchengpei
 * date    2021/1/15 9:50
 * description 快速排序实现
 * 参考: https://www.bilibili.com/video/BV1Lh411Z7nK?t=706
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] a = new int[]{3,6,4,88,33,18,62,60,92};
        sort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] arr, int left, int right) {
        if (arr == null || arr.length == 0) {
            return;
        }

        if (left >= right){
            return;
        }

        int key = arr[left];
        int l = left;
        int r = right;

        while (l != r) {

            while (arr[r] >= key && l < r) {
                r--;
            }

            while (arr[l] <= key && l < r) {
                l++;
            }

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        arr[left] = arr[l];
        arr[l] = key;
        sort(arr, 0, l - 1);
        sort(arr, l + 1, right);
    }

}
