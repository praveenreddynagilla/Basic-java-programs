import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
     Scanner read=new Scanner(System.in);
     int temperature=read.nextInt();
     if(temperature>30){
         System.out.println("it is a hot day");
         System.out.println("drink a plenty of water");
     }
     else if(temperature>20 && temperature<30){
         System.out.println("it is a nice day");
         System.out.println("get sleep easily");
     }
     else{
         System.out.println("it is a cool day");
     }
    }
}
