import java.util.*;
public class LargestOfthree {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("This is largest"+a);
        }
        else if(b>a && b>c){
            System.out.println("This is largest"+b);
        }
        else{
            System.out.println("This is largest "+c);
        }
    }
    
}
