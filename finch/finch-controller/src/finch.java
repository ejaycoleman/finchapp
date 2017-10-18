import edu.cmu.ri.createlab.terk.robot.finch.Finch;


public class finch {
	
	public static void main(String[] args)
    {
	    Finch finchObject = new Finch();
	
	    finchObject.setLED(255, 5, 100);
	    
	    finchObject.quit();
	    System.exit(0);
    }
}
