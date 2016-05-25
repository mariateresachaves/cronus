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

}
