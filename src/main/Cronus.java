package main;

public class Cronus {
	
	public static void main(String[] args) throws ParseException {

		/*
		 * CronusGrammarParser parser = new CronusGrammarParser(System.in);
		 * 
		 * SimpleNode root = parser.Start(); root.dump("");
		 */

		CronusGrammarParser parser;

		if (args.length == 1) {

			System.out.println("\n*** Cronus Version 0.3 ***");
			System.out.println("\nReading from file " + args[0] + " . . .\n");

			try {

				parser = new CronusGrammarParser(new java.io.FileInputStream(args[0]));

			} catch (java.io.FileNotFoundException e) {

				System.err.println("Cronus Version 0.3:  File " + args[0] + " not found.");
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
