package Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SonamLee on 2017/3/15.
 * ������ 2 �У��� 1 ��Ϊһ������������ʾ�� n ��ͬѧ������飨n��100������ 2 ���� n
 * ���ÿո��������������Ϊÿ��ͼ��� ISBN�ţ�����ͼ��� ISBN���� 1~1000 ֮�䣩��
 * ���Ҳ�� 2 �У��� 1 ��Ϊһ�������� k����ʾ��Ҫ����ٱ��顣�� 2 ��Ϊ k ���ÿո��
 * ������������Ϊ��С�������ź������Ҫ�����ͼ��� ISBN�š�
 *
 * ����1:ʹ��Ͱ������ȥ������������ÿ����һ�Σ������ֶ�Ӧ��Ͱa[i]++��Ȼ���������a[t]=1��Ͱ
 * ����2:��������ȥ�أ�����ʱʹ��ð������Ȼ�����ʱ�жϣ���ǰһ�����಻��ͬ����ͬ�����
 * ����3:ͬ����2����ð�����򻻳ɿ�������
 *
 * ���ѡ�÷���1��������ǿ��еģ����������Ҫ�����Ͱ̫�࣬�޷�������ô�������ռ䣬��ʱ����1������
 * ���ѡ�÷���2���������������Ƚ�С��ð�������ʱ�临�Ӷ�ΪO(N^2)��ʱ����Խ��ܣ������������������࣬ʱ���Ͼ�̫����
 * �±ߵĴ���ѡ�÷���3�����������ʱ�临�Ӷ�ΪO(NlogN)
 * ���������Ϊ100000������2��Ҫ����100000^2=10000000000��Ϊ100�ڴΣ�����������Ҫ����10s
 * ����3��Ҫ���� 100000��log 2 100000��100000��17��170 ��Σ��������ż��㲻��0.0017s
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

        temp = list.get(left);      //��׼��
        i = left;
        j = right;
        while (i != j){
            //˳�����Ҫ��Ҫ�ȴ���������
            while (list.get(j) >= temp && i<j){
                j--;
            }

            //�ٴ���������
            while (list.get(i) <= temp && i<j){
                i++;
            }


            //�����������������е�λ��
            if (i < j){
                t = list.get(i);
                list.set(i, list.get(j));
                list.set(j, t);
            }
        }

        list.set(left, list.get(i));
        list.set(i, temp);

        //����������ߵĺ��ұߵģ��ݹ�
        quickSort(list, left, i-1);
        quickSort(list, i+1, right);
    }

}
