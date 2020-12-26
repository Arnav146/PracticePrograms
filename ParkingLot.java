import java.util.Scanner;
class ParkingLot
 {
    int vno,hours;
    double bill;
     void input()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the vehicle no.");
     vno=sc.nextInt();
     System.out.println("Enter the time in hours for which the vehicle was parked");
     hours=sc.nextInt();
    }
    void calculate()
    {
       if(hours>=1)
       {
           bill=3+((hours-1)*1.5);
           System.out.println("The bill is"+bill);
        }
        else if(hours<1)
        { 
            bill=(hours*3);
            System.out.println("The bill is"+bill);
        }
        else
        {
        System.out.println("Invalid value");
    }
}
 void display()
{
    System.out.println("vehicle no."+vno);
    System.out.println("Parked for"+hours+"hours");
    System.out.println("Your bill"+bill);
}
 public static void main()
{
 ParkingLot obj=new ParkingLot();
 obj.input();
 obj.calculate();
 obj.display();
}
}

           
     
     
     
     
    
    
    