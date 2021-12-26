import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();
        
        int p[] = new int[n];
        int w[] = new int[n];
        int d[] = new int[n];
            
        for(int i = 0; i<n; i++)
        {
            p[i] = sc.nextInt();
            w[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        
        int mini_walk = 999999999;
        
        int l[] = p;
        Arrays.sort(l);
        
        if(n==1)
            System.out.println(0);
        else
        {
            for(int j = 0; j<l[n-1]; j++)
                {
                    int temp_time = 0;
            for(int i = 0; i<n; i++)
            {
                int temp_walk = 0;
                
                if(p[i]>j)
                {
                    int t = j+d[i];
                    if(p[i]>t)
                    {
                        temp_walk += p[i] - t;
                    }
                    
                }
                else if(p[i]<j)
                {
                    int t = j-d[i];
                    if(p[i]<t)
                    {
                        temp_walk += t- p[i];
                    }
                }
                temp_time += temp_walk*w[i];  
            }
            if(temp_time<mini_walk)
                mini_walk = temp_time;
                }
            
            
            System.out.println(mini_walk);
        }
        
        
        
    }
    
}
