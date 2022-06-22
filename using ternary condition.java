import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter your first salary as a fresher =");
    int salary=input.nextInt(); // Reading integer
    String profession=(salary>30000 ? "Developer":"Tester"); //Ternary operator or Conditional Operator
    System.out.println("So your profession is "+profession); // printing his profession based on his salary
    }
}
