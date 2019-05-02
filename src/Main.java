
import java.io.File;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main {

    public static void main(String[] args)  {

        try {
            File file = new File("XML.xml");
            File file2 = new File("EPL.sql");
            CharStream input = CharStreams.fromStream(System.in);
            grammLexer lexer = new grammLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            grammParser parser = new grammParser(tokens);
            ParseTree tree = parser.corrule();
            System.out.println(tree.toStringTree(parser));
            ParseTreeWalker walker = new ParseTreeWalker();
            miListener listener = new miListener(file, file2);
            walker.walk(listener, tree);
        }
        catch(Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}