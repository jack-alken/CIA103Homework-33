package hm2;

public class hm {
	public static void main(String[] args) {
//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	int a = 0;int sum =0;
	 while(a < 1000) { sum += a; a +=2;	}
	 System.out.print("1~1000的偶數和是");
	 System.out.println(sum);
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
	 int b,c = 1;
	 for(b = 1;b <= 10;b++) c*= b ;
	 System.out.print("1~10的連乘積是");
	 System.out.println(c);
//	 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	 int d= 1,e = 1;
	 while(d < 10) {
		 d++;e *= d;
	 }
	 System.out.print("1~10的連乘積是");
	 System.out.println(e);
//	 請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
	 int f=1, g=1;
	 for(f=1;f <= 10;f++ ) {g=(int)Math.pow(f,2); System.out.print(g + " ");}
	 System.out.println();
//	 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	 int h  ;int j = 0;
	 for(h=1 ; h <= 49 ; h++) {
		 if (h /10 == 4) {}
		 else if  (h%10 == 4) {}
		 else { System.out.print(h+" ");j ++;}; 
	 }
	 System.out.println();
	 System.out.println("總共有" + j + "個");
	 
	 
//	 請設計一隻Java程式,輸出結果為以下:
//		 1 2 3 4 5 6 7 8 9 10
//		 1 2 3 4 5 6 7 8 9
//		 1 2 3 4 5 6 7 8
//		 1 2 3 4 5 6 7
//		 1 2 3 4 5 6
//		 1 2 3 4 5
//		 1 2 3 4
//		 1 2 3
//		 1 2
//		 1
for(int k = 11;k >= 1;k--) {
	for(int l = 1; l < k;l++) {
		System.out.print(l+" ");
	}System.out.println();}

//請設計一隻JAVA程式，輸出結果如下：
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
for(int m = 0; m <= 5;m++) {
	for(int n = 0;n <= m;n++) {
		int o = 65+m;
		char p =(char) o;
		System.out.print(p);
	}System.out.println();
}
	}
	 }
	

