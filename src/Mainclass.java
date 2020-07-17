import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

/*
 * 배열
 */
public class Mainclass {

	public static void main(String[] args) {
//		System.out.println("hello world");
		int a = 1;
		int b = 2;
		int c = 3;

		Scanner sc=new Scanner(System.in);
//		int i = 0;
//		int y[] = new int[i];
//		for (i = 0; i < 3; i++) {
//			y=sc.nextInt();
//		}
//		int[] arrNum = { 1, 2, 3 };
//		
//		for (int i = 0; i < arrNum.length; i++) {
//			System.out.println("나는 " + arrNum[i] + "번이다");
//		}
//		
//		String name1 = "박주선";
//		String name2 = "이호성";
//		String name3 = "김성빈";
//		
//		String [] arrName = {"박주선", "이호성", "김성빈"};
//		for (int i = 0; i < arrName.length; i++) {
//			System.out.println("나는 " + arrName[i] + "입니다");
//		}
//		for (String name : arrName) {
//			System.out.println(name);
//		}
		// 방을 만듬
		//int room[]=new int[];
		// 방의 갯수를 입력
		System.out.print("예약할 방의 갯수를 입력하시오 \n>>");
		int input=sc.nextInt();
		// 방의 갯수를 room에 저장
		String[] roomname = new String[input];
		
		//각 방의 사람의 이름
		System.out.print("예약할 사람의 이름을 입력하시오 \n>>");
		// 방의 갯수만큼 사람의 이름 입력
		for (int i = 0; i < roomname.length; i++) {
			roomname[i] = sc.next();

		    System.out.print((i+1) +"\t");
		    System.out.println(roomname[i]);
		}
	}

}
