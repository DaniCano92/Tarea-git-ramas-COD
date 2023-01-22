package App;

public class Aplicacion {
    public String calcular(String operacion) {
        String resultado;
        String[] ops = operacion.split( "[\\+\\-X\\/]");
        if (ops.length == 1) {
            resultado = ops[0];
        } else {
            float v1 = Float.parseFloat(ops[0]);
            float v2 = Float.parseFloat(ops[1]);
            float r;
            if (operacion.contains("+"))
                r = v1 + v2;
            else if (operacion.contains("-"))
                r = v1 - v2;
            else if (operacion.contains("X"))
                r = v1 * v2;
            else r = v1 / v2;
            resultado = String.valueOf(r);
        }
        return resultado;
}
