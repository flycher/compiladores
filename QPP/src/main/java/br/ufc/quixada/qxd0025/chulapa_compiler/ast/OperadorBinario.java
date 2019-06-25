package br.ufc.quixada.qxd0025.chulapa_compiler.ast;

public class OperadorBinario extends TreeNode {
    private final OperadorBinarioEnum operador;

    public OperadorBinario(OperadorBinarioEnum operador) {
        this.operador = operador;
    }

    public OperadorBinarioEnum getOperador() {
        return operador;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth * 2));
        System.out.print("[OperadorBinario]: {");

        System.out.print(" ".repeat(depth * 2));
        System.out.print("operador: " + operador);
        System.out.print(" ".repeat(depth * 2));

        System.out.print("}");
    }

    public String toString(){
        switch(operador){
            case AND:
                return "&&";
            case OR:
                return "||";
            case PLUS:
                return "+";
            case MINUS:
                return "-";
            case TIMES:
                return "*";
            case DIV:
                return "/";
            case  MOD:
                return "%";
            case LT:
                return "<";
            case LEQ:
                return "<=";
            case GT:
                return ">";
            case GEQ:
                return ">=";
            case EQ:
                return "==";
            case NEQ:
                return "!=";
        }
        return "";
    }
}
