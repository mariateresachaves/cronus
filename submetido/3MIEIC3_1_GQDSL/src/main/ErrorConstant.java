package main;

public class ErrorConstant {

	static String USAGE_ERROR = "[Usage Error] Usage: java Cronus <inputfile>";
	static String PARSE_ERROR = "[Parse Error] Encountered errors during parse.";
	static String TREE_BUILDING_ERROR = "[Tree Building Error] Encountered errors during interpretation/tree building.";

	// SEMANTIC
	static String DUPLICATE_ENTRY = "\t[Semantic Error] Duplicate entry for variable ";
	static String INCOMPATIBLE_TYPES = "\t[Semantic Error] Incompatible types. ";
	static String SYMBOL_NOT_FOUND = "\t[Semantic Error] Cannot find symbol ";
	static String NODE_LIST_INDEX = "\t[Semantic Error] Node list index must be a number greater or equal to 0.";
	static String FIRST_NODE_NF = "\t[Semantic Error] The first argument is not a node of graph ";
	static String SECOND_NODE_NF = "\t[Semantic Error] The second argument is not a node of graph ";
	static String NOT_INIT = "\t[Semantic Error] The variable is not initialized.";
	static String INC_PARA_TYPES = "\t[Semantic Error] Incorrect parameters types.";
	static String PATH_SIZE = "\t[Semantic Error] The condition for the path size must have a positive number.";

}
