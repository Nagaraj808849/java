public class forLoop {
    public static void main(String[] args) {
        int i=1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
        int j=1;
        do{
             System.out.println(j);
             j++;
        }while(j<=5);

        int [] num={10,20,30,40,50};
        for(int l : num)
        {
            System.out.print(l+"\t");
        }
    }
}
