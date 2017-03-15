package Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by SonamLee on 2017/3/15.
 */
public class Utils {

    //获取用户输入并验证
    public static List<Integer> getInput(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        System.out.print("Please enter a number:");
        int n = 0;
        try {
            n = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Please enter a correct number.");
            getInput();
        }


        System.out.println("Please enter n numbers to sort:");
        for (int i = 0; i < n; i++){
            try {
                int temp = scanner.nextInt();
                list.add(temp);
            }catch (Exception e){
                System.out.println("Please enter a correct number.");
                i = i-1;
                continue;
            }
        }
        return list;
    }
}
