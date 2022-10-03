package SymbolTable;

public class Field{
    public String type;
    public String name;
    public int offset;
    public Field(String type, String name){
        this.type = type;
        this.name = name;
        this.offset = 0;
    }
}