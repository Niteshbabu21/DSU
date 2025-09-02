import java.util.*;

public class strcharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Character at first index : "+str.charAt(0));
        System.out.println("Character at last index : "+str.charAt(str.length()-1));

    }

}
