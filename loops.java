public class loops {
    public static void main(String[] args) {
       int n=4;
       for(int i=0;i<n*2;i++)
       {
        int total=i>n ? 2*n-i : i;
        int space=n-total+1;
        for(int k=0;k<n*space;k++)
        {
            System.out.print("* ");
        }
        for(int j=0;j<total;j++)
        {
            System.out.print("  ");
        }
        System.out.println();
       }
    }
}
