public class CalVal
{ 
    public void CalValTest()
    {
        int orig=10;
        System.out.println("The original value is"+orig);
        System.out.println("Return value after method change() ="+change(orig));
    }
    public static int change(int a)
    {
    a=20;
    return a;
}
}
    