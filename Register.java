import java.util.ArrayList;

public class Register {
    ArrayList<Medlem> medlemmar = new ArrayList<>();

    public void laggTillMedlem(Medlem medlem) {
        medlemmar.add(medlem);
    }
}
