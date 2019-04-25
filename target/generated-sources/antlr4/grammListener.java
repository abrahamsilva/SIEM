// Generated from gramm.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammParser}.
 */
public interface grammListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammParser#corrule}.
	 * @param ctx the parse tree
	 */
	void enterCorrule(@NotNull grammParser.CorruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#corrule}.
	 * @param ctx the parse tree
	 */
	void exitCorrule(@NotNull grammParser.CorruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull grammParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull grammParser.BodyContext ctx);
}