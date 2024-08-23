package hm1;

public class Hm1 {
	public static void main(String[] args) {
//		1.請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a =12 ;int b=6;
		System.out.println("12跟6的和為" + (a+b));
		
		System.out.println("12跟6的積為" +(a*b));
		
//		2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs = 200;
		System.out.println((200/12)+"打" + (200%12) + "顆");
//		3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sec = 256559;
		int sec1 = sec%60;
		int min = (sec/60)%60;
		int hour = sec/(60*60)%24;
		int day = sec/(60*60*24);
		System.out.println((day)+"天" + (hour) + "小時" + (min) + "分" + (sec1) + "秒");
//		4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415; int r = 5;
		System.out.println("圓面積為" +(Math.pow(r, 2)*PI));
		System.out.println("圓周長為"+ (2*PI*r));
//		5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		int money = 1_500_000;double R =1+0.02; 
		System.out.println("十年後會有" + (money*(Math.pow(R,10)))+ "元");
//		6.請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		System.out.println(5+ 5);
//兩個變數皆為整數 故為數字相加5+5=10
		System.out.println(5+'5');
//一個是整數5 一個是字元'5' 故字元會轉為int型態 字元5 在Uunicode 排序為305 
//		轉換為int則變成16*3+5 =53 故53+5=58
		System.out.println(5+ "5");
//	一個是數字5，一個是字串"5" 數字與字串相加為串接相加 變為字串"55"
} 
}
