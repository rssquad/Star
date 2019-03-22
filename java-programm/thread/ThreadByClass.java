 class ThreadByClass {
    public static void main(String[] args) throws InterruptedException {
       
        for (int i = 0; i < 10; i++) {
            System.out.println("It's Main Class");
        }

        myThreadByClass mt = new myThreadByClass();
        test mt2 = new test();
        mt.start();
        mt2.start();
        // mt2.join();
        // mt.join();
    }
}

class myThreadByClass extends Thread {

      public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("It's Child class" + i);
        }

    }
}

class test extends Thread {

   
   
    public void run() {
      for (int i = 0; i < 10; i++) {
          System.out.println("It's 2nd Child class" + i);
      }
      try {
        myThreadByClass mt2 = new myThreadByClass();
        mt2.join();
    } catch (Exception e) {
        //TODO: handle exception
    }
  }
  
}