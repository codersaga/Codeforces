import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int ans=0;
        for(int q=0;q<t;q++){
            String s=sc.next();
            if(s.equals("Tetrahedron")) 
                ans+= 4;
            else if(s.equals("Cube")) 
                ans+= 6;
            else if(s.equals("Octahedron")) 
                ans += 8;
            else if(s.equals("Dodecahedron")) 
                ans += 12;
            else if(s.equals("Icosahedron")) 
                ans += 20;
            
        }
        System.out.println(ans);
	}
}