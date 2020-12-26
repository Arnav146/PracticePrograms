import java.util.*;
class Series3
{
    int S=0,n,x;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value for n");
        n=sc.nextInt();
        System.out.println("Enter a value for x");
        x=sc.nextInt();
    }
    void calc()
    {
        for(int i=2;i<=n;i+=3)
        {
            S+=i;
        }
        System.out.println(S);
    }
    public static void main()
    {
        Series3 obj=new Series3();
        obj.init();
        obj.calc();
    }
}