
import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int h[] = new int[n+1];
        int w[] = new int[n];
        
        for(int i  = 0; i<(n+1);i++)
            h[i] = sc.nextInt();
        
        for(int i  = 0; i<n;i++)
            w[i] = sc.nextInt();
        
        sc.close();
        
        double total = 0;
       for(int i  = 0; i<n;i++)
       {
           double a = h[i]+h[i+1];
           a = a/2;
           double temp = (w[i])*a;
           total += temp;
       }
       
       if(total != (int)total)
        System.out.println(total);
       else
            System.out.println((int)total);
    }
    
}
