package ifnmg.edu.br;

import java.util.List;

public class MinhaClasse {

    private static Dupla<Double, Double> processamento(List<Double> ins, List<Double> outs, int e, double lr) {
        double w0 = 0;
        double w1 = 0;

        for (int i = 0; i < e; i++) {
            for (int j = 0; j < ins.size(); j++) {
                double p = w1 * ins.get(j) + w0;
                double diff = outs.get(j) - p;
                w0 += diff * lr;
                w1 += diff * lr * ins.get(j);
            }
            if (i % 10 == 0) {
                System.out.printf("Iteração %d: e = %d, w1 = %.3f, w0 = %.3f%n", i, e, w1, w0);
            }
        }
        return new Dupla<>(w1, w0);
    }

    public static Dupla<Double, Double> metodo(List<Double> ins, List<Double> outs) {
        return processamento(ins, outs, 2000, 0.025);
    }

    public static Dupla<Double, Double> metodo(List<Double> ins, List<Double> outs, int e) {
        return processamento(ins, outs, e, 0.025);
    }

    public static Dupla<Double, Double> metodo(List<Double> ins, List<Double> outs, int e, double lr) {
        return processamento(ins, outs, e, lr);
    }
}
