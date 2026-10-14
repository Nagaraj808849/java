public class varArgs2 {
    public static void student(String name,int age, int...marks)
    {
        System.out.println(name);
        System.out.println("age:"+age);
        for(int m:marks)
        {
            System.out.print(m+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        student("ramu", 22,12,15,24,15);
        student("praddep", 22,12,15,24,17);


    }
}
