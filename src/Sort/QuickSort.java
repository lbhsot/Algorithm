package Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SonamLee on 2017/3/15.
 * ???????? ?????????????????????t????????t?????t??????��??t?????t?????????
 *
 * ????????
 */
public class QuickSort {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();

        list = Utils.getInput();
        int n = list.size();
        quickSort(list, 0, n-1);
        for (int i = 0; i < n; i++){
            System.out.print(list.get(i) + " ");
        }
    }

    private static void quickSort(List<Integer> list, int left, int right){
        int i, j, t, temp;
        if (left > right){
            return;
        }

        temp = list.get(left);      //?????
        i = left;
        j = right;
        while (i != j){
            //?????????????????????
            while (list.get(j) >= temp && i<j){
                j--;
            }

            //???????????
            while (list.get(i) <= temp && i<j){
                i++;
            }


            //?????????????????��?��??
            if (i < j){
                t = list.get(i);
                list.set(i, list.get(j));
                list.set(j, t);
            }
        }

        list.set(left, list.get(i));
        list.set(i, temp);

        //?????????????????????
        quickSort(list, left, i-1);
        quickSort(list, i+1, right);
    }
}
