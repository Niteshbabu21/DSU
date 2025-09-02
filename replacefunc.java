import java.util.*;

public class replacefunc {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string : ");
      String str = sc.nextLine();
      String newstr = str.replace('a','o').replace('A','O');
      System.out.println("Original String : "+str);
      System.out.println("Modified String :"+newstr);
      sc.close();
    }
}
