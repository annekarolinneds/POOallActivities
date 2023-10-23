package ifnmg.edu.br;

public class Main {
    public static void main(String[] args){

        System.out.println("Teste 1");
        String cpf1 = "14230703058";
        if (Util.validarCpf(cpf1)) {
            System.out.println("CPF: " + cpf1 + " - Resposta: Válido");
        } else {
            System.out.println("CPF: " + cpf1 + " - Resposta: Inválido");
        }

        System.out.println("Teste 2");
        String cpf2 = "142.307.030-58";
        if (Util.validarCpf(cpf2)) {
            System.out.println("CPF: " + cpf2 + " - Resposta: Válido");
        } else {
            System.out.println("CPF: " + cpf2 + " - Resposta: Inválido");
        }

        System.out.println("Teste 3");
        String cpf3 = "230703058";
        if (Util.validarCpf(cpf3)) {
            System.out.println("CPF: " + cpf3 + " - Resposta: Válido");
        } else {
            System.out.println("CPF: " + cpf3 + " - Resposta: Inválido");
        }

        System.out.println("Teste 4");
        String cpf4 = "002.307.030-58";
        if (Util.validarCpf(cpf4)) {
            System.out.println("CPF: " + cpf4 + " - Resposta: Válido");
        } else {
            System.out.println("CPF: " + cpf4 + " - Resposta: Inválido");
        }

    }
}
