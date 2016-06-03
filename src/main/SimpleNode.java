/* Generated By:JJTree: Do not edit this line. SimpleNode.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

import java.util.Iterator;
import java.util.Set;

public class SimpleNode extends MyNode implements Node {

	protected Node parent;
	protected Node[] children;
	protected int id;
	protected Object value;
	protected CronusGrammarParser parser;
	protected Token firstToken;
	protected Token lastToken;

	public String val;

	public SimpleNode(int i) {
		id = i;
	}

	public SimpleNode(CronusGrammarParser p, int i) {
		this(i);
		parser = p;
	}

	public void jjtOpen() {
	}

	public void jjtClose() {
	}

	public void jjtSetParent(Node n) {
		parent = n;
	}

	public Node jjtGetParent() {
		return parent;
	}

	public void jjtAddChild(Node n, int i) {
		if (children == null) {
			children = new Node[i + 1];
		} else if (i >= children.length) {
			Node c[] = new Node[i + 1];
			System.arraycopy(children, 0, c, 0, children.length);
			children = c;
		}
		children[i] = n;
	}

	public Node jjtGetChild(int i) {
		return children[i];
	}

	public int jjtGetNumChildren() {
		return (children == null) ? 0 : children.length;
	}

	public void jjtSetValue(Object value) {
		this.value = value;
	}

	public Object jjtGetValue() {
		return value;
	}

	public Token jjtGetFirstToken() {
		return firstToken;
	}

	public void jjtSetFirstToken(Token token) {
		this.firstToken = token;
	}

	public Token jjtGetLastToken() {
		return lastToken;
	}

	public void jjtSetLastToken(Token token) {
		this.lastToken = token;
	}

	/*
	 * You can override these two methods in subclasses of SimpleNode to
	 * customize the way the node appears when the tree is dumped. If your
	 * output uses more than one line you should override toString(String),
	 * otherwise overriding toString() is probably all you need to do.
	 */

	public String toString() {
		return CronusGrammarParserTreeConstants.jjtNodeName[id];
	}

	public String toString(String prefix) {
		return prefix + toString();
	}

	/*
	 * Override this method if you want to customize how the node dumps out its
	 * children.
	 */

	public void dump(String prefix) {
		System.out.println(toString(prefix));

		if (children == null)
			System.out.println("\t[" + this.val + "]");

		if (children != null) {
			for (int i = 0; i < children.length; ++i) {
				SimpleNode n = (SimpleNode) children[i];
				if (n != null) {
					n.dump(prefix + " ");
				}
			}
		}
	}

	public String getVal() {
		
		return val;
		
	}
	
	public void printTab() {
		
		System.out.println("");
		System.out.println("--- Symbol Table ---");
		System.out.println("");
		
		Set keys = symtab.keySet();
		Iterator it = keys.iterator();
		
		while(it.hasNext()) {
			String key = (String) it.next();
		    
		    if(symtab.get(key) instanceof Graph)
		    	System.out.println(key + " = Graph");
		    
		    else if(symtab.get(key) instanceof Edge)
		    	System.out.println(key + " = Edge");
		    
		    else if(symtab.get(key) instanceof NodeT)
		    	System.out.println(key + " = Node");
		    
		    else if(symtab.get(key) instanceof NodeList)
		    	System.out.println(key + " = NodeList");
		    else 
		    	System.out.println(key + " = " + symtab.get(key));
		    
		}
		
		System.out.println("");
	}	
	
}

/*
 * JavaCC - OriginalChecksum=846691dd660c78db0f6592619b46c9ed (do not edit this
 * line)
 */
