import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(i%2==1){
                System.out.print("I hate that ");
            }
            else{
                System.out.print("I love that ");
            }
        }
        if(n%2==1){
            System.out.print("I hate it");
        }
        if(n%2==0){
            System.out.print("I love it");
        }
	}
}