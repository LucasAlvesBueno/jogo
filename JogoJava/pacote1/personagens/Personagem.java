package pacote1.personagens;

public class Personagem{


String nome;
int nivel;
int vida;
int forca;
int poder;
int folego;
int mana;
int armadura;
int resMgc;
String classe;

public Personagem(String nome, int nivel, int vida, int forca, int poder, int folego, int mana, int armadura, int resMgc,String classe){

this.nome = nome;
this.nivel = nivel;
this.vida = vida;
this.forca = forca;
this.poder = poder;
this.folego = folego;
this.mana = mana;
this.armadura = armadura;
this.resMgc = resMgc;
this.classe = classe;

}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getNivel() {
    return nivel;
}

public void setNivel(int nivel) {
    this.nivel = nivel;
}

public int getVida() {
    return vida;
}

public void setVida(int vida) {
    this.vida = vida;
}

public int getForca() {
    return forca;
}

public void setForca(int forca) {
    this.forca = forca;
}

public int getPoder() {
    return poder;
}

public void setPoder(int poder) {
    this.poder = poder;
}

public int getFolego() {
    return folego;
}

public void setFolego(int folego) {
    this.folego = folego;
}

public int getMana() {
    return mana;
}

public void setMana(int mana) {
    this.mana = mana;
}

public int getArmadura() {
    return armadura;
}

public void setArmadura(int armadura) {
    this.armadura = armadura;
}

public int getResMgc() {
    return resMgc;
}

public void setResMgc(int resMgc) {
    this.resMgc = resMgc;
}

public String getClasse(){

    return classe;
}
public void setClasse(){

    this.classe = classe;

}

public int levarDanoFisico(Personagem atacante,Personagem atacado){

int receberDano = atacado.armadura - atacante.forca;
int danoAplicado = atacado.vida - receberDano;

return danoAplicado;

}

public int causarDanoFisico(Personagem atacante, Personagem atacado){


int aplicarDano = atacante.forca - atacado.armadura;

int danoAplicado = atacado.vida - aplicarDano;

return danoAplicado;


}




}


