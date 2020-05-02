import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char[][] matrix = new char[5][5];
		for (int i = 0; i < 5; i++)
			matrix[i] = sc.nextLine().replaceAll(" ", "").toCharArray();
		int R = -1, C = -1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (matrix[i][j] == '1') {
					R = i;
					C = j;
					break;
				}
			}
		}
		int moves = Math.abs(R - 2) + Math.abs(C - 2);
		System.out.println(moves);
        
	}
}