/* Generated By:JJTree: Do not edit this line. ASTCompareValues.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

import java.io.PrintWriter;

public class ASTCompareValue extends SimpleNode {

	public Boolean semantic_error = false;
	public String label;

	public ASTCompareValue(int id) {

		super(id);

	}

	public ASTCompareValue(CronusGrammarParser p, int id) {

		super(p, id);

	}
	
	@Override
	public void setLabel(String new_label){
		label = new_label;
	}

	@Override
	public void interpret() {

		// TODO: alguma verificação que seja necessária

	}

	@Override
	public void toGremlin(PrintWriter writer) {

		// CompareValues -> IntervalBracket Value COMMA Value IntervalBracket
		// | COMP Value
		
		if(!semantic_error) {
			
		
			int k = jjtGetNumChildren();
			
			if (k == 2) {
				
				writer.print(jjtGetChild(0).getVal().toString() + " ");
				jjtGetChild(1).toGremlin(writer);
				
			} else {
			
				if (jjtGetChild(0) instanceof ASTOpenSquareBracket)
					writer.print(" >= ");
	
				else if (jjtGetChild(0) instanceof ASTCloseSquareBracket) 
					writer.print(" > ");
	
				jjtGetChild(1).toGremlin(writer);
				writer.print("; it." + label);
				
				if (jjtGetChild(4) instanceof ASTCloseSquareBracket)
					writer.print(" <= ");
	
				else if (jjtGetChild(4) instanceof ASTOpenSquareBracket) 
					writer.print(" < ");

				jjtGetChild(3).toGremlin(writer);
				
			}
			
		}
		
	}
	
}
/*
 * JavaCC - OriginalChecksum=17f3e1f1310d8b3c78d9c2655ab419dc (do not edit this
 * line)
 */
