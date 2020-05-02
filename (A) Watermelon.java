import java.util.Scanner;
public class Problem4A{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		int weight=sc.nextInt();
		if(weight>2&&weight%2==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}