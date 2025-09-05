package exercicios;

public class SituacaoAluno {

    public static void main(String[] args) {

        // Passo 1: Declaracao das variaveis com valores iniciais
        // Usando double para aceitar notas com casas decimais
        double nota1 = 8.5; // Primeira nota do aluno
        double nota2 = 9.0; // Segunda nota do aluno

        // Passo 2: Calculo da media aritmetica
        // Soma as duas notas e divide por 2
        double media = (nota1 + nota2) / 2;

        // Passo 3: Exibir as notas e a media calculada
        System.out.println("=== SITUACAO DO ALUNO ===");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Media: " + media);
        System.out.println("------------------------");

        // Passo 4: Verificar a situacao do aluno usando estruturas condicionais
        // IMPORTANTE: A ordem das condicoes e fundamental!

        if (media == 10) {
            // Condicao especial para media 10 (deve vir primeiro!)
            System.out.println("Situacao: Aprovado Parabens!");

        } else if (media >= 7) {
            // Se media maior ou igual a 7 (mas nao e 10)
            System.out.println("Situacao: Aprovado");

        } else {
            // Se media menor que 7
            System.out.println("Situacao: Reprovado");
        }

        // Informacao adicional sobre a situacao
        System.out.println("------------------------");
        if (media >= 7) {
            System.out.println("Aluno esta apto para proxima etapa!");
        } else {
            System.out.println("Aluno precisa de recuperacao.");
            System.out.println("Nota necessaria: " + (14 - media) + " pontos a mais para aprovacao.");
        }
    }
}