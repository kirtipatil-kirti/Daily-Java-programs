import java.util.*;

public class largestdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxDigit=0;
        while(n>0){
        int ld=n%10;
        if(ld>maxDigit){
            maxDigit=ld;
        }
         n=n/10;
    }
   
        System.out.println(maxDigit);
        sc.close();
    

    }
    
}
