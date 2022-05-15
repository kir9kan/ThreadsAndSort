public class main {
    public static void main(String[] args) {
        Thread thread=new Thread(new BubbleSort());
        thread.start();
        Thread thread1=new Thread(new SotrCut());
        thread1.start();
        Thread thread2=new Thread(new SelectionSort());
        thread2.start();
    }
}
