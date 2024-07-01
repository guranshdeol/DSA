public class BubbleSort{
    public static void bubble(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            for(int j = 1; j <arr.length - i; j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                
            }
        }
        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args ){
        
        int[] arr = {5,4,1,3,2};
        bubble(arr);
    }
}