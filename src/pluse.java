import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class pluse {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		Random random = new Random();
		// 두자리의 수가 나오는 랜덤수를 두개를 만들고
		// 두개를 더한 값이랑
		// 사용자에게 정답을 요구
		// 맞으면 맞다 틀리면 틀리다
		// 틀리면 맞을때까지 계속
		Scanner sc = new Scanner(System.in);
		for (int i = 10; i < 99; i++) {
			num.add(i);
		}

		int o = random.nextInt(num.size());
		int t = random.nextInt(num.size());
		int sum = num.get(o) + num.get(t);

		for (;;) {
			System.out.print(num.get(o) + "+" + num.get(t) + " =");
			int input = sc.nextInt();

			if (sum == input) {
				System.out.println("정답입니다\n");
				break;
			} else {
				System.out.println("틀렸습니다\n");
				o = random.nextInt(num.size());
				t = random.nextInt(num.size());
				continue;
			}
		}
	}

}
