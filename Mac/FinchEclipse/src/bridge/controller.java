package bridge;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;



import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;




public class controller  {
	
	static Finch myFinch = new Finch();
	
	public static void main(final String[] args) throws URISyntaxException
	   {
		
			
		
		
			Socket socket = IO.socket("http://localhost:3000");
			socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
		
			  @Override
			  public void call(Object... args) {
			    //socket.emit("foo");
			    //socket.disconnect();
			  }
		
			}).on("newuser", new Emitter.Listener() {
				
				
		
			  @Override
			  public void call(Object... args) {
				  System.out.println("received!");
				  controller.finchCode();
			  }
		
			}).on("move-left", new Emitter.Listener() {
				
				  @Override
				  public void call(Object... args) {
					  System.out.println("received!");
					  controller.differentColour();
				  }
			
			}).on(Socket.EVENT_DISCONNECT, new Emitter.Listener() {
		
			  @Override
			  public void call(Object... args) {}
		
			});
			socket.connect();
			
	   }
	
	public static void finchCode() {
		// Instantiating the Finch object
	      //Finch myFinch = new Finch();

	      myFinch.setLED(0, 255, 255);
	      myFinch.sleep(5000);
	      // Always end your program with finch.quit()
	      //myFinch.quit();
	}
	
	public static void differentColour() {
		myFinch.setLED(255, 255, 0);
		myFinch.sleep(5000);
	}
}
