import java.util.*;
public class Paliandrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0){
            int ld=num%10;
            rev=rev*10+ld;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("Paliandrome NUmber");
        }
        else{
            System.out.println("Not a paliandrome number");
        }
    }
}
