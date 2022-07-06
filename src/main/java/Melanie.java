public class Melanie {

    public String backePizza() throws OfenKaputtException {
        System.out.println("Melanie: ich backe");
        String pizza = imOfen();
        return pizza;
    }

    private String imOfen() throws OfenKaputtException {
        throw new OfenKaputtException("Kurzschluss");
    }
}
