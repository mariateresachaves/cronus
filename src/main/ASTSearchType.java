/* Generated By:JJTree: Do not edit this line. ASTSearchType.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

import java.io.PrintWriter;

public class ASTSearchType extends SimpleNode {
	
	public Boolean semantic_error = false;

	public ASTSearchType(int id) {

		super(id);

	}

	public ASTSearchType(CronusGrammarParser p, int id) {

		super(p, id);

	}

	@Override
	public String interpret(String searchType) {

		// SearchType -> OPAR VARIABLE COMMA MoreVars
		
		String[] nodes1 = (symtab.get(jjtGetChild(1).getVal()).toString()).split("\\[");
			
		if (!symtab.containsKey(nodes1[0])) {

			System.out.println(ErrorConstant.FIRST_NODE_NF + jjtGetChild(1).getVal() + ".");
			semantic_error = true;
			return "semantic_error";

		}
		
		if(!symtab.containsKey(jjtGetChild(1).getVal())) {
			
			System.out.println(ErrorConstant.SYMBOL_NOT_FOUND + jjtGetChild(1).getVal() + ".");
			semantic_error = true;
			return "semantic_error";
			
		} 
		
		String res = jjtGetChild(3).interpret("");
		
		if (res.equals("semantic_error")) {
			semantic_error = true;
			return "semantic_error";
		}
		
		else
			return nodes1[0] + "-" + res;
		
		
	}
	
	@Override
	public void toGremlin(PrintWriter writer) {
		
		// SearchType -> OPAR VARIABLE COMMA MoreVars
		
		String[] nodes1 = (symtab.get(jjtGetChild(1).getVal()).toString()).split("\\[");
		String[] index1 = nodes1[1].split("]");
		
		writer.print(index1[0] + ").out.loop(1){");
		jjtGetChild(3).toGremlin(writer);
		
	}

}
/*
 * JavaCC - OriginalChecksum=5b321fcf3da76acbec244789a880317b (do not edit this
 * line)
 */
