package com.mycomany.myapp.commandlineargs.print;

public class PrintCommandLineArguments {
	
	static public void main(String[] commandLineArgs) {
		
		
		System.out.println("Length of command line args : " + commandLineArgs.length);
		
		if(commandLineArgs.length > 0 ) {
			System.out.println("args[0] : "+  commandLineArgs[0]);
		} 
		if(commandLineArgs.length > 1 ) {
			System.out.println("args[1] : "+  commandLineArgs[1]);
		}
		
	}
	
}