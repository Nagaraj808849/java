public class arrayLevel1 {
    void printElements(int a[])
    {
        int i=0;
        //for loop
       /*  for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();*/
        //while loop
        while(i<a.length)
        {
         System.out.print(a[i]+", ");
         i++;
        }
        System.out.println();
        //do while
        i=0;
        do
        {
            System.out.print(a[i]);
            i++;
        }while(i<a.length);
        System.out.println();
        System.out.println("forEach");
          
        for(int m:a)
        {
            System.out.println(m);
        }
    }

    //print method first ,middle ,last--index based values
    void printFirstMidLast(int a[])
    {
    //    System.out.println("first:"+a[0]);
    //     System.out.println("first:"+a[a.length/2]);
    //     System.out.println("first:"+a[a.length-1]);
        for(int i=0;i<a.length;i=i+a.length/2)
        {
            System.out.println(a[i]);
        }
    }
    //print length of an array and address
    void printLength(int a[])
    {
        System.out.println(a.length);
        System.out.println(a);
    }
    //modify third element
    void UpdateArray(int a[])
    {
      a[2]=100;
      System.out.println("After modifying");
       for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    //demo of reference copy
    /*void refCopy(int a[])
    {
        int copy[]=a;
        System.out.println("before");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
         System.out.println("After");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(copy[i]);
        }*/
        //different types array
        void diff(int a[],
                  double salary[],
                  char grade[],
                  boolean status[],
                  String name[])
        
        {
          for(int i=0;i<a.length;i++)
          {
            System.out.println(a[i]);
            
        }

    }
    //empty array
    void emptyArray(int n[])
    {
        System.out.println(n.length);
    }
    //null
    void nullArray(int m[])
    {
      System.out.println(m);
    }

    public static void main(String[] args) {
        int a[]={10,20,3,5,48,};
        arrayLevel1 obj=new arrayLevel1();
        obj.printElements(a);
       // obj.printFirstMidLast(a);
       //obj.printLength(a);
       //obj.UpdateArray(a);
       //obj.refCopy(a);
    //    double b[]={25.6,58.5};
    //    char g[]={'A','D'};
    //    boolean d[]={true,false};
    //    String s[]={"red","blue"};
      
    //   // obj.diff(a, b, g,d , s);
    //   int n[]={};
    //   obj.emptyArray(n);
    //   int m[]=null;
    //   obj.nullArray(m);




    }
    
}
