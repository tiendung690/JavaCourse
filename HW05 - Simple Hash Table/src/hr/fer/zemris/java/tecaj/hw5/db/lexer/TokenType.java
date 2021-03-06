package hr.fer.zemris.java.tecaj.hw5.db.lexer;

/**
 * Defines all the tokens that can be generated by the lexer. Supported tokens
 * are:
 * <ul>
 * <li><strong>SYMBOL</strong> used to represent a symbol.</li>
 * <li><strong>OPERATOR</strong> used to represent a comparison operator.</li>
 * <li><strong>STRING_LITERAL</strong> used to represent a string literal.</li>
 * <li><strong>COMMAND</strong> used to represent a command or field name.</li>
 * <li><strong>EOF</strong> used to represent the end of file.</li>
 * </ul>
 * 
 * @author Kristijan Vulinovic
 *
 */
public enum TokenType {
	/** A {@code Token} that is used to represent a symbol. */
	SYMBOL,
	/** A {@code Token} that is used to represent a comparison operator. */
	OPERATOR,
	/** A {@code Token} that is used to represent a string literal. */
	STRING_LITERAL,
	/** A {@code Token} that is used to represent a command or field name. */
	COMMAND,
	/** A {@code Token} that is used to represent the end of file. */
	EOF;
}
