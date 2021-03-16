/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicintast.util;

import java.util.HashMap;

/**
 *
 * @author wellington
 */
public class SymbolsTable {

    private HashMap<String, Object[]> symbols;

    protected SymbolsTable() {
        symbols = new HashMap<>();
    }

    private static SymbolsTable INSTANCE;

    public static SymbolsTable getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SymbolsTable();
        }
        return INSTANCE;
    }

    public void addSymbol(String symbol, String type, Object value) {
        Object data[] = new Object[2];
        data[0] = type;
        data[1] = value;
        symbols.put(symbol, data);
    }

    public String getType(String symbol) {
        if (symbols.containsKey(symbol)) {

            Object data[] = symbols.get(symbol);
            return (String) data[0];

        }
        return "";
    }

    public Object getValue(String symbol) {
        if (symbols.containsKey(symbol)) {

            Object data[] = symbols.get(symbol);
            return data[1];

        }
        return "";
    }

    public Object getSymbol(String symbol) {
        if (symbols.containsKey(symbol)) {
            return symbols.get(symbol);
        }
        return null;
    }

}
