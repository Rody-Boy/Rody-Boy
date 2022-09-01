public class pyramid
{
    public static void main(String args[]) 
    {
        int n=7, i, j, space = 1;         
        for (j = -1; j <= n - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 1 * (n - j) - 1; i++) 
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}