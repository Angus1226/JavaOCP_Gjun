package whilecycle;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class while_2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("輸數偶數相加最大值: ");

		String s = br.readLine();
		int range = Integer.parseInt(s);

		int i = 0, sum = 0, a = 0;
		while (i <= range) {
			sum = sum + i;
			i = i + 2;
			a++;
			System.out.println("第1次到第" + a + "次總和為" + sum);
		}
	}

}
