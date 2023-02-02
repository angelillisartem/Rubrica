import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList dati = new ArrayList();

        Contatto rossi = new Contatto("Mario", "Rossi", "Cellulare");
        rossi.getNome();
        rossi.getCognome();
        rossi.getNumero();

        dati.add(rossi);

        System.out.println("\n");
        ((Contatto)dati.get(0)).getNome();
        ((Contatto)dati.get(0)).getCognome();
        ((Contatto)dati.get(0)).getNumero();
    }
}