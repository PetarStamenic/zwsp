package SymbolTable;

public class SymbolTable {
    private SymbolNode types;
    private SymbolNode variables;

    public SymbolTable() {
        this.types = new Type("int", Type.INTEGER, types);
        this.types = new Type("long", Type.INTEGER, types);
        this.types = new Type("natural", Type.INTEGER, types);
        this.types = new Type("double", Type.REAL, types);
        this.types = new Type("float", Type.REAL, types);
        this.types = new Type("real", Type.REAL, types);
        this.variables = null;
    }

    public boolean addVar( String name, Type type )
    {
        Variable existing = this.getVar( name );
        if ( existing != null )
            return false;
        variables = new Variable( name, type, variables );
        return true;
    }

    public Variable getVar( String name )
    {
        SymbolNode current = variables;
        while ( current != null &&
                current.name.compareTo( name ) != 0 )
            current = current.next;
        return ( Variable ) current;
    }

    public Type getType(String typeName)
    {
        SymbolNode current = types;
        while ( current != null &&
                current.name.compareTo( typeName ) != 0 )
            current = current.next;
        return ( Type ) current;
    }

    public SymbolNode getVariables() {
        return this.variables;
    }

}