/* Generated By:JJTree: Do not edit this line. ASTNodeProperties.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

public class ASTNodeProperties extends SimpleNode {

	public ASTNodeProperties(int id) {

		super(id);

	}

	public ASTNodeProperties(CronusGrammarParser p, int id) {

		super(p, id);

	}

	@Override
	public void interpret() {

		// TODO: alguma verificação que seja necessária
		// OBR VARIABLE EQ (Value | CompareValues) (COMMA VARIABLE EQ (Value | CompareValues))* CBR

	}

}
/*
 * JavaCC - OriginalChecksum=48a06f403664d66ecfdfc2759ad1ad73 (do not edit this
 * line)
 */
