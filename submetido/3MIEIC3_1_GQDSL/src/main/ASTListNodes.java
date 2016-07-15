/* Generated By:JJTree: Do not edit this line. ASTListNodes.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

import java.io.PrintWriter;

public class ASTListNodes extends SimpleNode {
	
	public Boolean semantic_error = false;

	public ASTListNodes(int id) {

		super(id);

	}

	public ASTListNodes(CronusGrammarParser p, int id) {

		super(p, id);

	}

	@Override
	public String interpret(String listNodes) {
		
		String error;
		
		// with declaration
		if (jjtGetChild(0).getVal() == null) {

			if (jjtGetNumChildren() < 4)
				error = jjtGetChild(0).interpret("");

			else {
				
				String graph = jjtGetChild(2).interpret("");
				error = jjtGetChild(0).interpret(graph);

			}
			
			
			if(error.equals("semantic_error")) {
				
				semantic_error = true;
				return "semantic_error";
				
			}

		//without declaration
		} else {

			if (symtab.containsKey(jjtGetChild(0).getVal())) {

				if (!(symtab.get(symtab.get(jjtGetChild(0).getVal())) instanceof Graph)) {

					System.out.println(ErrorConstant.INCOMPATIBLE_TYPES + jjtGetChild(0).getVal() + " is not of type NodeList.");
					semantic_error = true;
					return "semantic_error";

				} else {
					
					String graph = jjtGetChild(2).interpret("");
					
					if(graph.equals("semantic_error")) {
						
						semantic_error = true;
						return "semantic_error";
						
					}
					
					symtab.put(jjtGetChild(0).getVal(), graph);

				}

			} else {

				System.out.println(ErrorConstant.SYMBOL_NOT_FOUND + jjtGetChild(0).getVal() + ".");
				semantic_error = true;
				return "semantic_error";

			}

		}
		
		return "";

	}

	@Override
	public void toGremlin(PrintWriter writer) {
		
		if(!semantic_error) {
			
			// num_filhos: 4 - NodeListDec EQ ListNodeRight SCOL
			// 			   2 - NodeListDec SCOL
			//			   4 - VARIABLE EQ ListNodeRight SCOL
			
			if(jjtGetNumChildren() == 4) {
				
				// NodeListDec EQ ListNodeRight SCOL
				if(jjtGetChild(0).getVal() == null) {
					
					// NodeListDec
					jjtGetChild(0).toGremlin(writer);
					
				}
				// VARIABLE EQ ListNodeRight SCOL
				else {
					
					writer.print(jjtGetChild(0).getVal());
					
				}
				
				//ListNodeRight
				jjtGetChild(2).toGremlin(writer);
				
			}
			
		}
		
	}
}
/*
 * JavaCC - OriginalChecksum=8735df251d00f45445747c1ebe0ed7b0 (do not edit this
 * line)
 */