//*輸入初始值跟終止值 把中間數字都相加得出答案//
package whilecycle;

import java.io.*;

public class while_1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("輸入初始值：");
		String s1 = br.readLine();
		int start = Integer.parseInt(s1);
		while (start < 0) {
			System.out.println("重新輸入初始值：");
			String s = br.readLine();
			start = Integer.parseInt(s);
		}
		int end;
		do {
			System.out.print("輸入終止值：");
			String s2 = br.readLine();
			end = Integer.parseInt(s2);
		} while (end < start || end < 0);

		int sum = 0, i;
		for (i = start; i <= end; i++) {
			sum = sum + i;
			System.out.println("i=" + i + "sum=" + sum);
		}
		System.out.println("for迴圈結束");

		sum = 0;
		i = start;
		while (i <= end) {

			sum = sum + i;
			System.out.println("i=" + i + "sum=" + sum);
			i++;

		}
		System.out.println("while迴圈結束");

		i = start;
		sum = 0;
		do {
			sum = sum + i;
			i++;
			System.out.println("i=" + i + "sum=" + sum);
		} while (i <= end);
		System.out.print("dowhile迴圈結束");
	}
}
