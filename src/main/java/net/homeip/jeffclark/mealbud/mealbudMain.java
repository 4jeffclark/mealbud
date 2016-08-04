
package net.homeip.jeffclark.mealbud;

import java.io.FileNotFoundException;

import net.homeip.jeffclark.popJava.consoleio.popConsole;
import net.homeip.jeffclark.popJava.fileio.popFile;

public class mealbudMain {

	public static void main(String[] args) throws FileNotFoundException {

		//popConsole Test	    
	    String userinput = null;
	    popConsole console = new popConsole();	    
	    
	    userinput = console.prompt("You should tell me your name: ");
	    System.out.println("Hello there " + userinput + ". Hope you have a good day");
	    
        
	    
	    //File Test
        popFile file = new popFile("\\data\\data.csv");
        String line = "duh";
        String mystring = "duh";


	    System.out.print(file.getFilename()+" ");
	    System.out.println(file.getStatus());
	    mystring = file.getCSV();
	    System.out.println(mystring);
	    mystring = file.getCSV();
	    System.out.println(mystring);

	    //while ((csv=file.getCSV()) !="EOF"){
	    //	System.out.print(csv+" ");
	    //	int i = Integer.parseInt(csv);
	    //	System.out.println(i);
	   // }
	  //  System.out.print(file.getFilename()+" ");
	   // System.out.println(file.getStatus());/////////////////////////////////////////
	    //popFile file2 = new popFile();
    	//line = "duh";
        //csv = "duh";

	    //System.out.println(file2.getStatus());
       // file2.openCSV("\\data\\data2.txt");
	   // System.out.print(file2.getFilename()+" ");
	   // System.out.println(file2.getStatus());
	    
	    //while ((csv=file2.getCSV()) !="EOF"){
	    	//csv=file2.getCSV();
	    //	System.out.print(csv+" ");
	    //	int i = Integer.parseInt(csv);
	    //	System.out.println(i);

	   // }
        
	    //System.out.print(file2.getFilename()+" ");
	   // System.out.println(file2.getStatus());


        }

	
}
