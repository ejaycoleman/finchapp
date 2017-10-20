package socketioconnection;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

public class Client {
	
	public static void main(final String[] args) throws URISyntaxException
	   {
	
			Socket socket = IO.socket("http://localhost:3000");
			socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
		
			  @Override
			  public void call(Object... args) {
			    socket.emit("foo", "hi");
			    socket.disconnect();
			  }
		
			}).on("event", new Emitter.Listener() {
		
			  @Override
			  public void call(Object... args) {}
		
			}).on(Socket.EVENT_DISCONNECT, new Emitter.Listener() {
		
			  @Override
			  public void call(Object... args) {}
		
			});
			socket.connect();
	   }
}
