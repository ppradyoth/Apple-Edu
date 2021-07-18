package apple2;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
class NewThread implements Runnable{
	Thread t;
	NewThread() 
	  {
			  	t = new Thread("Demo Thread");						
			  	System.out.println("Redirecting you to Apple's Education Website shortly");
			    t.start(); 
	  }
   public void run(NewThread N) {
		   Desktop d = Desktop.getDesktop();
	   try
		{
		    Thread.sleep(1000);
		    d.browse(new URI("https://www.youtube.com/user/Apple") );
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
	   catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		try
		{
		    Thread.sleep(1000);
		    d.browse(new URI("https://www.apple.com/in/education/") );
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		 catch (IOException | URISyntaxException e) {
				e.printStackTrace();
			}
	}
@Override
public void run() {
}
}
public class URLOpener
{   public URLOpener() {};
    public URLOpener(String y) throws IOException, URISyntaxException{
    	Desktop d = Desktop.getDesktop();
		d.browse(new URI(y) );
    }
	public void Thanks() throws IOException, URISyntaxException {
		@SuppressWarnings("resource")
		Scanner po = new Scanner(System.in);
		System.out.println("Enter 1 to visit Apple's Official Website and Youtube Channel");
		double z = po.nextDouble();
		if(z==1)
		{
			NewThread N=new NewThread();
			N.run(N);
		}
		else
		{
				System.out.println("You chose not to visit the website.");
				System.out.println("We hope the Information provided by us has helped you choose the Product you need");
		}
	    System.out.println("Rate your Experience on a scale ranging from 1 to 5 with 1 being the lowest and 5 being the highest.");
	    int x = po.nextInt();
	    if(x==1 && z!=1) {
	    	System.out.println("Redirecting you again to Apple's Education Website for you to get more Information regarding the same");
			Desktop d = Desktop.getDesktop();
			d.browse(new URI("file:///Users/ppradyoth/Documents/IV%20SEMESTER/Java%20Lab%20Programs/JAVA%20PROJECT/photos%20for%20java%20project/WHYPA.jpeg") ); 
//			d.browse(new URI("https://ibb.co/H2bV8dF"));
			try
			{
			    Thread.sleep(3000);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
			d.browse(new URI("file:///Users/ppradyoth/Documents/IV%20SEMESTER/Java%20Lab%20Programs/JAVA%20PROJECT/photos%20for%20java%20project/reaction.jpeg") );
//     		d.browse(new URI("https://ibb.co/X8YkC00"));
     		
			try
			{
			    Thread.sleep(5000);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}d.browse(new URI("https://www.youtube.com/watch?v=7ODcC5z6Ca0") );  //My reaction to your Rating ;-;
			try
			{
			    Thread.sleep(20000);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
			d.browse(new URI("https://www.apple.com/in/education/") );
	    }
	    else {
	    	System.out.println("Thank you for your Honest Feedback!");
	    }
	      System.out.println("If you want to send us suggestions, Enter 1");
    	  int s1 = po.nextInt();
    	  if(s1==1) {
    	  Desktop d = Desktop.getDesktop();
    	  d.browse(new URI("mailto:ppradyoth@ieee.org") );
    	  }
    	    Desktop d = Desktop.getDesktop();
	        System.out.println("I would like to Thank NIE's ISE Department and hence, Redirecting you to our College's ISE Department's website");
	        try
			{
			    Thread.sleep(6000);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
	        d.browse(new URI("https://nie.ac.in/department/information-science-and-engineering-department/") );
	    	System.out.println("You have reached the end of the Application");
	    	System.out.println("Special Thanks to IS4C04 (OOPJ) Faculty Mr.Suhaas KP for his valuable guidance and support throughout the semester");
	    	System.out.println("Developed with 🧠 and ❤️️ by Pradyoth P ");
	}
}
			
