
import java.util.Scanner;

public class evenOrOddIns {
    public void even(int a)
    {
        if(a%2==0)
        {
            System.out.println("even");
        }
        else{
        System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        evenOrOddIns obj=new evenOrOddIns();
        obj.even(num);
        
        
    }
    
}
