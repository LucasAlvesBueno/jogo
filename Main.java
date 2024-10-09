import java.util.Scanner;
import pacote.Guerreiro;
import pacote.Mago;
import pacote.Tank;
import pacote.Atirador;
import pacote.ClassePersonagem;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static String criarClassePersonagem() {
        System.out.println("Escolha a classe do seu personagem");
        System.out.println("1 - Atirador\n2 - Tank\n3 - Mago\n4 - Guerreiro");
        return scanner.nextLine();
    }

    public static String criarNomePersonagem() {
        System.out.println("Vamos criar seu personagem!");
        System.out.print("Qual o nome do seu personagem? ");
        return scanner.nextLine();
    }

    public static ClassePersonagem criarPersonagem(String classe, String nome) {
        ClassePersonagem personagem = null;
        
        switch (classe) {
            case "1":
                personagem = new Atirador(0, 0, 0, 0, 0, 0, 0, nome);
                System.out.println("Personagem " + nome + " da classe Atirador foi criado com sucesso!");
                break;
            case "2":
                personagem = new Tank(0, 0, 0, 0, 0, 0, 0, nome);
                System.out.println("Personagem " + nome + " da classe Tank foi criado com sucesso!");
                break;
            case "3":
                personagem = new Mago(0, 0, 0, 0, 0, 0, 0, nome);
                System.out.println("Personagem " + nome + " da classe Mago foi criado com sucesso!");
                break;
            case "4":
                personagem = new Guerreiro(0, 0, 0, 0, 0, 0, 0, nome);
                System.out.println("Personagem " + nome + " da classe Guerreiro foi criado com sucesso!");
                break;
            default:
                System.out.println("Classe inválida! Tente novamente.");
                return criarPersonagem(criarClassePersonagem(), nome);
        }
        
        return personagem;
    }

    public static void mostrarMenuBatalha() {
        System.out.println("1 - Atacar\n2 - Habilidades\n3 - Itens");
    }

    public static String escolherOpcaoBatalha() {
        return scanner.nextLine();
    }

    public static void realizarOpcaoBatalha() {
        String res = escolherOpcaoBatalha();
        switch (res) {
            case "1":
                System.out.println("Personagem atacou!");
                break;
            case "2":
                System.out.println("Personagem usou habilidade!");
                break;
            case "3":
                System.out.println("Personagem usou item!");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
                mostrarMenuBatalha();
                realizarOpcaoBatalha();
                break;
        }
    }

    public static void batalha() {
        System.out.println("O que você faz?");
        mostrarMenuBatalha();
        realizarOpcaoBatalha();
    }

    public static void main(String[] args) {
        String nomeEscolhido = criarNomePersonagem();
        String classeEscolhida = criarClassePersonagem();
        ClassePersonagem novoPersonagem = criarPersonagem(classeEscolhida, nomeEscolhido);

        List<ClassePersonagem> Party = new ArrayList<>();
        List<ClassePersonagem> PartyInimiga = new ArrayList<>();

        // Adiciona o personagem criado à lista Party
        Party.add(novoPersonagem);
        PartyInimiga.add(new ClassePersonagem(0, 0, 0, 0, 0, 0, 0, nomeEscolhido));

        System.out.println("Você acorda em uma floresta... dois goblins olham para você com maldade. Uma batalha se inicia!");
        batalha();
    }
}
