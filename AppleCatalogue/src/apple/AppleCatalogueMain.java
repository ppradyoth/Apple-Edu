/* Java Project IS4C04 by 4NI19IS062, Pradyoth P from IV Semester ISE 'A' section.
 * Course Code: IS4C04 
 * Course Instructor: Mr. Suhaas KP, Assistant Professor, Department of Information Science and Engineering,
 *   				  The National Institute Of Engineering, Mysuru 570008
 * TOPIC: Apple Education Store Catalogue
 * AIM: To provide users with the contents of the products available in the Apple Education store at student discounts
 *           and to redirect them to the link where they can buy the product directly from Apple Inc.
 * Reason for this Project : Many people are unaware of the presence of Apple's Education Store and hence shy away from Apple Products
 *                           due to their high pricing which is more than the value the product has to offer.
 *                           I am hoping for that to change when people view this program and understand the benefits of Apple Products over 
 *                           others and opt for them if they are interested and get the Student Discounts!
 * Concepts Illustrated:
 * Abstraction- Classes. 	  done
 * Scope and Lifetime of variables.	   done
 * Declaring objects.  	 done
 * Instance Variables of different data types.	  done
 * Constructors/Methods. 	 done
 * 'this' keyword.  		 done
 * Inheritance. 		  done
 * Overloading (Constructors) 	 done
 * Overriding.  				 done
 * Objects as parameters.       done
 * Access control mechanism. 		 done
 * Use of 'super'.				  done
 * Packages.  					done
 * Interfaces.				 done
 * Exception Handling. 				  done
 * Creation of thread to execute a certain process.   done
 * Few string handling mechanisms (optional depending on your project). done*/ 
//The program is divided into two files in two packages in order to illustrate the concept of Packages in Java.
package apple;
import apple2.URLOpener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

interface Init{
 public void infodis();
 public void catalog();
}
class InfoDispl implements Init{
	InfoDispl(){
			 System.out.println("Welcome to Apple Education Store!");
			 System.out.println("Apple and Education\n"
						+ "Inspiring every kind of mind.\n"
						+ "Everyone has their own way of learning and expressing creativity. \n"
						+ "Apple technology and resources empower every kind of educator — and every kind of student — "
						+ "to learn, create and define their own success.\n"
						+ "Let’s move the world forward.");      
		 }
	public void infodis(){
		System.out.println("We will be showcasing a Product catalogue with a link to buy the product at discounted rates for Students.");
	}
	public void catalog() {
		try
		{
		    Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		System.out.println("Education discountes are being offered only Mac and iPads.");
		System.out.println("Suitable accessories will also be displayed alongside the product");
		System.out.println("The Products available are:");
		System.out.println("Macbook Air");
		System.out.println("Macbook Pro");
		System.out.println("Mac Mini");
		System.out.println("Mac Pro");
		System.out.println("iMac");
		System.out.println("iPad");
		System.out.println("iPad Mini");
		System.out.println("iPad Air");
		System.out.println("iPad Pro");
	}
}
class AppleInfo
{
	
    AppleInfo()                           
	{
		System.out.println("Redirecting you to a link where you can purchase the product if it exists on the Apple Education Store");
	}
}
class iPad extends AppleInfo               
{   
    String Model;
    
    iPad()               
    {
    	Model="Null";
    }
    iPad(String y)               
    {   
    	super();
    	this.Model=y;
    }
	void displayinfo()
	{ 
      System.out.println("iPad is a line of tablet computers designed, developed and marketed by Apple Inc., which run the iOS and iPadOS mobile operating systems. \n"
      		+ "The first iPad was released on April 3, 2010; the most recent iPad models are the eighth-generation iPad, released on September 18, 2020; the fifth-generation iPad mini, released on March 18, 2019; \n"
      		+ "the fourth-generation iPad Air, released on October 23, 2020; and the third-generation 11-inch (280 mm) and fifth-generation 12.9-inch (330 mm) iPad Pro, released on May 21, 2021.\n"
      		+ "As of September 2020, Apple has sold more than 500 million iPads, though sales peaked in 2013. It is the most popular tablet computer by sales as of the second quarter of 2020.\n"
      		+ "The user interface is built around the device's multi-touch screen, including a virtual keyboard. All iPads can connect using Wi-Fi; some models also have cellular connectivity. \n"
      		+ "iPads can shoot video, take photos, play music, and perform Internet functions such as web-browsing and emailing. Other functions – games, reference, GPS navigation, social networking, etc. – can be enabled by downloading and installing apps.");
     System.out.println("iPad | YOUR NEXT COMPUTER IS NOT A COMPUTER 😊");
      try
		{
		    Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
      try {
		@SuppressWarnings("unused")
		URLOpener U=new URLOpener("https://www.youtube.com/watch?v=awTP7IUY3uo");
	} catch (IOException | URISyntaxException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      try
		{
		    Thread.sleep(69000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
      
	}
	void display(String y) {
      System.out.println("The Chosen model of iPad is "+y+".");
      try
		{
		    Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
       if(y.equalsIgnoreCase("iPad Mini")) {
		  try {
			@SuppressWarnings("unused")
			URLOpener U=new URLOpener("https://www.apple.com/in-edu/shop/buy-ipad/ipad-mini");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	  }
      else if(y.equalsIgnoreCase("iPad Air")) {
		  try {
			@SuppressWarnings("unused")
			URLOpener U=new URLOpener("https://www.apple.com/in-edu/shop/buy-ipad/ipad-air");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	  }
      else if(y.equalsIgnoreCase("iPad Pro")) {
		  try {
			@SuppressWarnings("unused")
			URLOpener U=new URLOpener("https://www.apple.com/in-edu/shop/buy-ipad/ipad-pro");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	  }
      else if(y.equalsIgnoreCase("iPad")) {
		  try {
			@SuppressWarnings("unused")
			URLOpener U=new URLOpener("https://www.apple.com/in-edu/shop/buy-ipad/ipad-10-2");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	  }
      else {
    	  System.out.println("Invalid Product Entered");
      }
	}
}

class iPadAccessories extends iPad                 
{   
	void displayinfo()
    {   
		try
		{
	    Thread.sleep(4000);
		}
		catch(InterruptedException ex)
		{
	    Thread.currentThread().interrupt();
		}
    	System.out.println("The iPad can be combined with the Apple Pencil, Smart Folio, Smart Keyboard Folio and the Magic Keyboard.");
    	try
		{
		    Thread.sleep(3000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
    	 try {
 			@SuppressWarnings("unused")
 			URLOpener U=new URLOpener("https://www.apple.com/in-edu/shop/ipad/accessories");
 		} catch (IOException e) {
 			e.printStackTrace();
 		} catch (URISyntaxException e) {
 			e.printStackTrace();
 		}
    }
}

class Mac extends AppleInfo       
{   
    String Model;
	Mac()
    {
    	Model="Null";
    }
    Mac(String x)
    {
    	super();                                   
    	this.Model=x;
    }
    void displayinfo() 
	{ 
      System.out.println("The Macintosh (presently Mac) is a series of several lines of personal computers designed, developed, and marketed by Apple Inc. \n"
    		            +"Apple has developed a series of Macintosh operating systems. The current version being Mac OS X 11 Big Sur\n"
    		             +"The Macintosh family of computers has used a variety of different CPU architectures since its introduction. Originally they used the Motorola 68000 series of microprocessors. In the mid-1990s they transitioned to PowerPC processors, \n"
    		             + "and again in the mid-2000s they began to use 32- and 64-bit Intel x86 processors. Apple began transitioning CPU architectures to its own Apple silicon for use in the Macintosh beginning in 2020.");
        System.out.println("Behind the Mac — Greatness 😎");
      try
		{
		    Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
      try {
		@SuppressWarnings("unused")
		URLOpener U=new URLOpener("https://www.youtube.com/watch?v=b3VcGKv9Cfw");
	} catch (IOException | URISyntaxException e) {
		e.printStackTrace();
	}
      try
		{
		    Thread.sleep(65000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
      
	}
	void display(String x) {
      System.out.println("The Chosen model of Mac is "+x+".");
      try
		{
		    Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
      if(x.equalsIgnoreCase("Macbook Air")) {
		  try {
			@SuppressWarnings("unused")
			URLOpener U=new URLOpener("https://www.apple.com/in-edu/shop/buy-mac/macbook-air");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	  }
      else if(x.equalsIgnoreCase("Macbook Pro")) {
		  try {
			@SuppressWarnings("unused")
			URLOpener U=new URLOpener("https://www.apple.com/in-edu/shop/buy-mac/macbook-pro");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	  }
      else if(x.equalsIgnoreCase("iMac")) {
		  try {
			@SuppressWarnings("unused")
			URLOpener U=new URLOpener("https://www.apple.com/in-edu/shop/buy-mac/imac");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	  }
      else if(x.equalsIgnoreCase("Mac Pro")) {
		  try {
			@SuppressWarnings("unused")
			URLOpener U=new URLOpener("https://www.apple.com/in-edu/shop/buy-mac/mac-pro");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	  }
	  else if(x.equalsIgnoreCase("Mac Mini")) {
		  try {
			@SuppressWarnings("unused")
			URLOpener U=new URLOpener("https://www.apple.com/in-edu/shop/buy-mac/mac-mini");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	  }
//	  else {
//    	  System.out.println("Invalid Product Entered");
//      }
}
}
class MacAccessories extends Mac               
	{    
		void displayinfo()
	    {  try
		  {
		    Thread.sleep(4000);
		  }
		  catch(InterruptedException ex)
		   {
		    Thread.currentThread().interrupt();
		   }
	    	System.out.println("The Mac can be combined with the Magic Mouse 2, Magic Keyboard, Magic Trackpad and numerous other Adapters available.");
	    	try
			{
			    Thread.sleep(3000);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
	    	 try {
	 			@SuppressWarnings("unused")
	 			URLOpener U=new URLOpener("https://www.apple.com/in-edu/shop/mac/accessories");
	 		} catch (IOException e) {
	 			e.printStackTrace();
	 		} catch (URISyntaxException e) {
	 			e.printStackTrace();
	 		}
	    }
	}

public class AppleCatalogueMain
{  	
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
		InfoDispl I=new InfoDispl();
		I.infodis();
		I.catalog();
		for(int i=0;i<100;i++) {
		System.out.println("Enter the Name of the Product you are interested in");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String S=sc.nextLine();
		if(S.toUpperCase().startsWith("MAC") || S.equalsIgnoreCase("iMac")) {
			Mac M1=new Mac(S);
			M1.displayinfo();
			M1.display(S);
		    MacAccessories M2=new MacAccessories();
		    M2.displayinfo();
		}
		else if(S.toUpperCase().startsWith("IPAD"))  {
		iPad A1=new iPad(S);
		A1.displayinfo();
		A1.display(S);
		iPadAccessories A2=new iPadAccessories();
		A2.displayinfo();
		}
		else
		{ System.out.println("Invalid Product Entered");
		}
		System.out.println("Would you like to view another Product? (Reply with a Yes/No)");
		String P=sc.next();
		if(P.equalsIgnoreCase("NO")) 
		{ i=101;
//		sc.close();
		}
		S="NULL";
		}
		URLOpener L=new URLOpener();
		try {
			L.Thanks();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
}