import java.util.*;
public class TowersOfHanoi{
        void toh(String source,String dest,String aux,int n)
        {
            if(n==1)
            {
                System.out.println("Move coin from "+source+" to "+dest);
                return;
            }
            toh(source,aux,dest,n-1);
            System.out.println("Move coin from "+source+" to "+dest);
            toh(aux,dest,source,n-1);
        }
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of rings:");
            int n;
            n=sc.nextInt();
            TowersOfHanoi t=new TowersOfHanoi();
            t.toh("tower 1","tower 2","tower 3",n);

        }
    
}