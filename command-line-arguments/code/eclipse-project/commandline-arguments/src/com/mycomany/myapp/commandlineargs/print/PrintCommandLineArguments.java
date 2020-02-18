package com.mycomany.myapp.commandlineargs.print;

public class PrintCommandLineArguments {

	public static void main(String[] args) {
		System.out.println("args length : " + args.length);

		if (args.length > 0) {
			System.out.println("args[0] : " + args[0]);
		}

		if (args.length > 1) {
			System.out.println("args[1] : " + args[1]);
		}
	}

}
