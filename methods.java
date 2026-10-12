public class methods {
    
    public static int add(int x,int y)
    {
        
        return (x+y);
    }
     public static void add1(int x,int y)
    {
        
        System.out.println(x+y);
    }
     public static int add2()
    {
        
        int a=10;
        int b=20;
        return a+b;
    }
     public static void add3()
    {
        
        int a=10;
        int b=20;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
       int sum= add(10,20);
       System.out.println(sum);
       add1(10,20);
       int ad=add2();
       System.out.println(ad);
       add3();
    }
    
}
