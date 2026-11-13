import java.util.Scanner;
public class Main {
    int age;
    String name;
    Double grade;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students you want to enter");
         int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
        System.out.println("Enter the name of a student");
        String name=sc.nextLine();
        
        System.out.println("Enter the age of the student");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the grade of the student");
         Double grade=sc.nextDouble();
         sc.nextLine();
        System.out.println("Student details entered successfully");

    System.out.println("/n=====Student Details=====/n");
    System.out.println("name;"+name);
    System.out.println("age;"+age);
    System.out.println("grade;"+grade);}

sc.close();
}
    }

