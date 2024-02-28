public class Carta {

  String nome;
  String naipe;

  public Carta(String nome, String naipe) {
    this.nome = nome;
    this.naipe = naipe;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNaipe() {
    return this.naipe;
  }

  public void setNaipe(String naipe) {
    this.naipe = naipe;
  }
}
