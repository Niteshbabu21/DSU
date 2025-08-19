import java.util.*;

public class greater {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the two numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a > b){
      System.out.println("The greater number is : "+a);
    }
    else {
      System.out.println("The greater number is : "+b);
    }
    if(a == b){
      System.out.println("The numbers are equal");
    }


  }
}
