public class nestedForLoop {
    public static void main(String[] args) {
        /*for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(i+"round"+j);
            }
        }*/

        int k=1;
        while(k<=5)
        {
            int l=1;
            while(l<=3)
            {
                System.out.println(k+"round"+l);
                l++;
            }
          k++;
        }
    }
    
}
