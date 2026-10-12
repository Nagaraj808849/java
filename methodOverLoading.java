public class methodOverLoading {

    public static void show()
    {
        System.out.println("hi");
    }
       public static void show(int a)
    {
       System.out.println(a);
    }
       public static void show(int a,int b)
    {
       System.out.println(a+" , "+b);
    }
     public static void show(double b)
    {
       System.out.println("double");
    }
     public static void show(float f)
    {
       System.out.println("float");
    }
     public static void show(char c)
    {
       System.out.println("char");

    }
     public static void show(char c,double b)
    {
       System.out.println(c+" "+b);

    }
     public static void add()
    {
       System.out.println("no arguments");

    }
    public static void add(int a)
    {
       System.out.println("one int arguments");

    }
      public static void add(int a,int b)
    {
       System.out.println("two int arguments");

    }
      public static void add(double a,double b)
    {
       System.out.println("two doubles");

    }
    //automatic type promotion

public static void a(int y)
    {
       System.out.println(y);

    }
    public static void a(double y)
    {
       System.out.println(y);

    }
    //return type change
    public static int add1(int a,int b)
    {
          return a+b;
    }
    //character promotion

    public static void show1(int a)
    {
        System.out.println("int");
    }
     public static void show1(char a)
    {
        System.out.println("char");
    }



    public static void main(String[] args) {
        show();//no args
        show(10);//single args
        show(10, 20);//double args
        show(10.12);
        show('a');
        show(10.0f);
        show('a', 25.366666);
        //display
        add();
        add(10);
        add(25.258, 45.25863214785);
        add(10, 20);
        a(20);
        a(22222);
        add1(10, 20);
        char c='A';
        show1(65);
    }
}
