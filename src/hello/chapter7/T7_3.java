package hello.chapter7;

import java.util.Scanner;

public class T7_3 {
    public static void main(String[] args) {
        //初始化数组，大小为100，用来记录数字出现的次数
        int[] ints = new int[100];
        //输入数据，统计出现的次数
        Scanner scanner = new Scanner(System.in);
        int temp;

        while (scanner.hasNextInt()) {
                temp= scanner.nextInt();
                if (temp>100||temp<1){
                    System.out.println("数据错误,请输入1-100内的数");
                    continue;
                }
                ints[temp-1]+=1;

        }
        //输出数组，大小为0的不输出
        for (int i = 0; i <100 ; i++) {
            if (ints[i]!=0){
                System.out.printf("%d occors %d times",i+1,ints[i]);
                System.out.println();
            }
        }
        scanner.close();
    }
}
