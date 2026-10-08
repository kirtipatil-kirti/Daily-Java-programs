
import java.util.*;
public class countofevenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumofodd=0;
        int sumofeven=0;
        while(n>0){
            int ld=n%10;
            if(ld%2==0){
                sumofeven++;
            }
            else{
                sumofodd++;
            }
            n=n/10;
        }
        System.out.println("Even number count: "+sumofeven);
        System.out.println("Odd number count: "+sumofodd);
        sc.close();
        
    }
    
}
