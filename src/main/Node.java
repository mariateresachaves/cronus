/* Generated By:JJTree: Do not edit this line. Node.java Version 4.3 */
/* JavaCCOptions:MULTI=false,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

import java.io.PrintWriter;

/* All AST nodes must implement this interface.  It provides basic
   machinery for constructing the parent and child relationships
   between nodes. */

public
interface Node {

  /** This method is called after the node has been made the current
    node.  It indicates that child nodes can now be added to it. */
  public void jjtOpen();

  /** This method is called after all the child nodes have been
    added. */
  public void jjtClose();

  /** This pair of methods are used to inform the node of its
    parent. */
  public void jjtSetParent(Node n);
  public Node jjtGetParent();

  /** This method tells the node to add its argument to the node's
    list of children.  */
  public void jjtAddChild(Node n, int i);

  /** This method returns a child node.  The children are numbered
     from zero, left to right. */
  public Node jjtGetChild(int i);

  /** Return the number of children the node has. */
  public int jjtGetNumChildren();
  
  public String getVal();
  
  /** Interpret method */
  public void interpret();
  public String interpret(String graph);
  
  /** Cronus code to Gremlin code */
  public void toGremlin(PrintWriter writer);
  
  public void printTab();
  
}
/* JavaCC - OriginalChecksum=9ea0256ca3a9f9df95a49ed6569f6191 (do not edit this line) */
