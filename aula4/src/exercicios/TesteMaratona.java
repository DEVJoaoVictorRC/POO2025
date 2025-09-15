package exercicios;

public class TesteMaratona {

    public static void main(String[] args) {

        AtletaAmador atam = new AtletaAmador("Joao", "Masculino", 2, 1.82,false);
        AtletaProfissional atpf = new AtletaProfissional("Ana", "Feminino", 19, 1.81, 72.0);
        AtletaProfissional atpff = new AtletaProfissional("Rogerio", "Masculino", 19, 1.90, 83.0);

        System.out.println("Dados do atleta amador: " + "\n"+ atam.toString());
        System.out.print("Situação: ");
        atam.verificarSituacao(atam.getIdade(), atam.getAltura());

        System.out.println();

        System.out.println("Dados do atleta profissional: "   + "\n" + atpf.toString());
        System.out.print("Situação: ");
        atpf.verificarSituacao(atpf.getIdade(), atpf.getAltura());

        System.out.println();
        
        System.out.println("Dados do atleta profissional: "   + "\n" + atpff.toString());
        System.out.print("Situação: ");
        atpff.verificarSituacao(atpff.getIdade(), atpff.getAltura());
    }
}