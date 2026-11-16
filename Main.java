public class Main {
    public static void main(String[] args) {
        Register register = new Register();

        Medlem medlem = new Medlem("Emil", 12345);

        register.laggTillMedlem(medlem);

        System.out.println("Namn: " + medlem.namn);
        System.out.println("Medlemsnummer: " + medlem.medlemsnummer);
    }
}
