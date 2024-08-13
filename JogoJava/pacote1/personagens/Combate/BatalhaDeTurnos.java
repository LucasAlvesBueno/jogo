
package pacote1.personagens.Combate;

import java.util.Scanner;

import pacote1.personagens.Atirador;
import pacote1.personagens.Guerreiro;
import pacote1.personagens.Mago;
import pacote1.personagens.Tank;
import pacote1.personagens.Personagem;


public class BatalhaDeTurnos{

public static void opcoesBatalha(){

    System.out.println("1 - Atacar\n\n2 - Itens\n\n3 - Habilidades\n\n4 - Dialogar");
    

}
public static void horaDeEscolherBatalha(){

    Scanner scanner = new Scanner(System.in);

    String res = scanner.nextLine();
    switch(res){

        case "1":
        System.out.println("Atacou!");
        break;
        case "2":
        System.out.println("Abriu mochila!");
        break;
        case "3":
        System.out.println("usou uma Habilidade");
        break;
        case "4":
        System.out.println("Tentou dialogar");
        default : 
        System.out.println("Opção Inválida...");
        horaDeEscolherBatalha();
        break;




    }


}

public static void batalha(){


boolean turnoHeroi = true;

if(turnoHeroi){

    



}



}





}