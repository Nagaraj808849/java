public class nestedIf {
    public static void main(String[]args)
    {
        int age=20;
        int hight=170;
        boolean medical=false;
        boolean physical=true;
        if(age>=18)
            {
                if(hight>=168)
                {
                    if(medical)
                    {
                        if(physical)
                        {
                            System.out.println("selected");
                        }
                    }
                   
                }
            }
           
        
    }
}
