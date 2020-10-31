package ah;

public class MyNumber {

  private static final String[] LES_UNITES = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
  private static final String[] LES_DIZAINES = { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy",
      "eighty", "ninety" };
  private static final String[] ENTRE_10_ET_20 = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
      "seventeen", "eighteen", "nineteen" };
  private int centaine;
  private int dizaine;
  private int unite;

  public MyNumber(int input) {
    this.centaine = extractCentaine(input);
    this.dizaine = extractDizaine(input);
    this.unite = extractUnite(input);
  }

  private int extractUnite(int input) {
    return input % 10;
  }

  private int extractDizaine(int input) {
    return (input - unite) % 100 / 10;
  }

  private int extractCentaine(int input) {
    return (input - dizaine - unite) / 100;
  }

  public String toLetters() {
    if (centaine == 0 && dizaine == 0 && unite == 0) {
      return "zero";
    }

    String centaineLabel = centaine > 0 ? (writeCentaine()) : "";

    String dizaineUniteLabel;
    int dizaineUnite = dizaine * 10 + unite;
    if (dizaineUnite > 10 && dizaineUnite < 20) {
      dizaineUniteLabel = ENTRE_10_ET_20[unite - 1];
    } else {
      String dizaineLabel = (dizaine > 0 ? (writeDizaine()) : "");
      String uniteLabel = writeUnite();
      dizaineUniteLabel = dizaineLabel + (dizaine > 0 && unite > 0 ? " " : "") + uniteLabel;
    }

    return centaineLabel + (centaine > 0 && !dizaineUniteLabel.isBlank() ? " and " : "") + dizaineUniteLabel;
  }

  private String writeUnite() {
    return unite > 0 ? LES_UNITES[unite - 1] : "";
  }

  private String writeDizaine() {
    return LES_DIZAINES[dizaine - 1];
  }

  private String writeCentaine() {
    return LES_UNITES[centaine - 1] + " hundred";
  }

}
