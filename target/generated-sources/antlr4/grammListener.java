// Generated from gramm.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammParser}.
 */
public interface grammListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull grammParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull grammParser.ProgContext ctx);
}