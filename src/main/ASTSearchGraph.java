/* Generated By:JJTree: Do not edit this line. ASTSearchGraph.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

public class ASTSearchGraph extends SimpleNode {

	public ASTSearchGraph(int id) {

		super(id);

	}

	public ASTSearchGraph(CronusGrammarParser p, int id) {

		super(p, id);

	}

	@Override
	public void interpret() {

		// TODO: VARIABLE DOT SearchType OPAR VARIABLE COMMA VARIABLE MoreOptions CPAR SCOL
		
		int k=jjtGetNumChildren();
		
		System.out.println("");
		System.out.println("[SearchGraph] Tenho " + k + "filhos.\n");
				
		System.out.println("Os filhos são: ");
				
		while(k>0) {
			System.out.println(k + " - " + jjtGetChild(k-1).getVal());
			k--;
		}
		
		System.out.println("");
		
		//jjtGetChild(2).interpret();
		//jjtGetChild(7).interpret();
		
	}

}
/*
 * JavaCC - OriginalChecksum=846292d1a956497664ce7a1a19b15629 (do not edit this
 * line)
 */
