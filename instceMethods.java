public class instceMethods {
     public  int add(int x,int y)
    {
        
        return (x+y);
    }
     public  void add1(int x,int y)
    {
        
        System.out.println(x+y);
    }
     public  int add2()
    {
        
        int a=10;
        int b=20;
        return a+b;
    }
     public  void add3()
    {
        
        int a=10;
        int b=20;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
    //     instceMethods a=new instceMethods();
    //    int sum= a.add(10,20);
    //    System.out.println(sum);
    //    a.add1(10, 20);
    //    int sum2=a.add2();
    //    System.out.println(sum2);
    //    a.add3();
    

    //one object for one method

    instceMethods a=new instceMethods();
       int sum= a.add(10,20);
        System.out.println(sum);
        instceMethods a1=new instceMethods();
      
       a1.add1(10, 20);
       instceMethods a2=new instceMethods();
       int sum2=a2.add2();
       System.out.println(sum2);
       instceMethods a3=new instceMethods();
       a3.add3();


       
    }
    
}
