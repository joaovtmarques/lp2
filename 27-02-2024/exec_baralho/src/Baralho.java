import java.util.ArrayList;

public class Baralho {
  ArrayList<Carta> baralho = new ArrayList<Carta>();
  String[] naipes = { "OURO", "PAUS", "ESPADA", "COPAS" };
  String[] nomes = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

  public Baralho() {
    for (String np : naipes) {
      for (String no : nomes) {
        Carta carta = new Carta(no, np);
        baralho.add(carta);
      }
    }
  }

  public void mostrarBaralho() {
    for (int i = 0; i < baralho.size(); i++) {
      System.out.println(baralho.get(i).nome);
      System.out.println(baralho.get(i).naipe);
    }

    System.out.println(baralho.size());
  }
}
