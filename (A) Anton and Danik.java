import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A')
                a++;
            if(s.charAt(i)=='D')
                b++;
        }
        if(a>b)
                System.out.println("Anton");
            else if(a<b)
                System.out.println("Danik");
            else
                System.out.println("Friendship");
	}
}