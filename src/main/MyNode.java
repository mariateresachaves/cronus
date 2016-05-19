package main;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Hashtable;

/**
 * Specialised node.
 */
public class MyNode {
	/** Symbol table */
	protected static Hashtable symtab = new Hashtable();

	/** Stack for calculations. */
	protected static Object[] stack = new Object[1024];
	protected static int top = -1;

	/**
	 * @throws UnsupportedOperationException
	 *             if called
	 */
	public void interpret() {
		throw new UnsupportedOperationException(); // It better not come here.
	}

	protected static Writer out = new PrintWriter(System.out);
	protected static Reader in = new InputStreamReader(System.in);

	/**
	 * @param in
	 *            the input to set
	 */
	public static void setIn(Reader in) {
		MyNode.in = in;
	}

	/**
	 * @param out
	 *            the output to set
	 */
	public static void setOut(Writer out) {
		MyNode.out = out;
	}

}