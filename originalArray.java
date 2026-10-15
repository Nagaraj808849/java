public class originalArray {
    static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void change(int a[])
    {
        printArray(a);
        a[0]=10;
        System.out.println("After");
         printArray(a);


    }
    public static void main(String[] args) {
        int a[]={1,2,3,5,8};
        change(a);

    }

}
