import java.util.*;

public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int large=Math.max(a,b);
        while(large%a!=0 || large%b!=0){
            large++;
        }
        System.out.println(large);
        sc.close();
    }
    
}
