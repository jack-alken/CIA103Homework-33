package hw4;

public class Hw6 {
	public static void main(String[] args){
		int a[][]= {{10,35,40,100,90,85,75,70},
					{37,75,77,89,64,75,70,95},
					{100,70,79,90,75,70,79,90},
					{77,95,70,89,60,75,85,89},
					{98,70,89,90,75,90,89,90},
					{90,80,100,75,50,20,99,75}
					};//分數陣列
		int[] maxscore= new int [8]; //最高分計次

	        for (int exam = 0; exam < 6; exam++) {
	            int maxScore =a[exam][0];//設定每次考試第一位學生分數最高分
	            for (int student = 0; student < 8; student++) {
	                if (a[exam][student] > maxScore) {
	                    maxScore = a[exam][student];//有更高分將替代
	                }
	            }

	         
	            for (int student = 0; student < 8; student++) {
	                if (a[exam][student] == maxScore) {
	                    maxscore[student]++;//比對考試中最分 學生計次
	                }
	            }
	        }
	        for (int student = 0; student < 8; student++) {
	            System.out.println("學生 " + (student + 1) + " 獲得最高分的次數: " + maxscore[student]);
	        }
			
	}
}
		
