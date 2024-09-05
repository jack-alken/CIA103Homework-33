package hw4;
import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入年分(yyyy)");
        int year = sc.nextInt();
        System.out.print("請輸入月份(mm)");
        int month = sc.nextInt();
        while(month < 1 || month > 12) {
            System.out.println("輸入的月份無效！");
            System.out.println("請重新輸入");
             month = sc.nextInt();
           }
        System.out.print("請輸入日期(dd)");
        int day = sc.nextInt();
        int date = 0;	
        int[] d = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(year %4  == 0 && year%100 !=0 || year%400 == 0)d[1]=29;
        
        while(day < 1 || day > d[month - 1]) {
            System.out.println("輸入的日期無效！");
            System.out.println("請重新輸入");
            day = sc.nextInt();}
        for(int i=0;i<month-1;i++) {date +=d[i];
        }date += day;
        System.out.print("輸入的日期為該年第"+ date +"天");sc.close();
    }
}