public class nestLoop {
    public static void main(String[] args) {
       /*  for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print("("+i+","+j+")\t");
            }
            System.out.println();
        }*/

            for(int i=1;i<10;i++)
            {
                for(int j=2;j<=10;j++)
                {
                    System.out.print(j*i+"\t");
                }
                System.out.println();
            }
    }
}
