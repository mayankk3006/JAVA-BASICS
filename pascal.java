public class pascal {

   public static void main(String[] args)
   {
      int n=5, i, j, space, num;
      for(i=0; i<n; i++)
      {
         for(space=n-1; space>i; space--)
         {
            System.out.print(" ");
         }
         num=1;
         for(j=0; j<=i; j++)
         {
            System.out.print(num+ " ");
            num = num*(i-j)/(j+1);
         }
         System.out.print("\n");
      }
   }
}

