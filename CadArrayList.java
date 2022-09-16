

import java.util.ArrayList;
import java.util.Scanner;

public class CadArrayList {

    static Pessoa jogador;
    public static ArrayList<Pessoa> dadosInt = new ArrayList<Pessoa>();
    public static ArrayList<Pessoa> dadosGre = new ArrayList<Pessoa>();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("===CADASTRAMENTO DE JOGADORES DE FUTEBOL===");
            System.out.println("1 - Cadastrar jogadores");
            System.out.println("2 - Listar jogadores do Grêmio");
            System.out.println("3 - Listar jogadores do inter");
            System.out.println("4 - Listar todos os jogadores");
            System.out.print("5 - SAIR\n");
            opcao = Integer.parseInt(entrada.nextLine());

            if (opcao == 1) {
                cadastramento();
            }
            if (opcao == 2) {
                listagemGre();
            }
            if (opcao == 3) {
                listagemInt();
            }
            if (opcao == 4) {
                listagemGre();
                listagemInt();
            }

        } while (opcao != 5);
    }

    public static void cadastramento() {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.print("Digite 1 para jogador do Grêmio, 2 para jogador do Inter e 3 para sair: ");
            opcao = Integer.parseInt(entrada.nextLine());
            try {
                if (opcao == 1) {
                    System.out.println("GRÊMIO!!!!");
                    jogador = new Pessoa();
                    System.out.print("Digite o nome: ");
                    jogador.nome = entrada.nextLine();
                    System.out.print("Digite a idade: ");
                    jogador.idade = Long.parseLong(entrada.nextLine());
                    System.out.print("Digite o peso: ");
                    jogador.peso = Float.parseFloat(entrada.nextLine());
                    System.out.print("Digite a posição: ");
                    jogador.posicao = entrada.nextLine();
                    System.out.print("Digite a altura: ");
                    jogador.altura = Float.parseFloat(entrada.nextLine());
                    dadosGre.add(jogador);
                }
                if (opcao == 2) {
                    System.out.println("INTER!!!!");
                    jogador = new Pessoa();
                    System.out.print("Digite o nome: ");
                    jogador.nome = entrada.nextLine();
                    System.out.print("Digite a idade: ");
                    jogador.idade = Long.parseLong(entrada.nextLine());
                    System.out.print("Digite o peso: ");
                    jogador.peso = Float.parseFloat(entrada.nextLine());
                    System.out.print("Digite a posição: ");
                    jogador.posicao = entrada.nextLine();
                    System.out.print("Digite a altura: ");
                    jogador.altura = Float.parseFloat(entrada.nextLine());
                    dadosInt.add(jogador);
                }

            } catch (Exception e) {
                System.out.println("Opção inválida! Digite 1, 2 ou 3");
            }

        } while (opcao != 3);
        opcao = 0;
    }

    public static void listagemGre() {
        jogador = new Pessoa();
        if (dadosGre.isEmpty()) {
            System.out.println("Não há jogadores na lista do Grêmio\n");
        } else {
            System.out.println("GRÊMIO!!!");
            for (int j = 0; j < dadosGre.size(); j++) {
                jogador = dadosGre.get(j);                
                System.out.println("Nome: " + jogador.nome);
                System.out.println("Idade: " + jogador.idade);
                System.out.println("Peso: " + jogador.peso);
                System.out.println("Posição: " + jogador.posicao);
                System.out.println("Altura: " + jogador.altura + "\n");
            }
        }
    }

    public static void listagemInt() {
        jogador = new Pessoa();
        if (dadosInt.isEmpty()) {
            System.out.println("Não há jogadores na lista do Inter\n");
        } else {
            System.out.println("INTER!!!");
            for (int j = 0; j < dadosInt.size(); j++) {
                jogador = dadosInt.get(j);                
                System.out.println("Nome: " + jogador.nome);
                System.out.println("Idade: " + jogador.idade);
                System.out.println("Peso: " + jogador.peso);
                System.out.println("Posição: " + jogador.posicao);
                System.out.println("Altura: " + jogador.altura + "\n");
            }
        }
    }
}
