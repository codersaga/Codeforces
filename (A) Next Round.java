import java.util.Scanner;
public class problem158A
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int count=0;
        int[] score=new int[100];
        int n=sc.nextInt();
        int k=sc.nextInt();
        k=k-1;
        for(int i=0;i<n;i++){
            score[i]=sc.nextInt();
        }
        if(score[k]>0){
            for(int i=k+1;i<n&&score[k]==score[i];i++){
                count++;
            }
            System.out.println(count+k+1);
        }
        else{
            for(int i=0;i<k&&score[i]>0;i++){
                count++;
            }
            System.out.println(count);
        }
    }
}