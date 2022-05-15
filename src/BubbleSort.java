public class BubbleSort implements Runnable {
    static void printArray(int []array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    @Override
    public void run() {
        int []array={820,710,1002,790,78,87};
        int n=array.length;
        int a=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(array[j-1]>array[j]){
                    a=array[j-1];
                    array[j-1]=array[j];
                    array[j]=a;
                }
            }
        }
        printArray(array);

    }
}
