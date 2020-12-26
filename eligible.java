import java.util.Scanner;
public class eligible
{
     void Calc() 
    {
    double total,attended,att_per;
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter the total no. of classes held");
    total=inp.nextInt();
    System.out.println("Enter the no. of classes you have attended");
    attended=inp.nextInt();

     att_per=((float)attended*100/total);
     if(att_per>=75.0)
     System.out.println("Eligible");
     else
     System.out.println("not eligible");
    }
 }


    
    
    
    
    
    
    


    
    

