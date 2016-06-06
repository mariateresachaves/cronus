/* Generated By:JJTree: Do not edit this line. ASTNodeListDec.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

import java.io.PrintWriter;

public class ASTNodeListDec extends SimpleNode {
	
	public Boolean semantic_error = false;

	public ASTNodeListDec(int id) {

		super(id);

	}

	public ASTNodeListDec(CronusGrammarParser p, int id) {

		super(p, id);

	}

	@Override
	public String interpret(String graph) {

		// NodeList
		if (symtab.containsKey(jjtGetChild(3).getVal())) {

			System.err.println(ErrorConstant.DUPLICATE_ENTRY + jjtGetChild(3).getVal() + " of type NodeList.");
			semantic_error = true;
			return null;

		} else{
			
			if (graph.equals("")){
			
				symtab.put(jjtGetChild(3).getVal(), new NodeList());
				return "";
				
			} else {
				
				symtab.put(jjtGetChild(3).getVal(), graph);
				return "";
				
			}
			
		}

	}

	@Override
	public void toGremlin(PrintWriter writer) {
	
		if(!semantic_error)
			writer.print(jjtGetChild(3).getVal());

	}
	
}
/*
 * JavaCC - OriginalChecksum=6243a46c048ed58c0da12f0e90102dc9 (do not edit this
 * line)
 */
