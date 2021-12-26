import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        char grid[] = new char[k];
        int g[] = new int[k];
        
        char arr[][] = new char[n][m];
        
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
        {
            arr[j][i] = 'B';
        }
        }
        
        
        for(int i = 0; i<k; i++)
        {
          grid[i] = sc.next().charAt(0);
            g[i] = sc.nextInt();
        }
        
        sc.close();
        
        for(int i = 0; i<k; i++)
        {
            if(grid[i] == 'R')
            {
                for(int j = 0; j<n; j++)
                {
                    if(arr[j][g[i]-1] == 'B')
                        arr[j][g[i]-1] = 'G';
                    else if(arr[j][g[i]-1] == 'G')
                        arr[j][g[i]-1] = 'B';
                    
                }
            }
            else if(grid[i] == 'C')
            {
                for(int j = 0; j<m; j++)
                {
                    if(arr[g[i]-1][j] == 'B')
                        arr[g[i]-1][j] = 'G';
                    else if(arr[g[i]-1][j] == 'G')
                        arr[g[i]-1][j] = 'B';
                }
            }
        }
        
       
        
         int count = 0;
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
        {
            if(arr[j][i] == 'G')
                count++;
        }
        }
        System.out.println(count);
    }
    
}
