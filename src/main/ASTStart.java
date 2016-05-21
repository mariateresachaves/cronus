/* Generated By:JJTree: Do not edit this line. ASTStart.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

public class ASTStart extends SimpleNode {

	public ASTStart(int id) {

		super(id);

	}

	public ASTStart(CronusGrammarParser p, int id) {

		super(p, id);

	}

	@Override
	public void interpret() {

		int i, k = jjtGetNumChildren();

		for (i = 0; i < k; i++) {

			System.out.print("Executing:");

			Token first = ((SimpleNode) jjtGetChild(i)).jjtGetFirstToken();
			Token last = ((SimpleNode) jjtGetChild(i)).jjtGetLastToken();

			for (Token t = first; t != null; t = t.next) {

				System.out.print(" " + t);

				if (t == last)
					break;

			}

			System.out.println("");

			jjtGetChild(i).interpret();

		}

	}

}
/*
 * JavaCC - OriginalChecksum=aa3dbe498b8d2adb2099d67e9b4d0fac (do not edit this
 * line)
 */
