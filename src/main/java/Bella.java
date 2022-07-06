public class Bella {

    public static void main(String[] args) {
        System.out.println("Bella: Ich habe hunger");
        String mittagessen;
        try {
            mittagessen = new Toni().holePizza();
        } catch (OfenKaputtException e) {
            mittagessen = "Dosenravioli";
        }
        System.out.println("Bella: Ich esse die " + mittagessen);
    }
}
