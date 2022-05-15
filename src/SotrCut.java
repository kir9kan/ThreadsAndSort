import java.util.Arrays;

public class SotrCut implements Runnable {
    @Override
    public void run() {
        int[] arr={45,37,14,19,91,107,97};
        for(int i=0;i< arr.length;i++){
            int value=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(value<arr[j]){
                    arr[j+1]=arr[j];
                }
                else {
                    break;
                }
            }
            arr[j+1]=value;
        }
        System.out.println(Arrays.toString(arr));
    }
}
