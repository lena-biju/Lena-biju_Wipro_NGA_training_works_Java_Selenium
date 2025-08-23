package pack1;


//using implemenets

class MyRun implements Runnable {

  public void run() {

      for (int i = 1; i <= 5; i++) {

          System.out.println(Thread.currentThread().getName() + " - Value: " + i);

          try {

              Thread.sleep(2000); 

          } catch (InterruptedException e) {

              System.out.println(e);

          }

      }

  }

  public static void main(String[] args) {

      MyRun runnable = new MyRun();//obj

      Thread t1 = new Thread(runnable, "Thread-1");//obj passed and name also

      Thread t2 = new Thread(runnable, "Thread-2");

//The Runnable interface does not have a start() method, so we require to create the object of the Thread class

      t1.start();

      t2.start();

  }

}

