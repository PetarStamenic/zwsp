package SymbolTable;

    public class Constant {
        public Type type;
        public Object value;

        public Constant(Type constType, Object constValue) {
            this.type = constType;
            this.value = constValue;
        }

}
