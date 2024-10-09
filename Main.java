import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import pacote.Guerreiro;
import pacote.Mago;
import pacote.Tank;
import pacote.Atirador;
import pacote.ClassePersonagem;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

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

    public static String escolherOpcaoBatalha2(List<ClassePersonagem> partyInimiga) {
        System.out.println("Escolha o alvo que deseja atacar:");

        // Exibe os alvos disponíveis (inimigos)
        for (int i = 0; i < partyInimiga.size(); i++) {
            System.out.println((i + 1) + " - " + partyInimiga.get(i).getNome());
        }

        // Recebe a escolha do usuário
        int escolha = scanner.nextInt();

        // Validação da escolha
        while (escolha < 1 || escolha > partyInimiga.size()) {
            System.out.println("Opção inválida! Escolha novamente.");
            escolha = scanner.nextInt();
        }

        // Retorna o nome do personagem escolhido
        return partyInimiga.get(escolha - 1).getNome();
    }

    public static void realizarOpcaoBatalha(List<ClassePersonagem> partyInimiga) {
        String res = escolherOpcaoBatalha();
        switch (res) {
            case "1":
                String alvo = escolherOpcaoBatalha2(partyInimiga);
                System.out.println("Você atacou " + alvo + "!");
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
                realizarOpcaoBatalha(partyInimiga);
                break;
        }
    }

    public static void atacarHeroi(List<ClassePersonagem> partyHeroi) {
        // Escolhe um herói aleatoriamente
        int alvoIndex = random.nextInt(partyHeroi.size());
        ClassePersonagem alvo = partyHeroi.get(alvoIndex);
        
        System.out.println("O inimigo atacou " + alvo.getNome() + "!");
        // Aqui você pode adicionar lógica para calcular dano e atualizar a vida do herói
    }

    public static void batalhaHeroi(List<ClassePersonagem> partyInimiga, List<ClassePersonagem> partyHeroi) {
        System.out.println("O que você faz?");
        mostrarMenuBatalha();
        realizarOpcaoBatalha(partyInimiga);
        // Após o ataque do herói, o inimigo ataca
        atacarHeroi(partyHeroi);
    }

    public static void main(String[] args) {
        String nomeEscolhido = criarNomePersonagem();
        String classeEscolhida = criarClassePersonagem();
        ClassePersonagem novoPersonagem = criarPersonagem(classeEscolhida, nomeEscolhido);

        boolean turnoDoHeroi = true;

        List<ClassePersonagem> Party = new ArrayList<>();
        List<ClassePersonagem> PartyInimiga = new ArrayList<>();

        // Adiciona o personagem criado à lista Party
        Party.add(novoPersonagem);
        PartyInimiga.add(new Goblin(0, 0, 0, 0, 0, 0, 0, "Goblin 1")); // Nome do goblin definido

        System.out.println("Você acorda em uma floresta... dois goblins olham para você com maldade. Uma batalha se inicia!");

        while (true) {
            if (turnoDoHeroi) {
                batalhaHeroi(PartyInimiga, Party);
                turnoDoHeroi = false;
            } else {
                // Aqui você pode adicionar a lógica para o turno do inimigo, se necessário
                turnoDoHeroi = true;
            }

            // Para encerrar o loop quando um lado for derrotado
            // Adicione a lógica para verificar se todos os heróis ou inimigos foram derrotados
        }
    }
}
