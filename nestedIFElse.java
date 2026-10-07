public class nestedIFElse {
    public static void main(String[] args) {
        int age=20;
        int height=176;
        boolean medical =true;

        if(age>=18)
        {
            if(height>=170)
            {
                if(medical)
                {
                    System.out.println(" selected");
                }
                else
                {
                    System.out.println("rejected");
                }
            }
            else
            {
                System.out.println("age is ok but height not eligible");
            }

        }
        else
        {
            System.out.println("age is not eligible");
        }
    }
}
