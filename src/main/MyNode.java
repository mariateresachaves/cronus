package main;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Specialised node.
 */
public class MyNode {
	/** Symbol table */
	protected static Hashtable symtab = new Hashtable();

	/** Stack for calculations. */
	protected static Object[] stack = new Object[1024];
	protected static int top = -1;

	public void interpret() {
		throw new UnsupportedOperationException(); // It better not come here.
	}
	public String interpret(String graph) {
		throw new UnsupportedOperationException(); // It better not come here.
	}

	protected static Writer out = new PrintWriter(System.out);
	protected static Reader in = new InputStreamReader(System.in);

	public static void setIn(Reader in) {
		MyNode.in = in;
	}

	public static void setOut(Writer out) {
		MyNode.out = out;
	}
	
	public void toGremlin(PrintWriter writer) {
		throw new UnsupportedOperationException(); // It better not come here.
	}
	
	public void setLabel(String new_label) {
	}
}