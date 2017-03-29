package Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SonamLee on 2017/3/15.
 * ð������ ÿ�αȽ�����Ԫ�أ����˳�����󣬻�λ
 * ð������Ƚ�����������̾ͺ�����һ��
 * �Ӵ�С�����Ƚ���һλ��ڶ�λ�Աȣ�Ȼ��ڶ�λ�����λ���Դ�����...
 * Ȼ��ִ��n-1��
 *
 * ����ѭ��Ƕ�ף�����ʱ�临�Ӷ�ΪO(N^2)
 * ʱ�临�Ӷȷǳ���
 * �����Ͱ�����˷ѿռ�����⣬�����������㷨ִ��Ч��
 */
public class BuddleSort {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();

        list = Utils.getInput();
        int n = list.size();

        /**
         * ð��
         * ������5��������һ��������Ҫ�Ƚ�4�Σ���ʱi=0��j����n-i-1
         * һ����Ҫ����n-1��
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
