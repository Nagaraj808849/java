public class intentionalInfiniteloop {
    public static void main(String[] args) {
       /*  for(;;)//takes input as true runs infinite times
        {
            System.out.println("algo");
        }*/


        //multiple of 5
       /*  for(int i=5;i<=25;i=i+5)
        {
            System.out.println(i);
        }*/
          /*  int i=5;
            while(i<25)
            {
              System.out.println(i);
              i++;
            }
            int j=5;
            do{
                System.out.println(i);
                j=j+5;
            }while(i<=25);*/

            /*for(int i=1;i<=9;i=i+2)
            {
                System.out.println(i);
            }*/
             /*  int i=1;
               while(i<=9)
               {
                System.out.println(i);
                i=i+2;
               }

               int j=1;
               do{
                System.out.println(j);
                j=j+2;

               }while(j<=9);*/

               //print numbers 10,9,8
              System.out.println("FOR");

               for(int i=10;i>=1;i--)
               {
                System.out.println(i);
               }
            System.out.println("WHILE");

               int j=10;
               while(j>=1)
               {
                System.out.println(j);
                j--;
               }

               //do while
              System.out.println("DO-WHILE");
               int k=10;
               do
               {
                System.out.println(k);
                k--;
               }while(k>=1);

               System.out.println("FOR");

               for(int i=10;i>1;i=i-2)
               {
                System.out.println(i);
               }
            System.out.println("WHILE");

                j=10;
               while(j>1)
               {
                System.out.println(j);
                j=j-2;
               }

               //do while
              System.out.println("DO-WHILE");
                k=10;
               do
               {
                System.out.println(k);
                k=k-2;
               }while(k>1);



               //square
               System.out.println("FOR");

               for(int i=1;i<=10;i++)
               {
                System.out.println(i+":"+i*i);
               }
            System.out.println("WHILE");

             j=1;
               while(j<=10)
               {
                System.out.println(j+":"+j*j);
                j++;
               }

               //do while
              System.out.println("DO-WHILE");
               k=1;
               do
               {
                System.out.println(k+":"+k*k);
                k++;
               }while(k<=10);

             //double
               for(int i=1;i<=64;i=i*2)
               {
                System.out.println(i);
               }
                //half
               for(int i=64;i>=1;i=i/2)
               {
                System.out.println(i);
               }

    }
}
