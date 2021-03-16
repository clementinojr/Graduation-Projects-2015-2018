package basicintast;

import basicintast.parser.Escrever;
import basicintast.parser.PascalzinhoLexer;
import basicintast.parser.PascalzinhoParser;
import basicintast.parser.PascalzinhoVisitor;
import basicintast.util.PascalzinhoVisitorImpl;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Run {

    public static void main(String[] args) throws IOException {
        String fn = "input.basic";
        if (args.length > 0) {
            fn = args[0];
            if(args.length == 3 && (args[1].equals("-o")||args[1].equals("--out"))){
                Escrever.set(args[2]);
                Escrever.gravar();
            }
        } else {
            System.out.println("Usage: java -jar Pascalzinho.jar file.pas\n       java -jar Pascalzinho.jar file.pas -o out.cpp");
            //System.exit(0);
        }

        ANTLRInputStream input = new ANTLRFileStream(fn);
        PascalzinhoLexer lexer = new PascalzinhoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PascalzinhoParser parser = new PascalzinhoParser(tokens);

        ParseTree tree = parser.program();

        PascalzinhoVisitor eval = new PascalzinhoVisitorImpl();

        eval.visit(tree);
    }

}


