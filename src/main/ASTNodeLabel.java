/* Generated By:JJTree: Do not edit this line. ASTNodeLabel.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

public class ASTNodeLabel extends SimpleNode {
	
	public Boolean semantic_error = false;

	public ASTNodeLabel(int id) {

		super(id);

	}

	public ASTNodeLabel(CronusGrammarParser p, int id) {

		super(p, id);

	}

	@Override
	public void interpret() {

		// TODO: alguma verificação que seja necessária
		// LABEL EQ Value
		
		jjtGetChild(2).interpret();

	}

}
/*
 * JavaCC - OriginalChecksum=138c5b7e041feaa94c5389c40eb2ea32 (do not edit this
 * line)
 */
