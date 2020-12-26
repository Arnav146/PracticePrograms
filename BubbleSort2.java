import java.util.Scanner;
public class BubbleSort2
{
    String a[]=new String[4];
    Scanner in=new Scanner(System.in);
    int n=a.length;
    public void input()
    {
        System.out.println("Enter 4 words");
        for(int i=0;i<n;i++)
        {
          a[i]=in.nextLine();
        }
        
    }
      void display()
      {
    System.out.println("Unsorted array:");
    for(int i=0;i<n;i++)
    {
        System.out.print(a[i]+", ");
        
 } 
}
//bubble sorting
    void sort()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
           if(a[j].compareTo(a[j+1])>0)
           {
               String t=a[j];
               a[j]=a[j+1];
               a[j+1]=t;
            }
 }
}
}
 void display2()
 {
 System.out.println("\nsorted array");
 for(int i=0;i<n;i++)
 {
     System.out.print(a[i]+", ");
  }
}
public static void main(String args[])
{
  BubbleSort2 obj=new BubbleSort2();
  obj.input();
  obj.display();
  obj.sort();
  obj.display2();

}
}

    
    
     