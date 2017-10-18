package bridge;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;



public class controller  {

	
	
	public static void main(final String[] args)
	   {
		
		
		
		
		/*socket = new SocketIO();
		socket.connect("http://127.0.0.1:3001/", this);*/
		
		
		
		
		
		
			controller.finchCode();
	      System.exit(0);
	    }
	
	/*public void BasicExample() throws Exception {
		socket = new SocketIO();
		socket.connect("http://127.0.0.1:3001/", this);

		// Sends a string to the server.
		socket.send("Hello Server");

		// Sends a JSON object to the server.
		socket.send(new JSONObject().put("key", "value").put("key2",
				"another value"));

		// Emits an event to the server.
		socket.emit("event", "argument1", "argument2", 13.37);
	}*/
	
	public static void finchCode() {
		// Instantiating the Finch object
	      Finch myFinch = new Finch();

	      myFinch.setLED(0, 255, 255);
	      myFinch.sleep(5000);
	      // Always end your program with finch.quit()
	      myFinch.quit();
	}
}
