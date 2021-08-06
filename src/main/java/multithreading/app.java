package multithreading;

public class app implements Runnable {
	private String appName;
	public app(String name) {
		this.appName=name;
	}
	
	public void run() {
		System.out.println(appName+"is starting.");
		for(int i=0;i<20;i++) {
			try {
				Thread.sleep(400);
				System.out.println("In "+appName+"count is "+ i);
			}
			catch (InterruptedException e) {
                System.out.println(appName + " is interrupted");
            }
		}
		  System.out.println(appName + " is terminating");
		
	}
		
	}

	

	


