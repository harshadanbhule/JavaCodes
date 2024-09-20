class ThreadDemo extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("IN THREAD DEMO");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

 class ThreadDemoClient {
    public static void main(String[] args) {
      
        ThreadDemo threadDemo = new ThreadDemo();

        
        threadDemo.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("IN MAIN");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}

