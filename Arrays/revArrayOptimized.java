public class revArrayOptimized {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int start = 0 , last = arr.length-1;
        while(start < last){
            int temp;
            temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}