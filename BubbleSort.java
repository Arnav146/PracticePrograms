import java.util.Scanner;
public class BubbleSort
{
    int a[]=new int [10];
    Scanner in=new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++)
        {
          a[i]=in.nextInt();
        }
        
    }
      void display()
      {
    System.out.println("Unsorted array:");
    for(int i=0;i<10;i++)
    {
        System.out.print(a[i]+", ");
        
 } 
}
//bubble sorting
    void sort()
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
           if(a[j]>a[j+1])
           {
               int t=a[j];
               a[j]=a[j+1];
               a[j+1]=t;
            }
 }
}
}
 void display2()
 {
 System.out.println("\nsorted array");
 for(int i=0;i<10;i++)
 {
     System.out.print(a[i]+", ");
  }
}
public static void main(String args[])
{
  BubbleSort obj=new BubbleSort();
  obj.input();
  obj.display();
  obj.sort();
  obj.display2();

}
}

    
    
     

    