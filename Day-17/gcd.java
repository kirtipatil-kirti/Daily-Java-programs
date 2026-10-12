import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int small;
        int gcd=1;
        if(a<b){
            small=a;
        } else{
            small=b;
        }
        for (int i=small;i>=1;i--){
            if(a%i==0 && b%i==0){
                gcd=i;
                break;

            } }
        System.out.println(gcd);
        sc.close();
    }
}
