
import java.util.Scanner;

public class countNumber {
    public int didgitCount(int num)
    {
       
        int count=0;
        if(num==0)
        {
            return count+1;
        }
       while(num!=0)
       {
        num=num/10;
        count++;
       }
      return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        countNumber obj=new countNumber();
       int res= obj.didgitCount(num);
       System.out.println("count:"+res);
       


    }
}
