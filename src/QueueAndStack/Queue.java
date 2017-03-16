package QueueAndStack;

import java.util.Scanner;

/**
 * 队列
 * 先进先出
 * 规则：输入九个数字，删掉第一个数字，将第二个数字排到队尾，删除到结束，然后将删除的顺序排列出来
 * Created by SonamLee on 2017/3/16.
 */
public class Queue {
    public static void main(String[] args){
        int[] arr = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 9 numbers:");
        for (int i = 0; i < 9; i++){
            arr[i] = scanner.nextInt();
        }
        //队首
        int head = 0;
        //队尾
        int tail = 9;
        //判断结束条件
        while (head < tail){
            //输出队首数字，并将队首出列，head++为出列
            System.out.println(arr[head]);
            head++;

            //将新队首复制到队尾，这里第一次时，arr[9]是空的，所以不存在替换问题
            arr[tail] = arr[head];
            tail++;

            //再将队首出列。这里由于上一步为复制，所以出列
            head++;
        }
    }
}
