public class MethodsCallingMethods {
    public static void  great()
    {
        System.out.println("hello");
    }
     public static void  welcome()
    {
        System.out.println("welcome to algorithm");
        great();
    }
    public static void main(String[] args) {
        welcome();
    }
    
}
