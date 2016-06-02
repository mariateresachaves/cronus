package main;

import java.io.PrintWriter;
import java.util.Locale;

public class Cronus {

	public static void main(String[] args) throws ParseException {

		/*
		 * CronusGrammarParser parser = new CronusGrammarParser(System.in);
		 * 
		 * SimpleNode root = parser.Start(); root.dump("");
		 */

		CronusGrammarParser parser;
		
		if (args.length == 1) {

			System.out.println("\n*** Cronus Version 0.5 ***");
			System.out.println("\nReading from file " + args[0] + " . . .\n");

			try {

				parser = new CronusGrammarParser(new java.io.FileInputStream(args[0]));

			} catch (java.io.FileNotFoundException e) {

				System.err.println("Cronus Version 0.5:  File " + args[0] + " not found.");
				return;

			}

		} else {

			System.err.println(ErrorConstant.USAGE_ERROR);
			return;

		}

		try {

			parser.Start();
			parser.jjtree.rootNode().interpret();
			parser.jjtree.rootNode().printTab();
			
			PrintWriter writer = new PrintWriter("../gremlin.txt", "UTF-8");

			parser.jjtree.rootNode().toGremlin(writer);
			
			writer.close();
			
			// Open file with the generated Gremlin code
			
			String os = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
			
			if ((os.indexOf("mac") >= 0) || (os.indexOf("darwin") >= 0))
				Runtime.getRuntime().exec("open ../gremlin.txt");
			
			else if (os.indexOf("win") >= 0)
				Runtime.getRuntime().exec("notepad.exe ../gremlin.txt");
			
			else if (os.indexOf("nux") >= 0)
				Runtime.getRuntime().exec("edit ../gremlin.txt");

		} catch (ParseException e) {

			System.err.println(ErrorConstant.PARSE_ERROR);
			e.printStackTrace();

		} catch (Exception e1) {

			System.err.println(ErrorConstant.TREE_BUILDING_ERROR);
			e1.printStackTrace();

		}

		System.out.println("");

	}

}
