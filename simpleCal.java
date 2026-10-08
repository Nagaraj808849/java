import java.util.*;
public class simpleCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter 1 for addition\n Enter 2 for substration\nEnter 3 for multiplication\nEnter 4 for division\nEnter 5 for remainder\n");
        
        int num=sc.nextInt();
        
        switch(num)
        {
          case 1:System.out.println("Enter the two values\n");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println("sum"+(a+b));break;
          case 2:System.out.println("Enter the two values\n");
                     a=sc.nextInt();
                     b=sc.nextInt();
                    System.out.println("Differenve"+(a-b));break;
          case 3:System.out.println("Enter the two values\n");
                     a=sc.nextInt();
                     b=sc.nextInt();
                    System.out.println("multiplication"+(a*b)); break;   
           case 4:System.out.println("Enter the two values\n");
                     a=sc.nextInt();
                     b=sc.nextInt();
                    System.out.println("Division"+(a/b)); break;
           case 5:System.out.println("Enter the two values\n");
                     a=sc.nextInt();
                     b=sc.nextInt();
                    System.out.println("Remainder:"+(a%b));break;
                 
            default:System.out.println("Enter the number in between 1 to 5");                              

        
    }

    }
}
