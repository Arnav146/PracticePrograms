//WAP to calculate average marks of three subjects of a student.
class avg_marks_3
{
    double chem,maths,comp;
    int avg;
    void init()
    {
        chem=100;
        maths=99;
        comp=100;
    }
    void calc()
    {
        avg=(int)Math.round((chem+maths+comp)/3);
    }
    void disp()
    {
        System.out.println(avg);
    }
    public static void main()
    {
        avg_marks_3 obj=new avg_marks_3();
        obj.init();
        obj.calc();
        obj.disp();
    }
}