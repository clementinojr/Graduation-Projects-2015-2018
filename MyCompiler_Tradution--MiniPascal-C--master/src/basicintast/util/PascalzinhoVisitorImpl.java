/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicintast.util;

import basicintast.parser.PascalzinhoBaseVisitor;
import basicintast.parser.PascalzinhoLexer;
import basicintast.parser.PascalzinhoParser;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class PascalzinhoVisitorImpl extends PascalzinhoBaseVisitor<Object> {

    @Override
    public Object visitIfStmt(PascalzinhoParser.IfStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.condExpr());
        if (visit) {
            return visit(ctx.b1);
        }
        return null;
    }

    @Override
    public Object visitIfElseStmt(PascalzinhoParser.IfElseStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.condExpr());
        if (visit) {
            return visit(ctx.b1);
        } else {
            return visit(ctx.b2);
        }
    }

    @Override
    public Object visitBlockStmt(PascalzinhoParser.BlockStmtContext ctx) {
        return super.visitBlockStmt(ctx);
    }

    @Override
    public Object visitCondRelOp(PascalzinhoParser.CondRelOpContext ctx) {
        Double a = Double.parseDouble((String) visit(ctx.expr(0)));
        Double b = Double.parseDouble((String) visit(ctx.expr(1)));
        int op = ctx.relop.getType();

        switch (op) {
            case PascalzinhoLexer.EQ:
                return Objects.equals(a, b);
            case PascalzinhoLexer.NE:
                return a != b;
            case PascalzinhoLexer.LT:
                return a < b;
            case PascalzinhoLexer.GT:
                return a > b;
            case PascalzinhoLexer.LE:
                return a <= b;
            case PascalzinhoLexer.GE:
                return a >= b;
        }
        return null;
    }

    @Override
    public Object visitCondExpresion(PascalzinhoParser.CondExpresionContext ctx) {
        Double d = Double.parseDouble((String) visit(ctx.expr()));
        return d > 0;
    }

    @Override
    public Object visitPrintStr(PascalzinhoParser.PrintStrContext ctx) {
        String val = ctx.STR().getText();
        char c = '\0';
        val = val.replace('"', c);
        System.out.print(val);
        return 0d;
    }

    @Override
    public Object visitPrintExpr(PascalzinhoParser.PrintExprContext ctx) {
        Object o = visit(ctx.expr());
        System.out.print(o);
        return o;
    }

    @Override
    public Object visitPrintStrLn(PascalzinhoParser.PrintStrLnContext ctx) {
        String val = ctx.STR().getText();
        char c = '\0';
        val = val.replace('"', c);
        System.out.println(val);
        return 0d;
    }

    @Override
    public Object visitPrintExprLn(PascalzinhoParser.PrintExprLnContext ctx) {
        Object o = visit(ctx.expr());
        System.out.println(o);
        return o;
    }

    @Override
    public Object visitReadVar(PascalzinhoParser.ReadVarContext ctx) {

        if ((SymbolsTable.getInstance().getSymbol(ctx.VARNAME().getText())) != null) {
            Scanner s = new Scanner(System.in);
            Object value;
            String type = SymbolsTable.getInstance().getType(ctx.VARNAME().getText());
            switch (type) {
                case "integer":
                    value = s.next();
                    try {
                        int i = (int) Double.parseDouble(value.toString());
                        String v = i + "";
                        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, v);
                    } catch (Exception a) {
                        System.out.println("Tipo incompatível!");
                        System.exit(0);
                        return null;
                    }
                    break;
                case "float":
                    value = s.next();
                    try {
                        Double.parseDouble((String) value);
                        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
                    } catch (Exception a) {
                        System.out.println("Tipo incompatível!");
                        System.exit(0);
                        return null;
                    }
                    break;                    
                default:
                    value = s.next();
                    SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
                    break;
            }

            return value;
        }
        System.out.println("Variável não declarada!");

        return null;
    }

    @Override
    public Object visitAttrExpr(PascalzinhoParser.AttrExprContext ctx) {
        if ((SymbolsTable.getInstance().getSymbol(ctx.VARNAME().getText())) != null) {
            Object value = (Object) visit(ctx.expr());
            String type = SymbolsTable.getInstance().getType(ctx.VARNAME().getText());
            switch (type) {
                case "integer":
                    try {
                        int i = (int) Double.parseDouble(value.toString());
                        String v = i + "";
                        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, v);
                    } catch (Exception a) {
                        System.out.println("Tipo incompatível!");
                        System.exit(0);
                        return null;
                    }
                    break;
                case "float":
                    try {
                        Double.parseDouble((String) value);
                        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
                    } catch (Exception a) {
                        System.out.println("Tipo incompatível!");
                        System.exit(0);
                        return null;
                    }
                    break;
                default:
                    System.out.println("Tipo incompatível!");
                    System.exit(0);
                    return null;
            }
            return visitChildren(ctx);
        }
        System.out.println("Variável não declarada!");
        return null;
    }

    @Override
    public Object visitAttrArrExpr(PascalzinhoParser.AttrArrExprContext ctx) {
        int teste;
        try {
            teste = Integer.parseInt(ctx.v.getText());
        } catch (Exception e) {
            teste = Integer.parseInt("" + SymbolsTable.getInstance().getValue(ctx.v.getText()));
        }
        if ((SymbolsTable.getInstance().getSymbol(ctx.VARNAME(0).getText() + "[" + teste + "]")) != null) {

            Object value = (Object) visit(ctx.expr());
            try {
                int i = Integer.parseInt(ctx.v.getText());
                String type = SymbolsTable.getInstance().getType(ctx.VARNAME(0).getText() + "[" + i + "]");

                switch (type) {
                    case "integer":
                        try {
                            int n = (int) Double.parseDouble(value.toString());
                            String v = n + "";
                            SymbolsTable.getInstance().addSymbol(ctx.VARNAME(0).getText() + "[" + i + "]", type, v);
                        } catch (Exception a) {
                            System.out.println("Tipo incompatível!");
                            System.exit(0);
                            return null;
                        }
                        break;
                    case "float":
                        try {
                            double d = Double.parseDouble((String) value);
                            SymbolsTable.getInstance().addSymbol(ctx.VARNAME(0).getText() + "[" + i + "]", type, d);
                        } catch (Exception a) {
                            System.out.println("Tipo incompatível!");
                            System.exit(0);
                            return null;
                        }
                        break;
                    default:
                        System.out.println("Tipo incompatível!");
                        System.exit(0);
                        return null;
                }
            } catch (Exception e) {

                String a = SymbolsTable.getInstance().getValue(ctx.v.getText()) + "";
                int i = Integer.parseInt(a.toString());
                String type = SymbolsTable.getInstance().getType(ctx.VARNAME(0).getText() + "[" + i + "]");
                switch (type) {
                    case "integer":
                        try {
                            int n = (int) Double.parseDouble(value.toString());
                            String v = n + "";
                            SymbolsTable.getInstance().addSymbol(ctx.VARNAME(0).getText() + "[" + i + "]", type, v);
                        } catch (Exception b) {
                            System.out.println("Tipo incompatível!");
                            System.exit(0);
                            return null;
                        }
                        break;
                    case "float":
                        try {
                            double d = Double.parseDouble((String) value);
                            SymbolsTable.getInstance().addSymbol(ctx.VARNAME(0).getText() + "[" + i + "]", type, d);
                        } catch (Exception b) {
                            System.out.println("Tipo incompatível!");
                            System.exit(0);
                            return null;
                        }
                        break;
                    default:
                        System.out.println("Tipo incompatível!");
                        System.exit(0);
                        return null;
                }
            }

            return value;
        }
        System.out.println("Variável não declarada!");
        return null;
    }

    @Override
    public Object visitAttrBool(PascalzinhoParser.AttrBoolContext ctx) {
        String type = SymbolsTable.getInstance().getType(ctx.VARNAME().getText());
        Object value = ctx.getChild(2).getText();
        if (type.equals("boolean")) {
            if (value.equals("true")) {
                SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, "1.0");
            } else {
                SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, "0.0");
            }
            return visitChildren(ctx);

        } else {
            System.out.println("Tipo incompatível!");
            System.exit(0);
            return null;
        }
    }

    @Override
    public Object visitAttrArrTrueFalse(PascalzinhoParser.AttrArrTrueFalseContext ctx) {
        int teste;
        try {
            teste = Integer.parseInt(ctx.v.getText());
        } catch (Exception e) {
            teste = Integer.parseInt("" + SymbolsTable.getInstance().getValue(ctx.v.getText()));
        }
        if ((SymbolsTable.getInstance().getSymbol(ctx.VARNAME(0).getText() + "[" + teste + "]")) != null) {
            String type = SymbolsTable.getInstance().getType(ctx.VARNAME(0).getText() + "[" + teste + "]");
            Object value = ctx.getChild(5).getText();
            if (type.equals("boolean")) {
                if (value.equals("true")) {
                    SymbolsTable.getInstance().addSymbol(ctx.VARNAME(0).getText() + "[" + teste + "]", type, "1.0");
                } else {
                    SymbolsTable.getInstance().addSymbol(ctx.VARNAME(0).getText() + "[" + teste + "]", type, "0.0");
                }
            } else {
                System.out.println("Tipo incompatível!");
                System.exit(0);
                return null;
            }

            return visitChildren(ctx);
        }
        System.out.println("Variável não declarada!");
        return null;

    }

    @Override
    public Object visitAttrString(PascalzinhoParser.AttrStringContext ctx) {
        Object value = ctx.STR().getText();
        String type = SymbolsTable.getInstance().getType(ctx.VARNAME().getText());
        if ((SymbolsTable.getInstance().getSymbol(ctx.VARNAME().getText())) != null) {
            if (!type.equals("string")) {
                System.out.println("Tipo incompatível!");
                System.exit(0);
                return null;
            } else {

                SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
                return value;
            }
        }
        System.out.println("Variavel não declarada!");
        return null;
    }

    @Override
    public Object visitAttrArrStr(PascalzinhoParser.AttrArrStrContext ctx) {
        int teste;
        try {
            teste = Integer.parseInt(ctx.v.getText());
        } catch (Exception e) {
            teste = Integer.parseInt("" + SymbolsTable.getInstance().getValue(ctx.v.getText()));
        }
        if ((SymbolsTable.getInstance().getSymbol(ctx.VARNAME(0).getText() + "[" + teste + "]")) != null) {

            Object value = ctx.STR().getText();
            String type = SymbolsTable.getInstance().getType(ctx.VARNAME(0).getText() + "[" + teste + "]");
            String v = value.toString();
            if (v.charAt(0) == '"' && !type.equals("string")) {
                System.out.println("Tipo incompatível!");
                System.exit(0);
                return null;
            } else {
                SymbolsTable.getInstance().addSymbol(ctx.VARNAME(0).getText() + "[" + teste + "]", type, value);
                return value;
            }
        }
        System.out.println("Variável não declarada!");
        return null;

    }

    @Override
    public Object visitExprPlus(PascalzinhoParser.ExprPlusContext ctx) {
        try {
            Double a = Double.parseDouble("" + visit(ctx.expr1()));
            Double b = Double.parseDouble("" + visit(ctx.expr()));
            Double result = a + b;
            return result.toString();
        } catch (Exception a) {
            System.out.println("Impossível calcular!");
        }
        return null;

    }

    @Override
    public Object visitExprMinus(PascalzinhoParser.ExprMinusContext ctx) {
        try {
            Double a = Double.parseDouble("" + visit(ctx.expr1()));
            Double b = Double.parseDouble("" + visit(ctx.expr()));
            Double result = a - b;
            return result.toString();

        } catch (Exception a) {
            System.out.println("Impossível calcular!");
        }
        return null;

    }

    @Override
    public Object visitExpr1Empty(PascalzinhoParser.Expr1EmptyContext ctx) {
        return visit(ctx.expr1());
    }

    @Override
    public Object visitExpr1Mult(PascalzinhoParser.Expr1MultContext ctx) {
        try {
            Object a = visit(ctx.expr2());
            Object b = visit(ctx.expr());
            Double aa = Double.parseDouble("" + a);
            Double bb = Double.parseDouble("" + b);
            Double result = aa * bb;
            return result.toString();
        } catch (Exception a) {
            System.out.println("Impossível calcular!");
        }
        return null;

    }

    @Override
    public Object visitExpr1Div(PascalzinhoParser.Expr1DivContext ctx) {
        try {
            Object a = visit(ctx.expr2());
            Object b = visit(ctx.expr());
            Double aa = Double.parseDouble("" + a);
            Double bb = Double.parseDouble("" + b);
            Double result = aa / bb;
            return result.toString();
        } catch (Exception a) {
            System.out.println("Impossível calcular!");
        }
        return null;

    }

    @Override
    public Object visitExpr2Empty(PascalzinhoParser.Expr2EmptyContext ctx) {
        return visit(ctx.expr2());
    }

    @Override
    public Object visitExpr2Par(PascalzinhoParser.Expr2ParContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitExpr2Num(PascalzinhoParser.Expr2NumContext ctx) {
        return ctx.NUM().getText();
    }

    @Override
    public Object visitExprArr(PascalzinhoParser.ExprArrContext ctx) {
        String r = "";
        try {
            int v = Integer.parseInt(ctx.v.getText());
            r = "" + SymbolsTable.getInstance().getValue(ctx.VARNAME(0).getText() + "[" + v + "]");
        } catch (Exception e) {
            String a = SymbolsTable.getInstance().getValue(ctx.v.getText()) + "";
            int v = Integer.parseInt(a.toString());
            r = "" + SymbolsTable.getInstance().getValue(ctx.VARNAME(0).getText() + "[" + v + "]");
        }
        return r;
    }

    @Override
    public Object visitExpr2Var(PascalzinhoParser.Expr2VarContext ctx) {
        return SymbolsTable.getInstance().getValue(ctx.VARNAME().getText());
    }

    @Override
    public Object visitVarNameFirst(PascalzinhoParser.VarNameFirstContext ctx) {
        String type = ctx.type().getText();
        if (type.charAt(0) == 'a') {
            int a = Integer.parseInt(ctx.type().arraytype().n1.getText());
            int b = Integer.parseInt(ctx.type().arraytype().n2.getText());
            for (int i = a; i < b; i++) {
                SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText() + "[" + i + "]", ctx.type().arraytype().t.getText(), null);
            }

        } else {
            SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, null);
        }

        return visitChildren(ctx);
    }

    @Override
    public Object visitVarName(PascalzinhoParser.VarNameContext ctx) {
        String type = ctx.parent.getChild(3).getText();
        boolean teste = true;
        int i = 1;
        while (teste) {
            switch (type) {
                case "integer":
                    teste = false;
                    break;
                case "float":
                    teste = false;
                    break;
                case "boolean":
                    teste = false;
                    break;
                case "string":
                    teste = false;
                    break;
                default:
                    type = ctx.parent.getChild(3 + i).getText();
                    i++;
                    break;
            }
        }
        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, null);

        return visitChildren(ctx);
    }

    @Override
    public Object visitWhileStmt(PascalzinhoParser.WhileStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.condExpr());
        while (visit) {
            visit(ctx.b1);
            visit = (Boolean) visit(ctx.condExpr());

        }
        return null;

    }

    @Override
    public Object visitForStmt(PascalzinhoParser.ForStmtContext ctx) {
        String varname = ctx.attr().getChild(0).getText();
        String type = SymbolsTable.getInstance().getType(varname);
        visit(ctx.attr());
        int n = Integer.parseInt("" + SymbolsTable.getInstance().getValue(varname));
        int max = Integer.parseInt("" + ctx.n.getText());
        for (int i = n; n < max; n++) {
            SymbolsTable.getInstance().addSymbol(varname, type, n);
            visit(ctx.b1);
        }
        return null;
    }
}
