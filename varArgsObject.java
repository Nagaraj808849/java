public class varArgsObject {
    public static void varargobj(Object...obj)
    {
       for(Object m:obj)
       {
        System.out.println(m);
       }
    }
    public static void main(String[] args) 
    {
        varargobj(101,"raju",23.5,true,'A');
    }
}
