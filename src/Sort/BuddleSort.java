package Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SonamLee on 2017/3/15.
 * 冒泡排序 每次比较相邻元素，如果顺序有误，换位
 * 冒泡排序比较形象，排序过程就和气泡一样
 * 从大到小排序，先将第一位与第二位对比，然后第二位与第三位，以此类推...
 * 然后执行n-1次
 *
 * 两层循环嵌套，所以时间复杂度为O(N^2)
 * 时间复杂度非常高
 * 解决了桶排序浪费空间的问题，但是牺牲了算法执行效率
 */
public class BuddleSort {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();

        list = Utils.getInput();
        int n = list.size();

        /**
         * 冒泡
         * 比如有5个数，第一次排序需要比较4次，此时i=0，j就是n-i-1
         * 一共需要排列n-1次
         */
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (list.get(j) < list.get(j+1)){
                    int temp = list.get(j + 1);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (Integer i : list){
            System.out.println(i + " ");
        }
    }
}
