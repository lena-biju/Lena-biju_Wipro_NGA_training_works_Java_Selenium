package pack1;

class Cntrl_2 extends Thread {
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(2000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
 
    public static void main(String[] args) {
        System.out.println("Main thread starts….");
        Cntrl_2 t1 = new Cntrl_2();
        Cntrl_2 t2 = new Cntrl_2();
        Cntrl_2 t3 = new Cntrl_2();
        

 
        t1.setName("Worker-1");
        t2.setName("Worker-2");
        t3.setName("Worker-3");
 
        System.out.println("Starting threads...");
        
        t1.start();
        t2.start();
        t3.start();
        
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
 
        // Check if threads are alive
        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());
        System.out.println("Is " + t3.getName() + " alive? " + t3.isAlive());
 
        System.out.println("Main thread finished.");
    }
}