import java.util.Scanner;
public class ArrayInsertion
{
    public void input()
    {
     int c=50;int k;
     Scanner in=new Scanner(System.in);
     int a[]=new int[50];
     System.out.println("Enter the length of the array");
     int size=in.nextInt();
     System.out.println("enter the elements of the array");
     for(int i=0;i<size;i++)
     {
         a[i]=in.nextInt();
        }
        System.out.println("array before insertion:");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+", ");
        }
    

        
        //Insertion
        System.out.println("Enter the element to be inserted");
        int x=in.nextInt();
        System.out.println("Enter the position in which the element is to be inserted");
        int pos=in.nextInt();
    }
        public void insertion()
        {
        for(k=c; k>pos; k--)
        {
            int a[k] = a[k-1];
            
    }
        a[pos]=x;
        System.out.println("array after insertion:");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+", ");
        }
    }  
    public static void main(String args[])
    {
        ArrayInsertion obj=new ArrayInsertion();
        obj.input();
        obj.insertion();
    }
        
}

    