package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("請輸入x的值: ");
            int x = readInteger(sc);
            
            System.out.print("請輸入y的值: ");
            int y = readInteger(sc);
            
            int result = (int) calculator.powerXY(x, y);
            System.out.println(x + " 的 " + y + " 次方是: " + result);
        } catch (CalException e) {
            System.out.println("計算錯誤: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("錯誤: 輸入的數字格式不正確。");
        } catch (Exception e) {
            System.out.println("發生未預期的錯誤: " + e.getMessage());
        } finally {
            sc.close();  // 確保掃描器關閉
        }
    }

    private static int readInteger(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("錯誤: 請輸入一個整數。");
                sc.next(); // 清除錯誤輸入
            }
        }
    }
}