import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;

public class Main {
    public static String[] parametros;
    public static String algoritmo;

    public static void main(String[] args) throws Exception {
        DiunisioLexer lexer;

        //Copia los argumentos a la variable estática parámetros
        if(args.length > 1) {
            parametros = new String[args.length-1];
            System.arraycopy(args, 1, parametros, 0, args.length-1);
        }

        //Si detecta argumentos, quiere decir que leerá un archivo
        if(args.length > 0)
            lexer = new DiunisioLexer(new ANTLRFileStream(args[0]));
        //Sino leerá desde teclado
        else
            lexer = new DiunisioLexer(new ANTLRInputStream(System.in));

        //Realiza el parseo del código
        DiunisioParser parser = new DiunisioParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.algoritmo();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}