public class varArgs {
    public static void varArg(int...a)
    {
       System.out.println(" "+a.length);
       for(int i=0;i<a.length;i++)
       {
        System.out.print(a[i]);
       }
       System.out.println();
    }
   public static void main(String[] args) {
       varArg(10);
       varArg(10,20);
       varArg(10,20,30);
   }
    
}
