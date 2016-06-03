/* Generated By:JJTree: Do not edit this line. ASTGetNode.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

import java.io.PrintWriter;

public class ASTGetNode extends SimpleNode {

	public ASTGetNode(int id) {

		super(id);

	}

	public ASTGetNode(CronusGrammarParser p, int id) {

		super(p, id);

	}

	@Override
	public void interpret() {

		// NODE? VARIABLE EQ VARIABLE OSQBR INTEGER CSQBR SCOL
		if (jjtGetNumChildren() == 8) {

			if (symtab.containsKey(jjtGetChild(1).getVal())) {

				System.err.println(ErrorConstant.DUPLICATE_ENTRY + jjtGetChild(1).getVal() + " of type Node.");
				return;

			} else {
				String graph = symtab.get(jjtGetChild(3).getVal()).toString();
				String index = jjtGetChild(5).getVal().toString();
				symtab.put(jjtGetChild(1).getVal(), graph + ".v(" + index + ")");
			}
			// Right side
			if (symtab.containsKey(jjtGetChild(3).getVal())) {

				if (!(symtab.contains(symtab.get(jjtGetChild(3).getVal())))) {

					System.out.println(
							ErrorConstant.INCOMPATIBLE_TYPES + jjtGetChild(3).getVal() + " is not of type Node[].");
					return;

				} else {

				}

			} else {

				System.out.println(ErrorConstant.SYMBOL_NOT_FOUND + jjtGetChild(3).getVal() + ".");
				return;

			}

			// INTEGER must be >= 0
			if (Integer.parseInt(jjtGetChild(5).getVal()) < 0) {

				System.out.println(ErrorConstant.NODE_LIST_INDEX);

			}

		}

		// VARIABLE EQ VARIABLE OSQBR INTEGER CSQBR SCOL
		else {

			// Left side
			if (symtab.containsKey(jjtGetChild(0).getVal())) {

				if (!(symtab.contains(symtab.get(jjtGetChild(0).getVal().toString().split("\\.")[0])))) {

					System.out.println(
							ErrorConstant.INCOMPATIBLE_TYPES + jjtGetChild(0).getVal() + " is not of type Node.");
					return;

				} else {
					
					String graph = symtab.get(jjtGetChild(2).getVal()).toString();
					String index = jjtGetChild(4).getVal().toString();
					symtab.put(jjtGetChild(0).getVal(), graph + ".v(" + index + ")");
				}

			} else {

				System.out.println(ErrorConstant.SYMBOL_NOT_FOUND + jjtGetChild(0).getVal() + ".");
				return;

			}

			// Right side
			if (symtab.containsKey(jjtGetChild(2).getVal())) {

				if (!(symtab.contains(symtab.get(jjtGetChild(2).getVal())))) {

					System.out.println(
							ErrorConstant.INCOMPATIBLE_TYPES + jjtGetChild(2).getVal() + " is not of type Node[].");
					return;

				} else {
					
				}

			} else {

				System.out.println(ErrorConstant.SYMBOL_NOT_FOUND + jjtGetChild(2).getVal() + ".");
				return;

			}

			// INTEGER must be >= 0
			if (Integer.parseInt(jjtGetChild(4).getVal()) < 0) {

				System.out.println(ErrorConstant.NODE_LIST_INDEX);

			}

		}

	}

	@Override
	public void toGremlin(PrintWriter writer){
		// NODE? VARIABLE EQ VARIABLE OSQBR INTEGER CSQBR SCOL
		String graph;
		String node;
		String index;
		if (jjtGetNumChildren() == 7){
			graph = symtab.get(jjtGetChild(2).getVal()).toString();
			node = jjtGetChild(0).getVal().toString();
			index = jjtGetChild(4).getVal().toString();
		} else {
			graph = symtab.get(jjtGetChild(3).getVal()).toString();
			node = jjtGetChild(1).getVal().toString();
			index = jjtGetChild(5).getVal().toString();
		}
		
		writer.println(node + " = " + graph + ".v(" + index + ")");
		
		/*int k = jjtGetNumChildren();
		
		System.out.println("");
		System.out.println("Tenho " + k + " filhos.");
		
		System.out.println("Os filhos sao: ");
		
		while(k>0){
			System.out.println(k-1 + " - " + jjtGetChild(k-1).getVal());
			k--;
		}
		System.out.println("");*/
	}
}
/*
 * JavaCC - OriginalChecksum=cded3144411652adc8992d54d573c4b0 (do not edit this
 * line)
 */
