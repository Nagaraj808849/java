public class fibnocciSeries {
public static int fib(int a)
{
    int n1=0,n2=1,n3=0;
    for(int i=0;i<a;i++)
    {
        System.out.println(n3);
        n3=n1+n2;
        n2=n3;
        n1=n2;
        
    }
    return n3;
}    
public static void main(String[] args) {
    int a=5;
    int result=fib(a);
    System.out.println(result);


}
}
