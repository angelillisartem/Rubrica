public class Contatto extends Rubrica{
    private String nome;
    private String cognome;
    private String numero;

    public Contatto(String nome, String cognome, String numero) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCognome() {
        return this.cognome;
    }
    public String getNumero() {
        return this.numero;
    }
    public String toString(){
        return this.nome+" "+this.cognome+": "+this.numero;
    }
}
