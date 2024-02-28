import java.util.ArrayList;

public class Baralho {
  ArrayList<Carta> baralho = new ArrayList<Carta>();
  String[] naipes = { "OURO", "PAUS", "ESPADA", "COPAS", "CORINGA" };
  String[] nomes = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

  public Baralho() {
    for (String np : naipes) {
      if (np == "CORINGA") {
        for (int i = 0; i < 4; i++) {
          Carta coringa = new Carta("CORINGA", np);
          baralho.add(coringa);
        }
      } else {
        for (String no : nomes) {
          Carta carta = new Carta(no, np);
          baralho.add(carta);
        }
      }

    }
  }

  // # Embaralha utilizando o Collections.shuffle(ArrayList<Carta>)
  // public void embaralhar() {
  // Collections.shuffle(baralho);

  // for (int i = 0; i < baralho.size(); i++) {
  // System.out.println("-------------");
  // System.out.println("CARTA: " + baralho.get(i).nome);
  // System.out.println("NAIPE: " + baralho.get(i).naipe);
  // System.out.println("_____________");
  // }
  // }

  public ArrayList<Carta> embaralhar() {
    ArrayList<Carta> bEmbaralhado = new ArrayList<Carta>();

    while (baralho.size() != 0) {
      int bIndex = (int) (Math.random() * (baralho.size()));
      bEmbaralhado.add(baralho.get(bIndex));
      baralho.remove(baralho.get(bIndex));
    }

    return bEmbaralhado;
  }

  public Carta distribuirCarta() {
    if (baralho.size() != 0 && !baralho.isEmpty()) {

      Carta carta = baralho.getFirst();

      System.out.println("CARTA: " + carta.nome);
      System.out.println("NAIPE: " + carta.naipe);
      return carta;
    } else {
      return null;
    }
  }

  public Boolean hasCarta() {
    if (baralho.size() != 0) {
      return true;
    } else {
      return false;
    }
  }

  public void imprimirBaralho() {
    for (int i = 0; i < baralho.size(); i++) {
      System.out.println("-------------");
      System.out.println("CARTA: " + baralho.get(i).nome);
      System.out.println("NAIPE: " + baralho.get(i).naipe);
      System.out.println("_____________");
    }

    System.out.println(baralho.size());
  }
}
