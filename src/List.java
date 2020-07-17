import java.util.ArrayList;
import java.util.Scanner;

/*
 * 리스트
 */
public class List {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<Integer> numList = new ArrayList<Integer>();
//		nameList.add("보권");
//		nameList.add("성빈");
//		nameList.add("주성");
//		nameList.add("호성");
//		for (int i = 0; i < nameList.size(); i++) {
//			System.out.println(nameList.get(i));	
//		}
		// 같은 출력값 foreach가 많이 쓰임
		
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.print("이름 입력>> ");
			String input = sc.next();
			if (input.equals("0")) {
				break;
			}
			else {
				nameList.add(input);
				}
		}

//		System.out.println(input);
		for(String name : nameList) {
			System.out.println(name);
		}
	}

}
