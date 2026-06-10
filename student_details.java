import java.util.Scanner;
 class Person{
    String name;
    int age;
    void getPersonDetails(){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter name: ");
 name=sc.nextLine();
 System.out.println("Age: ");
 age=sc.nextInt();
    }
 }
 class Student extends Person{
    int rollNo;
    int m1,m2,m3;
    double avg;
    double per;
    void getStudentDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll no: ");
        rollNo=sc.nextInt();
        System.out.println("Enter m1: ");
        m1=sc.nextInt();
        System.out.println("Enter m2: ");
        m2=sc.nextInt();
        System.out.println("Enter m3: ");
        m3=sc.nextInt();
    }
    double calavg(){
        return avg=(m1+m2+m3)/3.0;
    }
    double calpercentage(){
        return per=((m1+m2+m3)/300.00)*100;
    }
    void display(){
        System.out.println("Student details\n");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Rollno: "+rollNo);
        System.out.println("Mark1: "+m1);
        System.out.println("Mark2: "+m2);
        System.out.println("Mark3: "+m3);
        System.out.println("Average: "+avg);
        System.out.println("Percentage: "+per+"%");
    }
 }
 public class student_details {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));

            students[i] = new Student();

            students[i].getPersonDetails();
            students[i].getStudentDetails();
            students[i].calavg();
            students[i].calpercentage();
        }

        System.out.println("STUDENT DETAILS");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nStudent " + (i + 1));
            students[i].display();
        }
    }
}
        
        

