
import java.util.*;

public class JavaProject {
    Scanner sc = new Scanner(System.in);
    String name, Section, marks1, marks2;
    int age, Reg_no, Roll_no; // this is basic Structure Now ,full project will complete within 2 months.
    float height;
    char gender;

    JavaProject(String name, String Section, int age, int Reg_no, int Roll_no, float height, char gender, String marks1,
            String marks2) {
        this.name = name;
        this.Section = Section;
        this.age = age;
        this.Reg_no = Reg_no;
        this.Roll_no = Roll_no;
        this.height = height;
        this.gender = gender;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    void displayPersonalDetails() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Reg_No is: " + Reg_no);
        System.out.println("Gender is: " + gender);
        System.out.println("Height  is: " + height);
        System.out.println("Roll No is:" + Roll_no);
        System.out.println("Section is :" + Section);
        System.out.println("High school %:" + marks1);
        System.out.println("Intermediate %:" + marks2);
    }

    void reportDetails() {
        // Scanner input = new Scanner(System.in);
        int numSubjects = 5;
        int caTests = 3;
        int caMarks = 30;
        int midTermMarks = 20;
        int endTermMarks = 50;
        double cgpa = 0.0;

        for (int i = 1; i <= numSubjects; i++) {
            int[] caArray = new int[caTests];
            int bestTwo = 0;

            System.out.println("Enter the CA marks of subject " + i);
            for (int j = 0; j < caTests; j++) {
                caArray[j] = sc.nextInt();
            }

            // Find the best two CA marks
            for (int j = 0; j < caTests; j++) {
                for (int k = j + 1; k < caTests; k++) {
                    if (caArray[j] < caArray[k]) {
                        int temp = caArray[j];
                        caArray[j] = caArray[k];
                        caArray[k] = temp;
                    }
                }
            }

            bestTwo = caArray[0] + caArray[1];

            System.out.println("Enter the Mid-Term marks of subject " + i);
            int midTerm = sc.nextInt();

            System.out.println("Enter the End-Term marks of subject " + i);
            int endTerm = sc.nextInt();

            // Calculate the subject grade points and add to the CGPA
            double subjectPoints = ((bestTwo / 2) * 0.3) + (midTerm * 0.2) + (endTerm * 0.5);
            cgpa += (bestTwo / 2 + midTermMarks + endTermMarks) / subjectPoints;
        }
        if (cgpa > 10) {
            cgpa = 10;
        }
        System.out.println("CGPA: " + cgpa);
    }

    void CaMarks() {
        // Scanner input = new Scanner(System.in);
        int numSubjects = 5;
        int caTests = 3;
        int caMarks = 30;
        for (int i = 1; i <= numSubjects; i++) {
            int[] caArray = new int[caTests];
            System.out.println("Enter the CA marks of subject " + i);
            for (int j = 0; j < caTests; j++) {
                caArray[j] = sc.nextInt();
            }

            // Find the best two CA marks

            for (int j = 0; j < caTests; j++) {
                for (int k = j + 1; k < caTests; k++) {
                    if (caArray[j] < caArray[k]) {
                        int temp = caArray[j];
                        caArray[j] = caArray[k];
                        caArray[k] = temp;
                    }
                }
            }
            System.out.println("ca marks of subject " + i + " is :" + (caArray[0] + caArray[1]) / 2);
        }

    }

    void MteEteMarks() {

        int arr[] = new int[5];
        int sum = 0;
        int sum1 = 0;
        System.out.println("Enter the Mid-Term marks of subject ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Enter the End term marks of subjects");
        for (int j = 0; j < 5; j++) {
            arr[j] = sc.nextInt();
            sum1 = sum1 + arr[j];
        }
        System.out.println("You have got " + sum + " marks out of 100");
        System.out.println("You have got " + sum1 + " marks out of 250");
        System.out.println("your percentage of  mte is " + (sum * 100) / 100 + "%");
        System.out.println("your percentage of  Ete is " + (sum1 * 100) / 250 + "%");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Lpu Record System\nplease enter your id and password:");
        System.out.println("User id :");
        int id = sc.nextInt();
        System.out.println("Password :");
        int Pass = sc.nextInt();
        if (id == 12102379 && Pass == 154371) {
            System.out.println("Hi i am your personal Assistant:");
            sc.nextLine();
            System.out.println("If you want to see Personal detail  then Press 1");
            System.out.println("If you want to see the overall Report  then press 2");
            System.out.println("If you want to see your  all subject ca Total marks then press  3");
            System.out.println("If you want to see Your  Mte and Ete Total marks then press  4");
            System.out.println("If you want to see Your  Attendance only  then press  5");
            System.out.println("If you want to exit then press 6");
            sc.nextLine();
            System.out.println("Please enter the number according to your choice:");
            int choice = sc.nextInt();

            JavaProject ob1 = new JavaProject("Anmol Mishra", "K21PB", 22, 12102379, 16, 5.4f, 'M', "80%", "85%");
            if (ob1.Reg_no < 1 || ob1.age < 1) {
                return;
            } else
                switch (choice) {
                    case 1:
                        ob1.displayPersonalDetails();
                        break;
                    case 2:

                        ob1.reportDetails();
                        break;
                    case 3:
                        ob1.CaMarks();
                        break;
                    case 4:
                        ob1.MteEteMarks();
                        break;
                    case 5:
                        System.out.println("Attendance is 90%");
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("\nPlease enter the number between 1 to 6");

                }
        } else {
            System.out.println("Invalid Credential");
            return;
        }
    }
}
