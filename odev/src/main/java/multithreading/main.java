package multithreading;

public class main {
	 public static void main( String[] args )
	    {
	    	
	      System.out.println("Main thread is starting");
	          
	          app App = new app("thread");
	          Thread thread = new Thread(App);
	        
	          thread.start();
	          int i;
	          for ( i = 0; i < 20; i++) {
	              System.out.print("-");
	              try {
	                  Thread.sleep(100);
	              } catch (InterruptedException e) {
	                  System.out.println(" Thread kesintiye ugradi.!");
	              }
	          }
	          System.out.println(" Thread sonlandý:)");
	    	
	    	
	      

	    	
	      }

}
