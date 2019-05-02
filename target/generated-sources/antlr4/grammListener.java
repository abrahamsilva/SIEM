// Generated from gramm.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammParser}.
 */
public interface grammListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammParser#propertiesOperator}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesOperator(@NotNull grammParser.PropertiesOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#propertiesOperator}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesOperator(@NotNull grammParser.PropertiesOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#mainConditionName}.
	 * @param ctx the parse tree
	 */
	void enterMainConditionName(@NotNull grammParser.MainConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#mainConditionName}.
	 * @param ctx the parse tree
	 */
	void exitMainConditionName(@NotNull grammParser.MainConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#statusAux}.
	 * @param ctx the parse tree
	 */
	void enterStatusAux(@NotNull grammParser.StatusAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#statusAux}.
	 * @param ctx the parse tree
	 */
	void exitStatusAux(@NotNull grammParser.StatusAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#relopTime}.
	 * @param ctx the parse tree
	 */
	void enterRelopTime(@NotNull grammParser.RelopTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#relopTime}.
	 * @param ctx the parse tree
	 */
	void exitRelopTime(@NotNull grammParser.RelopTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#units}.
	 * @param ctx the parse tree
	 */
	void enterUnits(@NotNull grammParser.UnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#units}.
	 * @param ctx the parse tree
	 */
	void exitUnits(@NotNull grammParser.UnitsContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link grammParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(@NotNull grammParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(@NotNull grammParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#numberRelop}.
	 * @param ctx the parse tree
	 */
	void enterNumberRelop(@NotNull grammParser.NumberRelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#numberRelop}.
	 * @param ctx the parse tree
	 */
	void exitNumberRelop(@NotNull grammParser.NumberRelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull grammParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull grammParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#mainCondition}.
	 * @param ctx the parse tree
	 */
	void enterMainCondition(@NotNull grammParser.MainConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#mainCondition}.
	 * @param ctx the parse tree
	 */
	void exitMainCondition(@NotNull grammParser.MainConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull grammParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull grammParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifier(@NotNull grammParser.QualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifier(@NotNull grammParser.QualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull grammParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull grammParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#mainBodyOperator}.
	 * @param ctx the parse tree
	 */
	void enterMainBodyOperator(@NotNull grammParser.MainBodyOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#mainBodyOperator}.
	 * @param ctx the parse tree
	 */
	void exitMainBodyOperator(@NotNull grammParser.MainBodyOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#complement}.
	 * @param ctx the parse tree
	 */
	void enterComplement(@NotNull grammParser.ComplementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#complement}.
	 * @param ctx the parse tree
	 */
	void exitComplement(@NotNull grammParser.ComplementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull grammParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull grammParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#events}.
	 * @param ctx the parse tree
	 */
	void enterEvents(@NotNull grammParser.EventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#events}.
	 * @param ctx the parse tree
	 */
	void exitEvents(@NotNull grammParser.EventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#status}.
	 * @param ctx the parse tree
	 */
	void enterStatus(@NotNull grammParser.StatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#status}.
	 * @param ctx the parse tree
	 */
	void exitStatus(@NotNull grammParser.StatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull grammParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull grammParser.ObjectContext ctx);
}