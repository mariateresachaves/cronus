/* Generated By:JJTree: Do not edit this line. ASTNodeDegree.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

public class ASTNodeDegree extends SimpleNode {

	public ASTNodeDegree(int id) {

		super(id);

	}

	public ASTNodeDegree(CronusGrammarParser p, int id) {

		super(p, id);

	}

	@Override
	public void interpret() {

		// TODO: alguma verificação que seja necessária
		// DEGREE CompareValues

		jjtGetChild(1).interpret();

	}

}
/*
 * JavaCC - OriginalChecksum=247899e96275778e2d4dbbedb66da088 (do not edit this
 * line)
 */
