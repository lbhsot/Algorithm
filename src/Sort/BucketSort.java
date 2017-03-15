package Sort;

import java.util.Scanner;

/**
 * Created by SonamLee on 2017/3/15.
 * 桶排序
 * eg:
 * 数字出现可能性为0到10，排序5 8 5 2 3
 *
 * 可能出现的数字有11个，定义一个一维数组arr[11]，初值都为0，出现哪个数字，arr[1]++
 * 遍历arr，输出不为0的数字
 *
 * 以空间换时间
 * 桶的个数为m(数组长度),输入数字个数为n
 * 排序算法一共执行了m+n次
 * 时间复杂度为O(m+n)
 * 时间复杂度通常用大写字母表示，即O(M+N)
 */
public class BucketSort {
    public static void main(String[] args){
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Please enter 5 numbers below 10:");

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Please Enter:");
            int temp = 0;
            /**
             * 验证输入
             */
            try {
                temp = Integer.parseInt(scanner.next());
            }catch (Exception e){
                System.out.println("Please enter a correct number!");
                i = i-1;
                continue;
            }
            if (temp > 10){
                System.out.println("Please enter a correct number!");
                i = i-1;
                continue;
            }
            /**
             * **************************************
             */
            arr[temp]++;
        }

        //从大到小
//        for (int i = arr.length; i > 0; i--){
//
//        }

        //从小到大
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                System.out.print(i);
            }
        }

    }
}
