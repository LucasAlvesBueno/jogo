package pacote1;

import java.util.Scanner;
import pacote1.funcionalidades.console;
import pacote1.Fase1.situacao1;

import pacote1.personagens.Atirador;
import pacote1.personagens.Tank;
import pacote1.personagens.Combate.BatalhaDeTurnos;
import pacote1.personagens.Guerreiro;
import pacote1.personagens.Mago;
import pacote1.personagens.Personagem;

public class main {

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Jogo!");
        System.out.println("Aperte 1 + Enter para começar:");
        String res = scanner.nextLine();
        if (res.equals("1")) {
            
            String nome = criacaoDeNome();
            mostarEscolhaDeClasse(nome);
        } else {

            System.out.println("Opção invalida...");
            menu();
        }

    }

    public static String criacaoDeNome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criação de personagem!\n\nInsira o nome do seu novo personagem:");
        String nome = scanner.nextLine();
        return nome;

    }
    public static Personagem mostarEscolhaDeClasse(String nome){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha a classe do personagem " + nome );
        System.out.println("1 - Atirador\n2 - Tank\n3 - Guerreiro\n4 - Mago");
        String res = scanner.nextLine();
        switch (res) {
            case "1":
                Atirador personagemAtirador = new Atirador(nome, 1, 70, 80, 50, 80, 40, 10, 10, "Atirador");
                System.out.println("O personagem " + personagemAtirador.getNome() + " da classe " + personagemAtirador.getClasse() + " foi criado!");
                return personagemAtirador;
            case "2":
                Tank personagemTank = new Tank(nome, 1, 200, 30, 20, 50, 30, 80, 70, "Tank");
                System.out.println("O personagem " + personagemTank.getNome() + " da classe " + personagemTank.getClasse() + " foi criado!");
                return personagemTank;
            case "3":
            Guerreiro personagemGuerreiro = new Guerreiro(nome, 1, 100, 60, 40, 70, 40, 50, 30, "Guerreiro");
            System.out.println("O personagem " + personagemGuerreiro.getNome() + " da classe " + personagemGuerreiro.getClasse() +" foi criado!");
            return personagemGuerreiro;
            case "4":
               Mago personagemMago = new Mago(nome, 1, 100, 10, 80, 30, 100, 10, 50, "Mago");
               System.out.println("O personagem " + personagemMago.getNome() + " da classe " + personagemMago.getClasse() +" foi criado!");
            return personagemMago;
            default:
            System.out.println("Opção inválida...");
            mostarEscolhaDeClasse(nome);
            
                
        }

return null;

    }
    

    
           
        

    public static void main(String[] args) {
        menu();
        
        
        

    }

}
