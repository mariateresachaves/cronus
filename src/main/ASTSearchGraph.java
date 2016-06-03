/* Generated By:JJTree: Do not edit this line. ASTSearchGraph.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package main;

import java.io.PrintWriter;

public class ASTSearchGraph extends SimpleNode {

	public ASTSearchGraph(int id) {

		super(id);

	}

	public ASTSearchGraph(CronusGrammarParser p, int id) {

		super(p, id);

	}

	@Override
	public void interpret() {

		// NodeListDec EQ VARIABLE DOT SearchType OPAR VARIABLE COMMA VARIABLE
		// MoreOptions CPAR SCOL
		String[] graph1 = (symtab.get(jjtGetChild(6).getVal()).toString()).split("\\.");
		String[] graph2 = (symtab.get(jjtGetChild(8).getVal()).toString()).split("\\.");

		if (jjtGetChild(0) instanceof ASTNodeListDec) {

			if (!graph1[0].equals(jjtGetChild(2).getVal().toString())) {

				System.out.println(ErrorConstant.FIRST_NODE_NF + jjtGetChild(2).getVal() + ".");
				return;

			} else {

				if (!graph2[0].equals(jjtGetChild(2).getVal().toString())) {

					System.out.println(ErrorConstant.SECOND_NODE_NF + jjtGetChild(2).getVal() + ".");
					return;

				}

			}

			jjtGetChild(0).interpret(jjtGetChild(2).getVal().toString());

		}
		// VARIABLE EQ VARIABLE DOT SearchType OPAR VARIABLE COMMA VARIABLE
		// MoreOptions CPAR SCOL
		else {

			if (symtab.containsKey(jjtGetChild(0).getVal())) {

				if (!(symtab.contains(symtab.get(jjtGetChild(0).getVal())))) {

					System.out.println(ErrorConstant.INCOMPATIBLE_TYPES + jjtGetChild(0).getVal() + " is not of type Node[].");
					return;

				} else {

					symtab.put(jjtGetChild(0).getVal(), jjtGetChild(2).getVal().toString());

					if (!graph1[0].equals(jjtGetChild(2).getVal().toString())) {

						System.out.println(ErrorConstant.FIRST_NODE_NF + jjtGetChild(2).getVal() + ".");
						return;

					} else {

						if (!graph2[0].equals(jjtGetChild(2).getVal().toString())) {

							System.out.println(ErrorConstant.SECOND_NODE_NF + jjtGetChild(2).getVal() + ".");
							return;

						}

					}

				}

			} else {

				System.out.println(ErrorConstant.SYMBOL_NOT_FOUND + jjtGetChild(0).getVal() + ".");
				return;

			}

		}

		// Right Side
		verify_graph(2);

		// SearchType
		jjtGetChild(4).interpret();

		// MoreOptions
		jjtGetChild(9).interpret();

	}

	public void verify_graph(Integer i) {

		if (symtab.containsKey(jjtGetChild(i).getVal())) {

			if (!(symtab.get(jjtGetChild(i).getVal()) instanceof Graph)) {

				System.out.println(ErrorConstant.INCOMPATIBLE_TYPES + jjtGetChild(i).getVal() + " is not of type Graph.");
				return;

			}

		} else {

			System.out.println(ErrorConstant.SYMBOL_NOT_FOUND + jjtGetChild(i).getVal() + ".");
			return;

		}

	}

	@Override
	public void toGremlin(PrintWriter writer) {

	}
}
/*
 * JavaCC - OriginalChecksum=846292d1a956497664ce7a1a19b15629 (do not edit this
 * line)
 */
