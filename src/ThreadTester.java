public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main is starting");

        Thread thread1 = new Thread1("Thread1");
        thread1.start();

        Thread thread2 = new Thread(new Thread2(),"Thread2");
        thread2.start();

        System.out.println("Main is ending");
    }
}


