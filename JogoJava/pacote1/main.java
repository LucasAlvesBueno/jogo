package pacote1;

import java.util.Scanner;
import pacote1.funcionalidades.console;
import pacote1.Fase1.situacao1;

import pacote1.personagens.Atirador;
import pacote1.personagens.Tank;
import pacote1.personagens.Guerreiro;
import pacote1.personagens.Mago;

public class main {

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Jogo!");
        System.out.println("Aperte 1 + Enter para começar:");
        String res = scanner.nextLine();
        if (res.equals("1")) {
            criacaoDePersonagem();
        } else {

            System.out.println("Opção invalida...");
            menu();
        }

    }

    public static void criacaoDePersonagem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de personagem: ");
        System.out.println("Insira o nome do personegem: ");
        String res = scanner.nextLine();
        String nome = res;

        System.out.println("1 - Atirador\n2 - Tank\n3 - Guerreiro\n4 - Mago");
        String res1 = scanner.nextLine();
        switch (res1) {

            case "1":
                console.apagarConsole();
                Atirador personagemAtirador = new Atirador(nome, 1, 70, 80, 40, 80, 50, 10, 10, "Atirador");
                System.out.println("O Personagem " + personagemAtirador.getNome() + " da classe "
                        + personagemAtirador.getClasse() + " foi criado!");
                break;
            case "2":
                console.apagarConsole();
                Tank personagemTank = new Tank(nome, 1, 200, 30, 20, 50, 50, 80, 60, "Tank");
                System.out.println("O Personagem " + personagemTank.getNome() + " da classe "
                        + personagemTank.getClasse() + " foi criado!");
                break;
            case "3":
                console.apagarConsole();
                Guerreiro personagemGuerreiro = new Guerreiro(nome, 1, 100, 60, 40, 60, 20, 40, 20, "Guerreiro");
                System.out.println("O Personagem " + personagemGuerreiro.getNome() + " da classe "
                        + personagemGuerreiro.getClasse() + " foi criado!");
                break;
            case "4":
                console.apagarConsole();
                Mago personagemMago = new Mago(nome, 1, 100, 60, 40, 60, 20, 40, 20, "Mago");
                System.out.println("O Personagem " + personagemMago.getNome() + " da classe "
                        + personagemMago.getClasse() + " foi criado!");
                break;
            default:
                console.apagarConsole();
                System.out.println("Opção invalida...");
                criacaoDePersonagem();

        }

    }



    public static void main(String[] args) {
        menu();
        situacao1.goblinsCombat();
        situacao1.oQueVcFaz();

    }

}
