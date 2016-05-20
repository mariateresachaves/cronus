package main;

import javax.swing.RootPaneContainer;

public class Cronus {
	public static void main(String[] args) throws ParseException {
		
		/*CronusGrammarParser parser = new CronusGrammarParser(System.in);

		SimpleNode root = parser.Start();
		root.dump("");*/

		CronusGrammarParser parser;

		if (args.length == 1) {
			System.out.println("Cronus Version 0.2:  Reading from file " + args[0] + " . . . \n");
			try {
				parser = new CronusGrammarParser(new java.io.FileInputStream(args[0]));
			} catch (java.io.FileNotFoundException e) {
				System.out.println("Cronus Version 0.2:  File " + args[0] + " not found.");
				return;
			}
		} else {
			System.out.println("Cronus Version 0.2:  Usage: java Cronus <inputfile>");
			return;
		}
		try {
			parser.Start();
			parser.jjtree.rootNode().interpret();
			parser.jjtree.rootNode().printTab();
			
		} catch (ParseException e) {
			System.out.println("Cronus Version 0.2:  Encountered errors during parse.");
			e.printStackTrace();
		} catch (Exception e1) {
			System.out.println("Cronus Version 0.2:  Encountered errors during interpretation/tree building.");
			e1.printStackTrace();
		}
	}
	
}
