import  java.util.*;
public class tables {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.println("\t");
            for(int j=1;j<=10;j++)
            {
            System.out.println(i+"*"+j+"="+i*j);
            }
        }
        sc.close();
    }
}
