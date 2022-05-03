public class array {
    public static void main(String[] args) {
        int[] arr = {10,20,54,74};
        boolean isSorted = true;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("sort");
        }
        else {
            System.out.println("unsorted");
        }
    }
}
