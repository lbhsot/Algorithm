package Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SonamLee on 2017/3/15.
 * 输入有 2 行，第 1 行为一个正整数，表示有 n 个同学参与调查（n≤100）。第 2 行有 n
 * 个用空格隔开的正整数，为每本图书的 ISBN号（假设图书的 ISBN号在 1~1000 之间）。
 * 输出也是 2 行，第 1 行为一个正整数 k，表示需要买多少本书。第 2 行为 k 个用空格隔
 * 开的正整数，为从小到大已排好序的需要购买的图书的 ISBN号。
 *
 * 方案1:使用桶排序，先去重再排序，数字每出现一次，该数字对应的桶a[i]++，然后输出所有a[t]=1的桶
 * 方案2:先排序再去重，排序时使用冒泡排序，然后输出时判断，和前一个数相不相同，相同则不输出
 * 方案3:同方案2，将冒泡排序换成快速排序
 *
 * 如果选用方案1，这道题是可行的，但是如果需要申请的桶太多，无法申请那么大的数组空间，这时方案1不可行
 * 如果选用方案2，这道题的数据量比较小，冒泡排序的时间复杂度为O(N^2)，时间可以接受，但是如果排序的数过多，时间上就太多了
 * 下边的代码选用方案3，快速排序的时间复杂度为O(NlogN)
 * 如果数据量为100000，方案2需要计算100000^2=10000000000，为100亿次，计算机大概需要计算10s
 * 方案3需要计算 100000×log 2 100000≈100000×17≈170 万次，计算机大概计算不到0.0017s
 */
public class SortTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list = Utils.getInput();
        int n = list.size();
        n = list.size();
        quickSort(list, 0, list.size() - 1);
        System.out.print(list.get(0) + " ");
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != list.get(i - 1)) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    private static void quickSort(List<Integer> list, int left, int right){
        int i, j, t, temp;
        if (left > right){
            return;
        }

        temp = list.get(left);      //基准数
        i = left;
        j = right;
        while (i != j){
            //顺序很重要，要先从右往左找
            while (list.get(j) >= temp && i<j){
                j--;
            }

            //再从左往右找
            while (list.get(i) <= temp && i<j){
                i++;
            }


            //交换两个数在数组中的位置
            if (i < j){
                t = list.get(i);
                list.set(i, list.get(j));
                list.set(j, t);
            }
        }

        list.set(left, list.get(i));
        list.set(i, temp);

        //继续处理左边的和右边的，递归
        quickSort(list, left, i-1);
        quickSort(list, i+1, right);
    }

}
