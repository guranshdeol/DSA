public class LargestString {
    public static void main(String args []){
        String[] a = {"apple" , "mango", "banana"};
        String largestStr = a[0];
        for (int i = 0; i < a.length; i++) {
            if (largestStr.compareTo(a[i]) < 0 ) {
                largestStr = a[i];
            }
        }
        System.out.println(largestStr);
    }
}
}
