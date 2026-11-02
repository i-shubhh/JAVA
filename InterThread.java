class SharedResource {
boolean signal = false;

synchronized void waitForSignal() {
    try {
        System.out.println("Thread 1: Waiting for signal...");
        while (!signal) {
            wait();
        }
        System.out.println("Thread 1: Signal received!");
        System.out.println("Thread 1: Continuing execution.");
    } catch (InterruptedException e) {
        System.out.println("Thread 1 was interrupted.");
        Thread.currentThread().interrupt();
    }
}
synchronized void sendSignal() {
    System.out.println("Thread 2: Sending signal...");
    signal = true;
    notify();
}

}

public class InterThread {
public static void main(String[] args) {
SharedResource resource = new SharedResource();

    Thread t1 = new Thread(() -> {
        resource.waitForSignal();
    });
    Thread t2 = new Thread(() -> {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
        resource.sendSignal();
    });
    t1.start();
    t2.start();
}

}