package SymbolTable;
import java.util.*;

public class Method {
    public String type;
    public String name;
    public int offset;
    public boolean overrides;
    public LinkedHashMap<String, String> arguments;     //key: name -> type
    public LinkedHashMap<String, String> variables;     //key: name -> type

    public Method(String type, String name){
        this.type = type;
        this.name = name;
        this.offset = 0;
        this.overrides = false;
        this.arguments = new LinkedHashMap<String, String>();
        this.variables = new LinkedHashMap<String, String>();
    }
}
