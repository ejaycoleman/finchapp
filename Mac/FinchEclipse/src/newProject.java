import javax.swing.JOptionPane;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;


public class newProject {
	public static void main(String args[])
    {
                 String s = "";

                 do
                 {

                               s = FinchMenu();
 
                               if (s.equals("Option One")) RunLightTest(s);
                               
                               
                 } while (!(s.equals("Quit")));
                 System.out.println("Exiting DoesMyFinchWork...");

    }
	
    private static String FinchMenu()
    {
                 Object[] possibilities = {"Option One", "Quit"};
                 String s = (String)JOptionPane.showInputDialog(null,"Dr Swift's Splendid Finch Test\n++++++++++++++++++++++++\nChoose a test from:\n\n","Week Zero Laboratory",JOptionPane.PLAIN_MESSAGE, null,possibilities,"Light Test");
                 if (s == null || s.length() == 0) s = "Quit";
                 return(s);
    }
    
    private static void RunLightTest(String s)
    {
                 System.out.println("\n"+"Running: "+s+"\n");
                 		
                
                 
                 System.out.println("ok");
    }
}
