public class RevArray {
    public static int[] reverseArray(int arr[])
    {
        int revarr[] = new int[arr.length];
        for (int i = 0; i < revarr.length; i++){
            revarr[i] = arr[arr.length - i -1];
        }
        return revarr;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int revarr[] = reverseArray(arr);
        for (int i = 0; i < revarr.length; i++){
            System.out.print(revarr[i] + " ");
        }
    }
}