import java.util.Scanner;

public class SubString {

    public static String subString(String str, int si, int ei){
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr = substr + str.charAt(i);
            
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting Index: ");
        int si = sc.nextInt();
        System.out.println("Enter the Ending Index: ");
        int ei = sc.nextInt();
        System.out.println(subString(str, si, ei)); 
    }
}
