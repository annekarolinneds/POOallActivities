package ifnmg.edu.br;

public class Util {
    public static int obterDigito(long numero, int posicao) {
        String numeroStr = String.valueOf(numero);
        if (posicao < 1 || posicao > numeroStr.length()) {
            throw new IllegalArgumentException("Posição inválida");
        }
        char digito = numeroStr.charAt(posicao - 1);
        return Character.getNumericValue(digito);
    }

    public static boolean validarCpf(long cpf) {
        String cpfStr = String.valueOf(cpf);

        if (cpfStr.length() != 11) {
            return false;
        }

        int soma1 = 0;
        int soma2 = 0;

        for (int i = 0; i < 9; i++) {
            int digito = obterDigito(cpf, i + 1);
            soma1 += digito * (10 - i);
            soma2 += digito * (11 - i);
        }

        int resto1 = (soma1 * 10) % 11;
        int resto2 = (soma2 * 10) % 11;

        if (resto1 == 10) {
            resto1 = 0;
        }
        if (resto2 == 10) {
            resto2 = 0;
        }

        return resto1 == obterDigito(cpf, 10) && resto2 == obterDigito(cpf, 11);
    }

    public static boolean validarCpf(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }

        long cpfNum;
        try {
            cpfNum = Long.parseLong(cpf);
        } catch (NumberFormatException e) {
            return false;
        }
        return validarCpf(cpfNum);
    }
}
