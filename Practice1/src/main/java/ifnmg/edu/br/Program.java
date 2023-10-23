package ifnmg.edu.br;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        System.out.println("Area de testes: ");
        //Teste 1
        System.out.println("Teste 1: ");
        List<Double> ins1 = List.of(1.0,3.0,5.0);
        List<Double> outs1 = List.of(1.0,3.0,5.0);
        Dupla<Double,Double> resultado1 = MinhaClasse.metodo(ins1,outs1);
        System.out.printf("Teste 1 - w1 = %.3f, w0 = %.3f%n", resultado1.getPrimeiro(), resultado1.getSegundo());

        //Teste 2
        System.out.println("Teste 2: ");
        List<Double> ins2 = List.of(1.0, 3.0, 5.0);
        List<Double> outs2 = List.of(2.0, 4.0, 6.0);
        Dupla<Double, Double> resultado2 = MinhaClasse.metodo(ins2, outs2);
        System.out.printf("Teste 2 - w1 = %.3f, w0 = %.3f%n", resultado2.getPrimeiro(), resultado2.getSegundo());

        //Teste 3
        System.out.println("Teste 3: ");
        List<Double> ins3 = List.of(1.0, 3.0, 5.0);
        List<Double> outs3 = List.of(3.0, 7.0, 11.0);
        Dupla<Double, Double> resultado3 = MinhaClasse.metodo(ins3, outs3);
        System.out.printf("Teste 3 - w1 = %.3f, w0 = %.3f%n", resultado3.getPrimeiro(), resultado3.getSegundo());

        //Teste 4
        System.out.println("Teste 4: ");
        List<Double> ins4 = List.of(1.0, 3.0, 5.0);
        List<Double> outs4 = List.of(4.5, 12.5, 20.5);
        Dupla<Double, Double> resultado4 = MinhaClasse.metodo(ins4, outs4);
        System.out.printf("Teste 4 - w1 = %.3f, w0 = %.3f%n", resultado4.getPrimeiro(), resultado4.getSegundo());

        //Teste 5
        System.out.println("Teste 5: ");
        List<Double> ins5 = List.of(2.900000095, 6.699999809, 4.900000095, 7.900000095, 9.800000191, 6.900000095, 6.099999905, 6.199999809, 6.0, 5.099999905, 4.699999809, 4.400000095, 5.800000191);
        List<Double> outs5 = List.of(4.0, 7.400000095, 5.0, 7.199999809, 7.900000095, 6.099999905, 6.0, 5.800000191, 5.199999809, 4.199999809, 4.0, 4.400000095, 5.199999809);
        Dupla<Double, Double> resultado5 = MinhaClasse.metodo(ins5, outs5);
        System.out.printf("Teste 5 - w1 = %.3f, w0 = %.3f%n", resultado5.getPrimeiro(), resultado5.getSegundo());

    }
}
