package multithreading;

public class main implements Runnable {

	 public static void main(String[] args) {

	  Thread thread = new Thread();
	  thread.start();
	  try {

	   int i;
	   for (i = 1; i < 16; i++) {

	    Thread.sleep(400);
	    thread.setName(i + ". string");
	    System.out.println(thread.getName());

	   }
	  } catch (InterruptedException e) {
	   System.out.println(e);
	  }

	 }

	 public void run() {
	  // TODO Auto-generated method stub
	 }

	}

