# JavaProject                             // please save the file with that class which contain the main method..
import java.util.*;
public class JavaProject {
    String name;
    int age,Reg_no;                      // this is basic Structure Now full project will complete within 2 months.
     float height;
     char gender;
     JavaProject(String name,int age,int Reg_no,float height,char gender)
     { 
         this.name=name;
         this.age=age;
         this.Reg_no=Reg_no;
         this.height=height;
         this.gender=gender;
     }

     void DisplayPersonalDetails()
     {
         System.out.println("Name is: "+name);
         System.out.println("Age is: "+age);
         System.out.println("Reg_No is: "+Reg_no);
         System.out.println("Gender is: "+gender);
         System.out.println("Height  is: "+height);
     }
    void ReportDetails()
    {

    }
     public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine();
            int age=sc.nextInt();
            int Reg_No=sc.nextInt();
            float height=sc.nextFloat();
            char gender=sc.next().charAt(0);
            JavaProject ob1=new JavaProject(name,age,Reg_No,height,gender);
            if(Reg_No<1||age<1)
            {
                return;
            }
            else
            {
                ob1.DisplayPersonalDetails();

            }
        }
    }

