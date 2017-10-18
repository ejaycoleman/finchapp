package bridge;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class controller {
	public static void main(final String[] args)
	   {
		  // Instantiating the Finch object
	      Finch myFinch = new Finch();

	      myFinch.setLED(0, 255, 255);
	      myFinch.sleep(5000);
	      // Always end your program with finch.quit()
	      myFinch.quit();
	      System.exit(0);
	    }
}
