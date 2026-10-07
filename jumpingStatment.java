public class jumpingStatment {
    public static void main(String[] args) {
     System.out.println("BREAK STATEMENT");

        for(int i=0;i<10;i++)
        {
            if(i==6){
           
            break;
            }
             System.out.println(i);
        }
       System.out.println("================CONTINUE STATEMENT");
         for(int i=0;i<10;i++)
        {
            if(i==6)
            {
           
            continue;
             
            }
            System.out.println(i);
        }

    }
}
