import java.util.Scanner;
public class hollowdiamond {

	public static void main(String[] args) {
		int i, j, k ; 
		int n=3;
        for (i = 1; i <= n; i++) 
        {
            for (j = i; j < n; j++)  
                System.out.print(" "); 
            for(k=0;k != (2 * i - 1);k++) { 
                if (k == 0 || k == 2 * i - 2) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
            } 
            
            System.out.println();  
        } 
       
        for (i = n-1; i>=1; i--)  
        { 
            
            for (j = i; j < n; j++)  
                System.out.print(" "); 
            for (k=0;k != (2 * i - 1);k++) { 
                if (k == 0 || k == 2 * i - 2) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
            } 
            
            System.out.println();  
        } 
        
    } 
}