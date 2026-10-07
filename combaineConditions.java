import java.util.*;
public class combaineConditions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();

        System.out.println("height");
        int height=sc.nextInt();

        System.out.println("percentage");
        double percentage=sc.nextDouble();

        System.out.println("medical");
        boolean medical=sc.nextBoolean();

        System.out.println("-----------------AND(&)-----------------------");
        if(age>=18 && height>=170 && medical)
        {
            System.out.println("selected");
        }
        else
        {
            System.out.println("not selected");
        }

         System.out.println("-----------------OR(|)-----------------------");
        if(percentage>=90 &&  medical)
        {
            System.out.println("special consideration");
        }
        else
        {
            System.out.println("no special consideration");
        }
         System.out.println("-----------------not(!)-----------------------");

         if(!medical)
        {
            System.out.println("medical not fit");
        }
        else
        {
            System.out.println("medical fit");
        }


         System.out.println("-----------------combained all-----------------------");
        if(age>=18 && height>=170 &&(percentage>=90 || medical))
        {
            System.out.println("final selection");
        }
        else
        {
            System.out.println("rejected");
        }




        

    }
}
